package businessobject;

import modelo.Item;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Stream;

public class Caixa {

    public static void realizarPagamento(Mesa mesa, MetodoPagamento metodoPagamento, BigDecimal valorPago) throws IOException {
        fecharConta(mesa);
        metodoPagamento = metodoPagamento.pagar(mesa.getValorTotalConta(), valorPago);

        if(metodoPagamento.isStatusPagamento()==true){
            mesa.setMesaPaga(true);
            mesa.limparMesa();
        }
        System.out.println(metodoPagamento.getInfoPagamento());
    }

    public static void fecharConta(Mesa mesa){
        //BigDecimal totalDaMesa = BigDecimal.ZERO;
        //Stream<Item> itensDoPedidoStream = mesa.getListaDePedidos().stream();
        mesa.setDataHoraFechamento(LocalDateTime.now());
        mesa.setMinutes(ChronoUnit.MINUTES.between(mesa.getDataHoraAbertura(), mesa.getDataHoraFechamento()));
        mesa.setTempoPermanencia(Duration.ofMinutes(mesa.getMinutes()));
        mesa.setTotalPedidos(mesa.getListaDePedidos().stream().count());
        mesa.setValorTotalConta(mesa.getListaDePedidos().stream().map(Item::getPreco).reduce(BigDecimal.ZERO, BigDecimal::add));
        //soma da lista usando for
//        BigDecimal totalDaMesa = new BigDecimal("0.0");
//        System.out.println("Itens consumidos da mesa");
//        for (Item item: itensDoPedido){
//            System.out.println(item);
//            totalDaMesa = totalDaMesa.add(item.getPreco());
//        }
    }

    public static void imprimirConta(Mesa mesa){
        Caixa.fecharConta(mesa);
        System.out.println("Mesa número = " + mesa.getNumero());
        System.out.println("Hora de Fechamento : " + mesa.getDataHoraFechamento().format(mesa.getFormatoDataHora()));
        System.out.println("Tempo de permanência : "+ mesa.getTempoPermanencia() );
        System.out.println("Itens consumidos da mesa");

        System.out.println(mesa.getTotalPedidos() + " itens pedidos");
        System.out.println("_______________________________________________");
        System.out.printf("O valor total da mesa foi de R$%s reais", mesa.getValorTotalConta());
        System.out.println();
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println();
    }

    public static void parcialConta(Mesa mesa){
        List<Item> itensDoPedido = mesa.getListaDePedidos();
        BigDecimal totalDaMesa = new BigDecimal("0.0");
        mesa.setTotalPedidos(mesa.getListaDePedidos().stream().count());
        System.out.println("Mesa número = " + mesa.getNumero());
        System.out.println("Itens consumidos da mesa");
        for (Item item: itensDoPedido){
            System.out.println(item);
            totalDaMesa = totalDaMesa.add(item.getPreco());
        }
        System.out.println(mesa.getTotalPedidos() + " itens pedidos");
        System.out.println("_______________________________________________");
        System.out.printf("O valor parcial da mesa foi de R$%s reais", totalDaMesa);
        System.out.println();
        System.out.println("_______________________________________________");
        System.out.println();
    }
}
