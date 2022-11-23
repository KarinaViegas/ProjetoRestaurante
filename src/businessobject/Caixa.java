package businessobject;

import modelo.Item;

import java.math.BigDecimal;
import java.util.List;

public class Caixa {

    public static void realizarPagamento(Mesa mesa, MetodoPagamento metodoPagamento, BigDecimal valorPago){
        BigDecimal valorTotal = fecharConta(mesa);
        metodoPagamento = metodoPagamento.pagar(valorTotal, valorPago);

       // metodo de pagamento vai receber (o valor total e o valor pago) ooooook
        if(metodoPagamento.isStatusPagamento()==true){
            mesa.setMesaPaga(true);
            mesa.limparMesa();
        }else{
            System.out.println(metodoPagamento.getInfoPagamento());
        }


    }

    public static BigDecimal fecharConta(Mesa mesa){
        BigDecimal totalDaMesa = BigDecimal.ZERO;
        List<Item> itensDoPedido = mesa.getListaDePedidos();
        for (Item item: itensDoPedido){
            totalDaMesa = totalDaMesa.add(item.getPreco());
        }
        return totalDaMesa;
    }

    public static void imprimirConta(Mesa mesa){
        List<Item> itensDoPedido = mesa.getListaDePedidos();
        BigDecimal totalDaMesa = new BigDecimal("0.0");
        System.out.println("Itens consumidos da mesa");
        for (Item item: itensDoPedido){
            System.out.println(item);
            totalDaMesa = totalDaMesa.add(item.getPreco());
        }
        System.out.printf("O valor total da mesa foi de R$%s reais", totalDaMesa);
        System.out.println();
    }
}
