import java.util.Scanner;

public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion,
                         GestorDialogo dialogo,
                         LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void iniciarHistoria() {
        Scanner scanner = new Scanner(System.in);

        dialogo.mostrarDialogo("Narrador", "Había una vez, un bosque lejano...");
        transicion.realizarTransicion();

        dialogo.mostrarDialogo("Hada", "¿Deberiamos seguir por este camino? (1 = Sí, 2 = No)");
        int opcion = scanner.nextInt();

        if (decision.evaluarDecision(opcion)) {
            dialogo.mostrarDialogo("Duende", "¡Adelante!");
            dialogo.mostrarDialogo("Narrador", "Juntos, siguieron su camino...");
        } else {
            dialogo.mostrarDialogo("Guardián", "¡NO!");
            dialogo.mostrarDialogo("Narrador", "Habrá que buscar otra alternativa...");
        }

        transicion.realizarTransicion();
        scanner.close();
    }

    public static void main(String[] args) {
        // Configuración con inyección de dependencias
        MainNarrativa juego = new MainNarrativa(
                new TransicionSimple(),
                new DialogoTexto(),
                new DecisionBinaria()
        );

        juego.iniciarHistoria();
    }
}

