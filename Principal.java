public class Principal {
    public static void main (String[] args){
        // Crear objetos
        Entrada entrada1 = new Entrada("Taylor Swift",3000.00);
        Entrada entrada2 = new Entrada("Sabrina Carpenter",2500.00);

        // llamar el método con las entradas
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
            }
}
