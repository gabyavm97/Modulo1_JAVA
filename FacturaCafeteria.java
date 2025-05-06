public class FacturaCafeteria {
    public static void Main (String[]args){
        //precio unitario
        double precioCafe = 45.50;
        double precioPastel = 80.00;
        double precioAgua =20.00;

        //cantidades
        int cantidadCafe = 2;
        int cantidadPastel = 1;
        int cantidadAgua =1;

        //se agrega otro pastel
        cantidadPastel++;

        //calculo de total con prioridad de operadores
        double total = (precioCafe)*(cantidadCafe)+(precioPastel)*(cantidadPastel)+(precioAgua)*(cantidadAgua);

        //descuento por mas de 150 gastados
        boolean aplicaDescuento = total >150;

        //asignacion del descuento del 10%
        double descuento = aplicaDescuento ? total *0.10:0; // Operador ternario

        //calculo final
        double totalFinal = total -descuento;

        //impresion en consola
        System.out.println("Total de la compra:$");
        System.out.println("¿aplica descuento?:");
        System.out.println("Total descuento:$");
        System.out.println("Total a pagar:$");
    }
}
