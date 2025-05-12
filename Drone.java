public abstract class Drone {
    // esta clase abstracta definirá la estructura y comportamientos comunes
    // para usar herencia simple con clase abstracta
    String id;

    public Drone(String id){
        this.id =id;
    }

    public void despegar(){
        System.out.println("Drone "+id+"despegando...");
    }
    public void aterrizar (){
        System.out.println("Drone"+id+"aterrizando...");
    }
    // metodo abstracto que cada tipo drone debe implementar
    public abstract void ejecutarMision();
}
