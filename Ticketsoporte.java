public class Ticketsoporte {
    // atributos de instancia
    private String titulo;
    private String categoria;
    private int prioridad; // 1. alta, 2.media, 3.baja
    private boolean estaActivo;

    //constructor por defecto
        // asigna valores estandar
    public Ticketsoporte(){
        this.titulo = "Sin titulo";
        this.categoria = "General";
        this.prioridad = 2;
        this.estaActivo= true;
    }
    //constructor con parametros
        // personaliza el objeto desde el inicio
    public Ticketsoporte(String titulo, String categoria, int prioridad) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.estaActivo = true;
    }
    //constructor de copia
        //crea un nuevo objeto a partir de otro existente
    public Ticketsoporte(Ticketsoporte otro){
        this.titulo=otro.titulo;
        this.categoria =otro.categoria;
        this.prioridad=otro.prioridad;
        this.estaActivo =otro.estaActivo;
        }
        //sobrecarga de metodos con solo titulo
    public Ticketsoporte(String titulo){
        this.titulo = titulo;
        this.categoria = "sin categoría";
        this.prioridad =3;//baja
        this.estaActivo=true;
    }
    // Metodo para mostrar la informacion del ticket
    public void mostrarInfo(){
        System.out.println("Ticket: "+titulo);
        System.out.println("Categoría: "+categoria);
        System.out.println("Prioridad: "+prioridad);
        System.out.println("Estado: "+ (estaActivo?"activo":"cerrado"));
    }
    //metodo para cerrar el ticket
    public void cerrar(){
        estaActivo = false;
        System.out.println("\nEl ticket "+titulo+" ha sido cerrado.");
    }
}
