package aplication;

import domain.SistemaDePagoInterface;

public class ProcesarPago {
    private final SistemaDePagoInterface servicioDePago;

    public ProcesarPago(SistemaDePagoInterface servicioDePago) {
        this.servicioDePago = servicioDePago;
    }

    public boolean procesarPago(String numeroTarjeta, int cvv, String fechaExpiracion, String claveSolicitud) {
        return servicioDePago.procesarPago(numeroTarjeta, cvv, fechaExpiracion, claveSolicitud);
    }

}
