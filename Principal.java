import java.time.LocalTime;

public class Principal {
    public static void main (String[]args){
        //crear un pasajero
        Pasajero pasajero1 = new Pasajero("Gabriela","GAVM91072");
        // crear un vuelo
        RetoVuelo vuelo1 = new RetoVuelo("AV456", "Costa Rica", LocalTime.of(16,00));
        // reservar el asiento
        vuelo1.reservarAsiento("A",24,pasajero1);

        // Primera reserva
        System.out.println("Reserva realizada con éxito ✔\uFE0F");
        System.out.println(vuelo1);

        // Cancelar la reserva
        System.out.println("Cancelar reserva\n");
        vuelo1.cancelarReserva();
        System.out.println(vuelo1);

        // reservar un asiento en el vuelo usando nombre y pasaporte
        Pasajero pasajero2 = new Pasajero("Laura", "LAVM92090");
        vuelo1.reservarAsiento("B",12,pasajero2);
        System.out.println(vuelo1);


    }
}
