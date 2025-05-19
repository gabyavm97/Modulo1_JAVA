public class CuentaFiscal {
    //atributos privados
    private String rfc;
    private double saldoDisponible;

    //constructor con validación para que el saldo no sea negativo
    public CuentaFiscal (String rfc, double saldoDisponible){
        this.rfc = rfc;
        if (saldoDisponible <0){
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.saldoDisponible = saldoDisponible; //validacion de saldo positivo
    }
    //getters para ambos atributos
    public String getRfc(){
return rfc;
    }
    public double getSaldoDisponible(){
        return saldoDisponible;
    }
    //metodo que compare el rfc de la cuenta con la declaracion, usando equals
    public boolean validarRFC (DeclaracionImpuestos d){
        return java.util.Objects.equals(this.rfc,d.rfcContribuyente());
    }
    @Override
    public String toString(){
        return "Cuenta fiscal registrada con RFC:"+rfc+", saldo disponible: $ "+saldoDisponible;
    }
}
