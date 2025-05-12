public class Main2 {
    public static void main (String[]args){
        // creamos dos tickets con los mismos valores
        TicketSoporte2 t1 = new TicketSoporte2("Error de login", "Accesos", 1, true);
        TicketSoporte2 t2 = new TicketSoporte2("Error de login","Accesos",1, true);

        //comparacion con equals
        System.out.println("Son iguales"+t1.equals(t2)); // true

        //Hash codes
        System.out.println("Hash de t1: "+ t1.hashCode());
        System.out.println("Hash de t2: "+ t2.hashCode());

        //representacion legible de objeto

        System.out.println("Ticket 1: ");
        System.out.println(t1);




    }
}
