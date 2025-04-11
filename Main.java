import java.util.Scanner; // Clase de Scanner

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Solicitar datos

        System.out.print("Paciente:");
        String nombre =scanner.nextLine();

        System.out.print("Edad:");
        int edad =scanner.nextInt();
        scanner.nextLine();

        System.out.print("Expediente:");
        double expediente =scanner.nextDouble();
        scanner.nextLine();//limpiar el buffer

        //Crear objeto Paciente

        Paciente paciente = new Paciente(nombre,edad,expediente);

        //Mostrar datos usando getters

        System.out.println("\nDatos ingresados:");
        System.out.println("Paciente:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Expediente:" + expediente);

        scanner.close();
    }

}
class Paciente{
    private String nombre;
    private int edad;
    private double expediente;

public Paciente (String nombre, int edad, double expediente){
    this.nombre = nombre;
    this.edad = edad;
    this.expediente = expediente;
}

public String getNombre(){
    return nombre;
}
}