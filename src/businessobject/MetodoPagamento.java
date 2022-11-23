package businessobject;

import java.math.BigDecimal;

public interface MetodoPagamento {

    public default boolean isStatusPagamento() {
        return false;
    }

    public default void setStatusPagamento(boolean statusPagamento) {
    }

    public default String getInfoPagamento() {
        return null;
    }

    public default void setInfoPagamento(String infoPagamento) {
    }

    default MetodoPagamento pagar(BigDecimal valorTotal , BigDecimal valorPago){
        return this;
    }
}
