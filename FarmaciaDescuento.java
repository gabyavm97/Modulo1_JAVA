public class FarmaciaDescuento {

    public static void main(String []args){
        // valores de la factura
        String nombreMedicamento = "Amoxicilina";
        double precioUnitario = 120.00;
        int numeroPiezas = 5;

        //constructor para iniciar variables

        //metodo para calcular el total
        double totalSinDescuento= numeroPiezas*precioUnitario;
        double totalDescuento = (totalSinDescuento*.15);
        double descuento = totalSinDescuento-totalDescuento;
        String aplicaDescuento = "si";
        String noAplicaDescuento ="no";


        //aplicacion de descuento usando operador ternario

        String hacerdescuento = (totalSinDescuento > 500) ? aplicaDescuento : noAplicaDescuento;

        //impresion de ticket
        System.out.println("Medicamento:"+nombreMedicamento);
        System.out.println("Cantidad:"+numeroPiezas);
        System.out.println("Precio unitario:$"+precioUnitario);
        System.out.println("Total sin descuento:$"+totalSinDescuento);
        System.out.println("¿Aplica descuento?:"+ hacerdescuento);
        System.out.println("Descuento:$"+totalDescuento);
        System.out.println("Total a pagar:$"+descuento);

    }
}
