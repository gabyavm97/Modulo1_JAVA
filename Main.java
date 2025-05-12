public class Main {
    public static void main(String[]args){
        //Vamos a crear diferentes obejtos con distintos metodos

        //constructor por defecto
        Ticketsoporte ticket1 = new Ticketsoporte();
        System.out.println("\nTicket creado con constructor por defecto:");
        ticket1.mostrarInfo();

        //constructor con parametros
        Ticketsoporte ticket2 = new Ticketsoporte("Chicago","Accesos", 1);
        System.out.println("\nTicket creado con constructor de parámetros");
        ticket2.mostrarInfo();

        //Cerrar ticket y mostrar nuevamente
        ticket2.cerrar();
        ticket2.mostrarInfo();

        //constructor copia
        Ticketsoporte ticket3 = new Ticketsoporte(ticket2);
        System.out.println("\nTicket creado con constructor copia");
        ticket3.mostrarInfo();

        // constructor sobrecargado con solo titulo
        Ticketsoporte ticket4 = new Ticketsoporte("Consulta sobre facturación");
        System.out.println("\nTicket con constructor sobrecargado (solo titulo):");
        ticket4.mostrarInfo();
    }
}
