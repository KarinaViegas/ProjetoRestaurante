package businessobject;

import modelo.Garcom;
import modelo.Item;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class Mesa {

    private Integer numero;

    private Garcom garcom;

    private boolean mesaPaga;

    private List<Item> listaDePedidos = new ArrayList<>();

    private LocalDateTime dataHoraAbertura;

    private LocalDateTime dataHoraFechamento;

    private long minutes ;

    private Duration tempoPermanencia ;

    private DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private long totalPedidos ;



    private BigDecimal valorTotalConta;

    public Mesa(Integer numero, Garcom garcom) {
        this.numero = numero;
        this.garcom = garcom;
        this.mesaPaga = false;
        this.dataHoraAbertura = LocalDateTime.now();

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

    public LocalDateTime getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public void setDataHoraAbertura(LocalDateTime dataHoraAbertura) {
        this.dataHoraAbertura = dataHoraAbertura;
    }

    public LocalDateTime getDataHoraFechamento() {
        return dataHoraFechamento;
    }

    public Duration getTempoPermanencia() {
        return tempoPermanencia;
    }

    public void setTempoPermanencia(Duration tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
    }

    public long getMinutes() {
        return minutes;
    }

    public void setMinutes(long minutes) {
        this.minutes = minutes;
    }

    public void setDataHoraFechamento(LocalDateTime dataHoraFechamento) {
        this.dataHoraFechamento = dataHoraFechamento;
    }

    public DateTimeFormatter getFormatoDataHora() {
        return formatoDataHora;
    }

    public long getTotalPedidos() {
        return totalPedidos;
    }

    public void setTotalPedidos(long totalPedidos) {
        this.totalPedidos = totalPedidos;
    }

    public BigDecimal getValorTotalConta() {
        return valorTotalConta;
    }

    public void setValorTotalConta(BigDecimal valorTotalConta) {
        this.valorTotalConta = valorTotalConta;
    }

    public void addPedidos(Item itemParaAdicionar){
        listaDePedidos.add(itemParaAdicionar);
        mesaPaga = false;
    }

    public void removerItem(Item itemParaRemover){
        listaDePedidos.remove(itemParaRemover);
    }

    public void limparMesa() throws IOException {
        if(mesaPaga){
            File file = new File("mesas.txt");
            var writer = new PrintWriter(new FileWriter(file,true), true);
            writer.println(this);
            writer.close();
            listaDePedidos = new ArrayList<>();
            setGarcom(null);
            mesaPaga = false;
        } else {
            System.out.println("Você só pode limpar mesa depois que ela for paga.");
        }
    }

    @Override
    public String toString() {
        return "{" +
                "DataHoraAbertura=" + dataHoraAbertura.format(formatoDataHora) +
                ", numero=" + numero +
                ", garcom=" + garcom +
                ", mesaPaga=" + mesaPaga +
                ", listaDePedidos=" + listaDePedidos +
                ", dataHoraFechamento=" + dataHoraFechamento.format(formatoDataHora) +
                ", tempoPermanencia=" + tempoPermanencia +
                ", Valor Total da Mesa= " + valorTotalConta +
                '}';
    }
}
