public class Simulador {
    public static void main (String[] args){
        Autonomo tesla = new Autonomo("Tesla");

        tesla.encender(); // metodo heredado de vehiculo
        tesla.iniciarAutonomia(); //metodo propio con  composicion
    }
}
