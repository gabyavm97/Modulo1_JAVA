import java.util.Objects;

public class TicketSoporte2 {
    // atributos de instancia
    private String titulo;
    private String categoria;
    private int prioridad; // 1. alta, 2.media, 3.baja
    private boolean estaActivo;

    //constructor
    public TicketSoporte2(String titulo, String categoria, int prioridad, boolean estaActivo) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
        this.estaActivo = true; // un ticket está activo por defecto
    }

    //sobreescribimos equals() para comparar contenido
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // == es para mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;
        //si el objeto es nulo, regresa la clase y si el obejto es diferente a la clase del objeto  regrese falso

        TicketSoporte2 otro = (TicketSoporte2) obj;
        return this.titulo.equals(otro.titulo) &&
                this.categoria.equals(otro.categoria) &&
                this.prioridad == otro.prioridad &&
                this.estaActivo == otro.estaActivo;
        //parece un constructor de copia
        // los atributos de uno se transfieren
    }

    //hashCode () compatible con equals()
    @Override
    public int hashCode() {
        return Objects.hash(titulo, categoria, prioridad, estaActivo);
    }

    //sobreescribimos el metodo toString
    @Override
    public String toString() {
        return "TicketSoporte{" +
                "titulo=" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", prioridad=" + prioridad +
                ", estaActivo =" + estaActivo +
                '}';
    }
}