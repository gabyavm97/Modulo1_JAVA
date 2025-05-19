import java.util.Optional;

public class Factura {
    //atributos de clase
    private final double monto;
    public final String descripcion;
    private final Optional<String> rfc;

    //constructor
    public Factura(double monto, String descripcion, String rfc) {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripcion no puede estar vacía");
        }
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc); //convierte null a optional empty
    }

    //constructor sobrecargado para facturas sin RFC (Cambio de atributos)
    public Factura(double monto, String descripcion) {
        this(monto, descripcion, null);
    }

    // --------- Getters Seguros------
    public double getMonto() {
        return monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Optional<String> getRfc() {
        return rfc;
    }
    //________ Metodo para resumen

    public String getResumen() {
        return String.format(
                "Factura generada\n:" +
                        "Descripción:%s\n" +
                        "Monto: $%,.2f\n" +
                        "RFC:%s",
                descripcion,
                monto,
                rfc.orElse("No proporcionado")
        );
    }
    //--------- formato to string  ----------
    @Override
    public String toString(){
        return getResumen();
    }
}

