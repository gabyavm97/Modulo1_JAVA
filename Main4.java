public class Main4 {
    public static void main (String []args){
        // crear una declaracion de impuestos
        DeclaracionImpuestos declaracion1 = new DeclaracionImpuestos("XAXX010101000",8700.00 );

        //crea una cuenta fiscal
        CuentaFiscal cuenta1 = new CuentaFiscal("XAXX010101000", 9500.00);

        //muestra la informacion de ambas
        System.out.println("Declaración enviada por rfc:"+declaracion1.rfcContribuyente()+"por $"+ declaracion1.montoDeclarado());
        System.out.println(cuenta1);

        //Valida si el RFC coincide y muestra el resultado
        System.out.println("¿RFC válido para esta cuenta?:"+cuenta1.validarRFC(declaracion1));
    }
}
