import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Set<Double> registrosCPU = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("🚀 Sistema de Monitoreo de CPU - Servidores Financieros");
            System.out.println("Ingrese los valores de consumo de CPU (0-100%) o 'fin' para terminar:");

            while (true) {
                System.out.print("➤ Consumo CPU (%): ");

                double consumo = 0;
                try {
                    String input = scanner.next();

                    // Salir si el usuario escribe 'fin'
                    if (input.equalsIgnoreCase("fin")) {
                        break;
                    }

                    consumo = Double.parseDouble(input);

                    // Validar rango
                    if (consumo < 0 || consumo > 100) {
                        System.out.println("❌ Error: El valor debe estar entre 0% y 100%");
                        continue;
                    }

                    // Validar duplicado
                    if (registrosCPU.contains(consumo)) {
                        System.out.println("⚠ Advertencia: Valor duplicado, ingrese otro valor");
                        continue;
                    }

                    // Verificar consumo crítico
                    if (consumo > 95) {
                        throw new ConsumoCriticoException("🔥 CRÍTICO: CPU al " + consumo + "% - ¡Acción inmediata requerida!");
                    }

                    registrosCPU.add(consumo);
                    System.out.println("✅ Registrado: " + consumo + "%");

                } catch (NumberFormatException e) {
                    System.out.println("❌ Error: Ingrese un valor numérico válido");
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                    registrosCPU.add(consumo); // Registrar igual el valor crítico
                }
            }

            // Mostrar resumen
            System.out.println("\n📊 Resumen de consumos registrados:");
            registrosCPU.forEach(cpu -> System.out.println("- " + cpu + "%"));

        } finally {
            scanner.close();
            System.out.println("\n🔒 Recursos liberados. Monitoreo finalizado.");
        }
    }
}

// Excepción personalizada
class ConsumoCriticoException extends Exception {
    public ConsumoCriticoException(String mensaje) {
        super(mensaje);
    }
}