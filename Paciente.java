
public class Paciente {
    //adicion de valores o atributos
    String nombre;
    Integer edad;
    String expediente;

    //metodo mostrar informacion
    public void mostrarInformacion() {
        System.out.println("Paciente:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Expediente:" + expediente);

        //objeto paciento nuevo
        Paciente paciente1 = new Paciente();
        mostrarInformacion();
    }
}
