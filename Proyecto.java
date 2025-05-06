//objetivo: modelar una clase que represente los proyectos activos de los clientes
//con sus respectivos ATRIBUTOS y COMPORTAMIENTOS.

public class Proyecto {
// atributos, caracteristicas de los proyectos
    private String nombre;
    private String cliente;
    private int duracionSemanas;
    private boolean estaActivo;

    //static
    public static int totalProyectos = 0;

    // final contante: nombre del sistema
    public static final String NOMBRE_SISTEMA = "GestorProyectos v1.0";

    //constructor
    public Proyecto(String nombre, String cliente, int duracionSemanas, boolean estaActivo) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.duracionSemanas = duracionSemanas;
        this.estaActivo = estaActivo;
        totalProyectos++; //aumenta cada vez que creamos un proyecto
    }

        // metodo para mostrar la informacion
        public void mostrarInformacion(){
            System.out.println("\uD83D\uDCC1 Proyecto: "+nombre);
            System.out.println("\uD83D\uDC71\uD83C\uDFFC Cliente: "+cliente);
            System.out.println("⏱\uFE0F Duración: "+duracionSemanas);
            System.out.println("❔¿Está activo?: "+(estaActivo?"Si":"No"));
        }
        //Metodo para marcar el proyecto inactivo
        public void cerrarProyecto() {
            estaActivo=false;
            System.out.println("El proyecto: "+nombre+", se ha cerrado");

        }
    }

