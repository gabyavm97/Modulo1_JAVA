public class Sistema {
    public static void main (String []args) {
        NotificacionEmail email = new NotificacionEmail("Tu pedido ha sido enviado", "ana@correo.com");

        //llamamos a metodos heredados y propios
        email.enviar(); //este es un metodo heredado
        email.enviarEmail(); // metodo propio
    }
}
