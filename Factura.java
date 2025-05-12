public class Factura {
    // atributos de la clase
    String folio;
    String cliente;
    double total;

    // constructor
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura [folio=" + folio +"cliente="+ cliente +",total=$ "+total+"]";
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        //1. verificar que es la misma instancia
        if (this == obj) {
            return true;
        }
        // 2. verificar si el objeto es nulo o de otra clase
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // 3. hacer casting a factura
        Factura otraFactura = (Factura) obj;

        // 4. comparar los folios
        return this.folio.equals(otraFactura.folio);
    }
    @Override
    public int hashCode() {
        return folio != null ? folio.hashCode():0;
    }

}
