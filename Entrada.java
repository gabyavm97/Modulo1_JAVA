import java.util.Scanner;

public class Entrada{

    // atributos
    private String nombreEvento;
    private double precioEntrada;
    public Entrada(String nombreEvento, double precioEntrada){
    this.nombreEvento = nombreEvento;
    this.precioEntrada = precioEntrada;
    }
    public void mostrarInformacion(){
    System.out.println("Evento:"+ nombreEvento +"| Precio $" + precioEntrada);
}
}


