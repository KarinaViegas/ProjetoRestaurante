package businessobject;

public class ThreadCardapio implements Runnable{

    @Override
    public void run() {
        Cardapio cardapio = new Cardapio();
        cardapio.imprimir();
    }



}
