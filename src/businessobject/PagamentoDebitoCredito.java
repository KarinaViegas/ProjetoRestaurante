package businessobject;

import java.math.BigDecimal;

public class PagamentoDebitoCredito implements MetodoPagamento{


    private boolean statusPagamento;
    private String infoPagamento;

    public PagamentoDebitoCredito() {}

    @Override
    public MetodoPagamento pagar(BigDecimal valorTotal, BigDecimal valorPago) {
        BigDecimal valorRestante = valorPago.subtract(valorTotal);
        if(valorRestante.compareTo(BigDecimal.ZERO) == 0){
            this.statusPagamento = true;
            this.infoPagamento = "Pagamento realizado com sucesso";
        }else if(valorRestante.compareTo(BigDecimal.ZERO) < 0){
            valorRestante.multiply(new BigDecimal(-1));
            statusPagamento = false;
            infoPagamento = "Falta pagar R$ "+valorRestante+" reais, passe o valor exato para o pagamento";
        }
        return this;
    }

    public boolean isStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getInfoPagamento() {
        return infoPagamento;
    }

    public void setInfoPagamento(String infoPagamento) {
        this.infoPagamento = infoPagamento;
    }
}
