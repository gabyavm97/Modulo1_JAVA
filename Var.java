public class Var { //creacion de la clase
    public static void main (String[]args){
        //variables con tipo de dato y dato guardado
        int edad = 28;
        double salario =15499.50;
        boolean activo = true;
        char inicial = 'm';
        //variable donde el tipo de dato se infiere
        var ciudad = "Guadalajara";

        //imprimir valores almacenados en las variables
        System.out.println("Edad:"+edad);
        System.out.println("Salario:$"+salario);
        System.out.println("Activo:"+activo);
        System.out.println("Inicial:"+inicial);
        System.out.println("Ciudad:"+ciudad);

        //conversiones de tipo de dato
        double precio = 199.99;
        int precioRedondeado = (int) precio;
        System.out.println("Precio original:$"+precio); // conversion implicita
        System.out.println("Precio redondeado:$"+precioRedondeado); // casting
    }
}
