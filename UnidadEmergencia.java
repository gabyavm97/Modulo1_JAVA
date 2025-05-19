// Reto 1
public abstract class UnidadEmergencia {
    private String nombreUnidad;
    private Operador operador;

    public UnidadEmergencia(String nombreUnidad, String nombreOperador){
        this.nombreUnidad = nombreUnidad;
        this.operador = new Operador(nombreOperador);
    }

    //metodo abstracto

   public abstract void responder();

    //metodo concreto

    public void activarUnidad(){
        System.out.println("Activando unidad: "+nombreUnidad);
    }
    public Operador getOperador(){
        return operador;
    }

}

