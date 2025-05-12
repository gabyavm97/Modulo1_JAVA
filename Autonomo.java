public class Autonomo extends Vehiculo{
    SensorGPS gps;
    Camara camara;
    SistemaIA ia;
    Motor motor;

    public Autonomo(String marca){
        super(marca);
        this.gps = new SensorGPS();
        this.camara = new Camara();
        this.ia = new SistemaIA();
        this.motor = new Motor();
    }

    public void iniciarAutonomia(){
        System.out.println("Modo autonomo activado");
        gps.localizar();
        camara.detectarObstaculos();
        ia.tomarDecision();
        motor.arrancar();
    }
}
