public class PagoTransferencia extends MetodoPago implements Autenticable{
    public PagoTransferencia(double monto){
        super(monto);
    }
    @Override
    public boolean autenticar() {
        if(monto == 0.00){
            System.out.println("Fallo en la autenticación. Transferencia inválida");
        return false;
        }
        return true;
    }
    @Override
    public void procesarPago(){
    System.out.println("Procesando pago en efectivo por "+monto);
}
}
