import domain.SistemaDePagoInterface;
import infrastructure.SistemaDePago;
import aplication.IniciarPago;
import aplication.ProcesarPago;

import java.util.Scanner;

public class AppPago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaDePagoInterface servicioDePago = new SistemaDePago();

        IniciarPago iniciarPago = new IniciarPago(servicioDePago);
        ProcesarPago procesarPago = new ProcesarPago(servicioDePago);

        System.out.println("Ingrese el token del local:");
        String tokenLocal = scanner.nextLine();

        System.out.println("Ingrese el código de producto:");
        int codigoProducto = scanner.nextInt();

        System.out.println("Ingrese el monto a debitar:");
        double montoADebitar = scanner.nextDouble();

        String claveSolicitud = iniciarPago.iniciarPago(tokenLocal, codigoProducto, montoADebitar);
        System.out.println("Clave de solicitud generada: " + claveSolicitud);

        System.out.println("Ingrese el número de tarjeta:");
        String numeroTarjeta = scanner.next();

        System.out.println("Ingrese el CVV:");
        int cvv = scanner.nextInt();

        System.out.println("Ingrese la fecha de expiración (MM/YY):");
        String fechaExpiracion = scanner.next();

        boolean estadoPago = procesarPago.procesarPago(numeroTarjeta, cvv, fechaExpiracion, claveSolicitud);

        if (estadoPago) {
            System.out.println("Pago exitoso.");
            // Simular envío de notificaciones (no implementado en esta simulación)
            System.out.println("Notificación al local: Pago realizado exitosamente.");
            System.out.println("SMS al local: Cobro realizado exitosamente.");
            System.out.println("SMS al cliente: Pago exitoso.");
        } else {
            System.out.println("El pago ha fallado.");
        }
    }
}
