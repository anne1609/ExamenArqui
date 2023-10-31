package infrastructure;

import domain.SistemaDePagoInterface;

import java.util.Random;

public class SistemaDePago implements SistemaDePagoInterface {
    @Override
    public String generarIntentoDePago(String tokenLocal, int codigoProducto, double montoADebitar) {
        return String.valueOf(new Random().nextInt(1000));
    }

    @Override
    public boolean procesarPago(String numeroTarjeta, int cvv, String fechaExpiracion, String claveSolicitud) {
        int claveSolicitudNumero = Integer.parseInt(claveSolicitud);
        return claveSolicitudNumero % 2 == 0;
    }
}
