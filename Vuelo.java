import java.time.LocalTime;

public class Vuelo {
    private static Pasajero pasajero;

    public static void main(String []args){
        //creacion de un vuelo
        RetoVuelo vuelo = new RetoVuelo("AV123","Bogotá", LocalTime.of(14,00));
        // reserva de asiento
        vuelo.reservarAsiento("A",24,pasajero);
        System.out.println(vuelo);

        vuelo.cancelarReserva();
        System.out.println(vuelo.tieneReserva());
    }
}
