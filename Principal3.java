// importar Scanner antes de usarlo
import java.util.Scanner;

public class Principal3 {
    public static void main(String[]args){
        //creacion de instancia
        Paciente paciente1 = new Paciente();

    // creacion de un objeto scanner llamado sc, que leerá la entrada del teclado
     Scanner sc = new Scanner(System.in);
        System.out.print("Paciente:");
        String name=sc.nextLine();

        System.out.print("Edad:");
        Integer edad=sc.nextInt();

        //limpiar el buffer
        sc.nextLine();

        System.out.print("Expediente:");
        String expediente=sc.nextLine();
    }
}
