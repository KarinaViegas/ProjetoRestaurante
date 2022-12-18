package testes;

import businessobject.Caixa;
import businessobject.Cardapio;
import businessobject.Mesa;
import modelo.Garcom;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class tests {
    @Test
    public void calcularValorTotalContaTest(){

        Cardapio cardapio = new Cardapio();
        Garcom garcom1 = new Garcom("Jão" , "2414" , 0.0);
        Mesa mesa1 = new Mesa(1 , garcom1);
        mesa1.addPedidos(cardapio.recuperarItemId(5));
        Caixa.fecharConta(mesa1);
        BigDecimal valorTotal = mesa1.getValorTotalConta();


        //---------
        assertEquals(new BigDecimal("99.00"), valorTotal);
    }

    @Test
    public void addPedidoTest(){
        Cardapio cardapio = new Cardapio();
        Garcom garcom1 = new Garcom("Jão" , "2414" , 0.0);
        Mesa mesa1 = new Mesa(1 , garcom1);
        mesa1.addPedidos(cardapio.recuperarItemId(5));

        assertEquals(1, mesa1.getListaDePedidos().size());
    }
}
