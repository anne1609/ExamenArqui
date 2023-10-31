package aplication;

import domain.SistemaDePagoInterface;

public class IniciarPago {
    private final SistemaDePagoInterface servicioDePago;

    public IniciarPago(SistemaDePagoInterface servicioDePago) {
        this.servicioDePago = servicioDePago;
    }
    public String iniciarPago(String tokenLocal, int codigoProducto, double montoADebitar) {
        return servicioDePago.generarIntentoDePago(tokenLocal, codigoProducto, montoADebitar);
    }
}
