public class Asiento {
    private final String fila; //letras "a","b"
    private final int numero; //numero 12 ejemplo
    private boolean reservado; //estado
    private Pasajero pasajero; // atributo pasajero

    // constructor
    public Asiento(String fila, int numero) {
        if (!fila.matches("[A-Z]{1,2}"))// Valida 1 o 2 letras mayusculas
            throw new IllegalArgumentException("Fila inválida. Debe ser 1 o 2 letras (A-Z)");

        if (numero <= 0 || numero > 50) {//limite de 50 asientos por fila
            throw new IllegalArgumentException("Número de asiento inválido(1-50)");
        }
        this.fila = fila;
        this.numero = numero;
        this.reservado=false;// por defecto no se reserva
        this.pasajero=null;// por defecto no hay pasajero al inciar
    }
    //-- Getters --

    public String getFila(){
        return fila;
    }
    public int getNumero(){
        return numero;
    }
    //como el siguiente es boleano se utiliza "is" en lugar de "get"
    public boolean isReservado(){
        return reservado;
    }
    // metodo para obtener pasajero
    public Pasajero getPasajero(){
        return pasajero;
    }

    //---Setters de modificacion----
    // los setters llevan void porque no devuelve el parametro
    public void reservar(Pasajero pasajero){
        this.reservado = true;
        this.pasajero = pasajero;// se modifica el atributo "reservado" que inicialmente es false
    }
    public void cancelarReserva(){
        this.reservado=false; //si reservado es falso, entonces se cancela la reserva
    }

    //representacion del asiento
    @Override //para sobrescribir el meto toString
    public String toString(){
        return pasajero != null
        ? String.format("%s%d(%s)", fila,numero, pasajero.getNombre())
                :String.format ("%s%d(Disponible)",fila,numero);
    }
}
