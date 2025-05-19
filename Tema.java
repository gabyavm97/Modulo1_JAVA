import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;

public class Tema implements Comparable<Tema>{
    String titulo;
    int prioridad;

    public Tema(String titulo,int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }
    //orden natural

    @Override
    public int compareTo(Tema otra) {
        return this.titulo.compareTo(otra.titulo);
    }

    @Override
    public String toString() {
        return "Titulo de clase: " + titulo + " | Prioridad: " + prioridad;
    }

}

