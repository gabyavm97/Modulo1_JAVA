public class UnidadBomberos extends UnidadEmergencia{
    //
    SistemaGPS gps;
    Sirena sirena;

    //
    public UnidadBomberos (String nombreUnidad, String nombreOperador){
        super(nombreUnidad,nombreOperador);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
    }

    @Override
    public void responder(){
        System.out.println("Unidad de bomberos en camino al hospital más cercano...");
    }

    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        getOperador().reportarse();
        responder();
    }
}
