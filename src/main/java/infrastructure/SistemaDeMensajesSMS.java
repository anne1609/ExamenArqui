package infrastructure;

import domain.SistemaDeMensajesInterface;

public class SistemaDeMensajesSMS implements SistemaDeMensajesInterface {
    public void enviarMensaje(String destinatario, String mensaje){
        System.out.println("Mensaje a"+ destinatario + mensaje );
    }

}
