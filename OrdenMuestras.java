import java.util.*;

public class OrdenMuestras {
    public static void main(String[] args) {
        List<String> muestrasRecibidas = new ArrayList<>();
        muestrasRecibidas.add("Homo sapiens");
        muestrasRecibidas.add("Mus musculus");
        muestrasRecibidas.add("Arabidopsis thaliana");
        muestrasRecibidas.add("Homo sapiens");

        System.out.println("📋 Orden de llegada de muestras:");
        for (String muestra : muestrasRecibidas) {
            System.out.println("- " + muestra);
        }


        Set<String> especiesUnicas = new HashSet<>(muestrasRecibidas);

        System.out.println("\n✅ Especies únicas con muestra:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }


        Map<String, String> identificadorInvestigador = new HashMap<>();
        identificadorInvestigador.put("M-001", "Dra. Lopez");
        identificadorInvestigador.put("M-002", "Dr. Hernandez");
        identificadorInvestigador.put("M-003", "Dra. Martinez");
        identificadorInvestigador.put("M-004", "Dra. Lopez");

        System.out.println("\n📇 Identificador e investigador asociado (Código -> Investigador):");
        for (Map.Entry<String, String> entrada : identificadorInvestigador.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        // Búsqueda por ID de muestra
        String codigoBuscado = "M-002";
        System.out.println("\n🔍 Resultado de búsqueda para " + codigoBuscado + ": " +
                identificadorInvestigador.getOrDefault(codigoBuscado, "No encontrado"));
    }
}