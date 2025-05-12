public class NotificacionEmail extends Notificacion {
    String destinatario; // usamos extends para establecer la herencia

    public NotificacionEmail (String mensaje, String destinatario){
        super (mensaje); //llamamos al constructor de la clase base utilizando super
        this.destinatario = destinatario;
    }
    public void enviarEmail(){
        System.out.println("Enviando email a :"+destinatario+":"+mensaje);
    }
}
