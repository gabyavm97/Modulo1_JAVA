public class Ambulancia extends UnidadEmergencia{
    //
    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    //
    public Ambulancia (String nombreUnidad, String nombreOperador){
        super(nombreUnidad,nombreOperador);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
    }

    @Override
    public void responder(){
        System.out.println("Ambulancia en camino al hospital más cercano...");
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        getOperador().reportarse();
        responder();
    }
}
