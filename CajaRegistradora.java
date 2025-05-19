public class CajaRegistradora {
    public static void main (String []args) {
        //declaracion de arreglo para almacenar objetos de clase MetodoPago
        MetodoPago[] irregular = new MetodoPago[3];
        irregular[0] = new PagoEfectivo(150.00);
        irregular[1] = new PagoTarjeta(320.00);
        irregular[2] = new PagoTransferencia(0.00);

        for (MetodoPago metodo : irregular) {
            if (metodo instanceof Autenticable) {
                Autenticable autenticable= (Autenticable) metodo;
                if (Autenticable.autenticar()) {
                    System.out.println("Autentificacion exitosa");
                    metodo.procesarPago();
                    metodo.mostrarResumen();
                } else {
                    System.out.println("Fallo de autentificacion. Transferencia no válida");
                }
            } else {
                metodo.procesarPago();
                metodo.mostrarResumen();
            }
            System.out.println();
        }
    }
}
