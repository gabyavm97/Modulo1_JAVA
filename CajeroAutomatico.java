
//importar scanner para crear menu interactivo
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // saldo inicial
        var saldo = 1000.00;
        //creacion de scanner para redactar menu interactivo
        Scanner sc = new Scanner(System.in);
        // mensaje de bienvenida
        System.out.println("Bienvenido al cajero automático:");
        System.out.println("¿Qué quieres hacer?:");
        //pedir opcion o respuesta al usuario

        String opcion;
        do {
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar dinero:");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1" -> System.out.printf("Saldo: $%.2f%n", saldo);
                case "2" -> {
                    System.out.println("Cantidad de deposito: $");
                    if (sc.hasNextDouble()) {
                        double deposito = sc.nextDouble();
                        sc.nextLine();//limpieza de buffer
                        //seguro para impedir deposito menores o iguales a cero
                        if (deposito > 0) {
                            saldo += deposito;
                        } else {
                            System.out.println("El monto debe ser positivo");
                        }
                        System.out.printf("Saldo actual: $%.2f%n", saldo);
                    }
                }
                case "3" -> {
                    System.out.println("Cantidad de retiro: $");
                    if (sc.hasNextDouble()) {
                        double retiro = sc.nextDouble();
                        sc.nextLine(); //para limpiar el buffer del scanner
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            System.out.printf("Retiro exitoso. Saldo actual: $%.2f%n", saldo);
                        } else if (retiro <= 0) {
                            System.out.printf("el monto debe ser positivo");
                        } else {
                            System.out.printf("Fondos insuficientes. Saldo actual: $%.2f%n", saldo);
                        }
                    }
                    System.out.printf("Saldo actual: $%.2f%n", saldo);
                }
                case "4" -> System.out.println("Gracias por usar este servicio");
                default -> System.out.println("Opción invalida, intenta de nuevo");
            }
        } while (!opcion.equals("4"));
    }
}