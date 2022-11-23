import businessobject.Caixa;
import businessobject.Cardapio;
import businessobject.Mesa;
import businessobject.PagamentoDebitoCredito;
import modelo.Garcom;

import java.math.BigDecimal;

public class MenuDinamico {


    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();
        cardapio.imprimir();


        Garcom garcom1 = new Garcom("Jão" , "2414" , 0.0);

        Mesa mesa1 = new Mesa(1 , garcom1 , false);
        mesa1.addPedidos(cardapio.recuperarItemId(5));
        mesa1.addPedidos(cardapio.recuperarItemId(1));
        mesa1.removerItem(cardapio.recuperarItemId(1));
        Caixa.imprimirConta(mesa1);
        PagamentoDebitoCredito debito = new PagamentoDebitoCredito();
        Caixa.realizarPagamento(mesa1, debito, new BigDecimal("99.0") );
        System.out.println(mesa1);


    }







}
