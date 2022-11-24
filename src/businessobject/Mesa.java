package businessobject;

import modelo.Garcom;
import modelo.Item;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private Integer numero;

    private Garcom garcom;

    private boolean mesaPaga;

    private List<Item> listaDePedidos = new ArrayList<>();

    public Mesa(Integer numero, Garcom garcom) {
        this.numero = numero;
        this.garcom = garcom;
        this.mesaPaga = false;

    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public boolean isMesaPaga() {
        return mesaPaga;
    }

    public void setMesaPaga(boolean mesaPaga) {
        this.mesaPaga = mesaPaga;
    }

    public List<Item> getListaDePedidos() {
        return listaDePedidos;
    }

    public void setListaDePedidos(List<Item> listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }

    public void addPedidos(Item itemParaAdicionar){
        listaDePedidos.add(itemParaAdicionar);
        mesaPaga = false;
    }

    public void removerItem(Item itemParaRemover){
        listaDePedidos.remove(itemParaRemover);
    }

    public void limparMesa(){
        if(mesaPaga == true){
            listaDePedidos = new ArrayList<>();
            setGarcom(null);
            mesaPaga = false;
        } else {
            System.out.println("Você só pode limpar mesa depois que ela for paga.");
        }
    }

    @Override
    public String toString() {
        return "businessobject.Mesa{" +
                "numero=" + numero +
                ", garcom=" + garcom +
                ", mesaPaga=" + mesaPaga +
                ", listaDePedidos=" + listaDePedidos +
                '}';
    }
}
