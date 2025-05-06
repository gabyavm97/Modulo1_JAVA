public class EjemploSwitch {
    public static void main (String []args){
        String tipo = "mediano";

        double costo = switch (tipo.toLowerCase()){
            case "pequeño" -> 49.99;
            case "mediano" -> 49.99;
            case "grande" -> 49.99;
            default -> {
                System.out.println("Tipo inválido");
                yield 0.0; //se usa para saber que valor retornar en mas de una linea
            }
        };
        System.out.println("Costo total del envío:$"+costo);
    }
}
