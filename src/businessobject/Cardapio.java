package businessobject;

import modelo.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class  Cardapio {

    private List<Item> itensDoCardapio = new ArrayList<>();

    public Cardapio() {
        Entrada caldinho = new Entrada("Caldinho de Feijão" ,  new BigDecimal("16.00") , 1);
        this.itensDoCardapio.add(caldinho);
        Entrada caldinho2 = new Entrada("Caldinho de Camarão" ,  new BigDecimal("18.00") , 2);
        this.itensDoCardapio.add(caldinho2);
        Entrada pasteizinhos = new Entrada("Pasteizinhos Variados, 6und" ,  new BigDecimal("20.00") , 3);
        this.itensDoCardapio.add(pasteizinhos);
        Entrada bolinho = new Entrada("Bolinho de Tofu" ,  new BigDecimal("23.00") , 4);
        this.itensDoCardapio.add(bolinho);


        PratoPrincipal prato1 = new PratoPrincipal("Rubacão c/ carne de sol" ,  new BigDecimal("99.00") , 3 , 5);
        this.itensDoCardapio.add(prato1);
        PratoPrincipal prato2 = new PratoPrincipal("Maminha refeição" , new BigDecimal("105.00") , 4 , 6);
        this.itensDoCardapio.add(prato2);
        PratoPrincipal prato3 = new PratoPrincipal("Moqueca Frutos do Mar" , new BigDecimal("130.00") , 3 , 7);
        this.itensDoCardapio.add(prato3);
        PratoPrincipal prato4 = new PratoPrincipal("Risotto de ervilha e cogumelos" ,  new BigDecimal("85.00") , 2, 8);
        this.itensDoCardapio.add(prato4);


        Sobremesa doce1 = new Sobremesa("Bolo de rolo com sorvete de creme" ,  new BigDecimal("19.00") , 9);
        this.itensDoCardapio.add(doce1);
        Sobremesa doce2 = new Sobremesa("Torre de Carolinhas" ,  new BigDecimal("28.00") , 10);
        this.itensDoCardapio.add(doce2);
        Sobremesa doce3 = new Sobremesa("Pudim de Leite" ,  new BigDecimal("18.00") , 11);
        this.itensDoCardapio.add(doce3);


        Bebidas bebida1 = new Bebidas("Água s/ gás" , new BigDecimal("4.00") , false , 12);
        this.itensDoCardapio.add(bebida1);
        Bebidas bebida2 = new Bebidas("Refrigerante" , new BigDecimal("6.00") , false , 13);
        this.itensDoCardapio.add(bebida2);
        Bebidas bebida3 = new Bebidas("Suco" , new BigDecimal("8.00") , false , 14);
        this.itensDoCardapio.add(bebida3);
        Bebidas bebida4 = new Bebidas("Cerceja" , new BigDecimal("9.00") , true , 15);
        this.itensDoCardapio.add(bebida4);
        Bebidas bebida5 = new Bebidas("Caipirinha" ,  new BigDecimal("14.00") , true , 16);
        this.itensDoCardapio.add(bebida5);


    }

    public void imprimir(){

        System.out.println("########  Cardápio  #######");

        System.out.println("------- Entrada --------");
        imprimirSubItens("Entrada");

        System.out.println("------- Prato Principal --------");
        imprimirSubItens("PratoPrincipal");

        System.out.println("------- Sobremesa --------");
        imprimirSubItens("Sobremesa");

        System.out.println("------- Bebidas --------");
        imprimirSubItens("Bebidas");


    }


    public Item recuperarItemId(Integer id) {
        for (Item item : this.itensDoCardapio) {
            if (item.getId() == id) {
                //System.out.println(item);
                return item;
            }
        }
        return null;
    }


    public void imprimirSubItens(String nomeClasse){
        for (Item item: this.itensDoCardapio){
            if(item.getClass().getSimpleName().equals(nomeClasse)){
                System.out.println(item);
            }
        }
    }






}
