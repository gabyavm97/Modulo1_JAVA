import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Tema> temas= new CopyOnWriteArrayList<>();
        temas.add(new Tema("Historia", 2));
        temas.add(new Tema("Matemáticas", 1));
        temas.add(new Tema("Ciencias Naturales", 3));
        temas.add(new Tema("Matemáticas básicas", 4));
        temas.add(new Tema("Cuidado del medio ambiente", 5));

            System.out.println("📦 Materias ordenadas por orden natural):");
    temas.sort(null);
    for (Tema t: temas)

    {
        System.out.println(t);
    }
        // por prioridad

        System.out.println("\n📊 Temas ordenados por prioridad (1 = alta):");
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b) {
                return Integer.compare(a.prioridad, b.prioridad);
            }
        });
        for (Tema t : temas) {
            System.out.println(t);
        }
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Matemáticas", "https://recursos.edu/mate");
        recursos.put("Historia", "https://recursos.edu/historia");
        recursos.put("Ciencias Naturales", "https://recursos.edu/ciencias");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");

        System.out.println("\n📚 Recursos por tema:");
        recursos.forEach((titulo, recurso) -> {
            System.out.println(titulo + " → " + recurso);
        });
}
}