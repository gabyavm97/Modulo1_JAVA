public class Farmacia {
    public static void main (String[]args){
        // valores de la factura
        var nombreMedicamento = "Amoxicilina";
        double precioUnitario = 120.00;
        int numeroPiezas = 5;

        //constructor para iniciar variables
        Farmacia ticket1 = new Farmacia();

        //metodo para calcular el total
        double totalSinDescuento= numeroPiezas*precioUnitario;

        //impresion del total
        System.out.println("Medicamento:"+nombreMedicamento);
        System.out.println("Precio unitario:$"+precioUnitario);
        System.out.println("Cantidad:"+numeroPiezas);
        System.out.println("Total:$"+totalSinDescuento);
    }

}
