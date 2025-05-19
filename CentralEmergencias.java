public class CentralEmergencias {
    public static void main (String []args){
        UnidadBomberos bomberos1 = new UnidadBomberos("Bomberos", "Juan");
        Patrulla patrulla1 = new Patrulla("Policiaca", "Laura");
        Ambulancia ambulancia1 = new Ambulancia("Emergencia", "Marco");

        bomberos1.iniciarOperacion();
        patrulla1.iniciarOperacion();
        ambulancia1.iniciarOperacion();
    }
}
