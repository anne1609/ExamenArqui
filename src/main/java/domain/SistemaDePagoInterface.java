package domain;

public interface SistemaDePagoInterface {
    String generarIntentoDePago(String tokenLocal, int codigoProducto, double montoADebitar);
    boolean procesarPago(String numeroTarjeta, int cvv, String fechaExpiracion, String claveSolicitud);
}
