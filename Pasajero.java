public class Pasajero {
    //atributos
    private String nombre;
    private String pasaporte;

    //constructor
    public Pasajero(String nombre, String pasaporte){
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if(pasaporte == null || !pasaporte.matches ("^[A-Z0-9]{6,9}$")){
            throw new IllegalArgumentException("Formato de pasaporte inválido. Debe contener entre 6-9 caracteres alfanumericos en mayúsculas");
        } //validacion de que el pasaporte sea correcto en cuanto a formato.
        this.nombre = nombre.trim();
        this.pasaporte = pasaporte;
    }
    // getters
    public String getNombre(){
        return nombre;
    }
    public String getPasaporte(){
        return pasaporte;
    }
}
