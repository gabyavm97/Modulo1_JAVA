public class PagoTarjeta extends MetodoPago implements Autenticable {
    public PagoTarjeta(double monto) {
        super(monto);
    }
    @Override
    public boolean autenticar() {
        if (monto >0){
            return true;
        } else
        return false;
    }
@Override
public void procesarPago(){
    System.out.println("Procesando pago en efectivo por"+monto);
}
}