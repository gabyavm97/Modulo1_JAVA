public class Patrulla extends UnidadEmergencia{
    //
    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    //
    public Patrulla(String nombreUnidad, String nombreOperador){
        super(nombreUnidad,nombreOperador);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
    }

    @Override
    public void responder(){
        System.out.println("Patrulla en camino al hospital más cercano...");
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        getOperador().reportarse();
        responder();
    }
}
