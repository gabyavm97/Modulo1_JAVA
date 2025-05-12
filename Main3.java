public class Main3 {
    public static void main (String []args){
        //creacion de dos facturas con el mismo folio
        Factura factura1 = new Factura("F001","Cliente A",100.50);
        Factura factura2 = new Factura("F001","Cliente B",200.75);

        //mostrar ambas con toString
        System.out.println(factura1.toString());
        System.out.println(factura2.toString());

        //comparar si son iguales con equals
        System.out.println("¿Las facturas son iguales?"+factura1.equals(factura2));
    }
}
