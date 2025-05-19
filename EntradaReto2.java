public class EntradaReto2 {
    //atributos de las entradas
    String nombre_evento;
    double precio_entrada;

    //constructor que reciba los valores al crear el objeto
    public EntradaReto2 (String nombre_evento, double precio_entrada) {
        this.nombre_evento = nombre_evento;
        this.precio_entrada = precio_entrada;
    }
        //metodo publico
        public void mostrarInformacion2() {
            System.out.println("Evento:"+nombre_evento+"| Precio:$"+ precio_entrada);
        }

}
