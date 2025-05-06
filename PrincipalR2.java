public class PrincipalR2 {
    public static void main (String []args){
        Factura factura1 = new Factura(2500.0,"Servicio de consultoría", "ABCC010101XYZ");
        Factura factura2 = new Factura(1800.0, "Reparación de equipo");

        // salida
        System.out.println(factura1);
        System.out.println("\n"+factura2);
    }
}
