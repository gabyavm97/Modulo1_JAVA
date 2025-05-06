import java.time.LocalTime;

public class RetoVuelo {
    //los atributos de la clase serán
    private final String codigoVuelo; //no cambia despues de crearse
    private String destino;
    private LocalTime horaSalida; //localtime es un tipo de dato que valida automaticamente
    private Asiento asientoReservado;

    //constructor
    public RetoVuelo(String codigoVuelo, String destino, LocalTime horaSalida){
        if(!codigoVuelo.matches("^[A-Z]{2}\\d{3,4}$")){
            throw new IllegalArgumentException("Código de vuelo inválido");
        }
        this.codigoVuelo = codigoVuelo; //asignacion directa final, no se modifica
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado=null; //inicialmente sin asiento
    }
    //---Getters de informacion---
    public String getcodigoVuelo(){
        return codigoVuelo;
    }
    public String getdestino(){
        return destino;
    }
    public LocalTime gethoraSalida(){
        return horaSalida;
    }
    public Asiento getAsientoReservado(){
        return asientoReservado;
    }
    //---Setters --- para modificar informacion
    public void setDestino(String nuevoDestino){
        if (destino != null && !nuevoDestino.isEmpty()){
            //si el string no esta vacio o es nulo se ejecuta el codigo
            this.destino = nuevoDestino; //si eso se cumple, el nuevo destino pasa a destino
        } else {
            throw new IllegalArgumentException("Destino inválido. Intentalo de nuevo");
        }
    } //Metodo Reservar Asiento
    public void reservarAsiento(String fila, int numero, Pasajero pasajero){
        if (fila == null || !fila.matches("[A-Z]")){
            throw new IllegalArgumentException("fila inválida");
        }
        if (numero <= 0 ){
            throw new IllegalArgumentException("numero de asiento invalido");
        }
        this.asientoReservado = new Asiento(fila,numero);
        this.asientoReservado.reservar(pasajero); //asume que asiento tiene este metodo
    }// Metodo Cancelar Reserva
    public void cancelarReserva(){
        if (this.asientoReservado != null){
            this.asientoReservado.cancelarReserva();
            System.out.println("Reserva cancelada...❌"+this.asientoReservado.toString());
            this.asientoReservado=null;
        } else {
            System.out.println("No hay reserva activa para cancelar");
        }
    }
    //
    public String getEstadoAsiento (){
        return asientoReservado != null ? asientoReservado.toString():"Sin reserva";
    }
    public boolean tieneReserva(){
        return asientoReservado != null;
    }
    // metodo to string
    @Override
    public String toString(){
        return String.format(
                "\nItinerario de vuelo:\n"+
                "Código:%s\n"+
                "Destino:%s\n"+
                "Salida:%s\n"+
                "Pasajero:%s\n",
                codigoVuelo,
                destino,
                horaSalida.toString(),
                asientoReservado != null ? asientoReservado.getPasajero().getNombre():"Sin reserva"
        );
    }
}
