import businessobject.*;
import modelo.Garcom;

import java.math.BigDecimal;

public class MenuDinamico {


    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();
        cardapio.imprimir();


        Garcom garcom1 = new Garcom("Jão" , "2414" , 0.0);

//        Mesa mesa1 = new Mesa(1 , garcom1);
//        mesa1.addPedidos(cardapio.recuperarItemId(5));
//        mesa1.addPedidos(cardapio.recuperarItemId(1));
//        mesa1.removerItem(cardapio.recuperarItemId(1));
//        Caixa.imprimirConta(mesa1);
//        PagamentoDinheiro dinheiro = new PagamentoDinheiro();
//        Caixa.realizarPagamento(mesa1, dinheiro, new BigDecimal("90.0") );


//
//        Mesa mesa2 = new Mesa(2 , garcom1);
//        mesa2.addPedidos(cardapio.recuperarItemId(8));
//        mesa2.addPedidos(cardapio.recuperarItemId(2));
//        Caixa.imprimirConta(mesa2);
//        PagamentoDebitoCredito debito = new PagamentoDebitoCredito();
//        Caixa.realizarPagamento(mesa2, debito, new BigDecimal("90.0") );
//        System.out.println(mesa2);
//        Caixa.realizarPagamento(mesa2, debito, new BigDecimal("103.0") );

        Mesa mesa3 = new Mesa(1 , garcom1);
        mesa3.addPedidos(cardapio.recuperarItemId(6));
        mesa3.addPedidos(cardapio.recuperarItemId(2));
        mesa3.addPedidos(cardapio.recuperarItemId(14));
        mesa3.addPedidos(cardapio.recuperarItemId(9));
        Caixa.imprimirConta(mesa3);
        PagamentoDinheiro dinheiro = new PagamentoDinheiro();
        Caixa.realizarPagamento(mesa3, dinheiro, new BigDecimal("90.0") );
        Caixa.realizarPagamento(mesa3, dinheiro, new BigDecimal("190.0") );

    }







}
