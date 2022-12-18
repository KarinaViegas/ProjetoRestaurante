package businessobject;

import java.math.BigDecimal;

public class PagamentoDinheiro implements MetodoPagamento{

    private boolean statusPagamento;
    private String infoPagamento;

    public PagamentoDinheiro() {}

    @Override
    public MetodoPagamento pagar(BigDecimal valorTotal, BigDecimal valorPago) {
        BigDecimal troco = valorPago.subtract(valorTotal);
        if(troco.compareTo(BigDecimal.ZERO) == 0){
            this.statusPagamento = true;
            this.infoPagamento = "Pagamento dinheiro realizado com sucesso";
        }else if(troco.compareTo(BigDecimal.ZERO)>0){
            statusPagamento = true;
            infoPagamento = "Pagamento realizado com sucesso, seu troco é de R$"+troco;
        }else {
            statusPagamento = false;
            infoPagamento = "Pagamento não finalizado, realize o pagamento completo da conta no valor de R$"+valorTotal;
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
