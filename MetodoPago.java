public abstract class MetodoPago {
    double monto;

    public MetodoPago(double monto){
        this.monto = monto;
    }

    public abstract boolean autenticar();

    public abstract void procesarPago();

    public void mostrarResumen(){
        System.out.println("Tipo de pago: "+"Monto: $"+monto);
    }

}
