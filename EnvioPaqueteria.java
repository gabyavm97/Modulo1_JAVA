import java.util.Scanner; //importar función de scanner

public class EnvioPaqueteria {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in); //crear instancia de scanner

        System.out.print("Introduce el tipo de paquete (pequeño,mediano,grande): ");
        String tipo = sc.nextLine();

        double costo = 0;

        // condicionales

        if (tipo.equalsIgnoreCase("pequeño")){
        costo = 49.99;
            System.out.println("Costo del envío: $"+costo);
        }
        else if (tipo.equalsIgnoreCase("mediano")){
            costo = 89.99;
            System.out.println("Costo del envío: $"+costo);
        }
        else if (tipo.equalsIgnoreCase("grande")){
            costo = 149.99;
            System.out.println("Costo del envío: $"+costo);
        } else {
            System.out.println("Costo del envío: $"+costo);
        }
        sc.close();
    }
}
