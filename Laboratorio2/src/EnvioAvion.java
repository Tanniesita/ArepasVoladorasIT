
/**
 *Esta clase tiene el constructor, metodos get y set, y toString del envioAvion
 * tambien tiene el metodo calculoCobro
 * @author Tannia
 * @author Juan Diego
 * @author Mario
 */
public class EnvioAvion extends EnvioProducto {
    
    /**
     *Este es el constructor de EnvioAvion
     * @param nombreAerolinea este parametro contiene el nombre de la aerolinea
     * @param paisDestino este parametro contiene el pais de destino
     * @param numeroCasillero este parametro contiene el numero de casillero al que debe llegar el envio
     * @param tarifaKilo este parametro contiene la tarifa por kilo
     */
    public EnvioAvion(String nombreAerolinea, String paisDestino, int numeroCasillero, double tarifaKilo) {
        this.nombreAerolinea = nombreAerolinea;
        this.paisDestino = paisDestino;
        this.numeroCasillero = numeroCasillero;
        this.tarifaKilo = tarifaKilo;
    }

    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public int getNumeroCasillero() {
        return numeroCasillero;
    }

    public void setNumeroCasillero(int numeroCasillero) {
        this.numeroCasillero = numeroCasillero;
    }

    public double getTarifaKilo() {
        return tarifaKilo;
    }

    public void setTarifaKilo(double tarifaKilo) {
        this.tarifaKilo = tarifaKilo;
    }
    //Fin sets y gets

    @Override
    public String toString() {
        return "Avion{" + "Nombre aerolinea=" + nombreAerolinea + ", Pais destino=" + paisDestino + ", Numero del casillero=" + numeroCasillero + ", Tarifa por kilo=" + tarifaKilo + ", Impuesto=" + IMPUESTO + '}';
    }
    
    /**
     *Este metodo es para calcular el cobro de cada producto llevado por el avion
     * @param producto este parametro contiene el producto al quese le va a calcular el costo por enviarlo
     * @return retorna el cobro de cada producto
     */    
    @Override
    public double calculoCobros(Producto producto) {
        return producto.getCantidaUnidades() * producto.getPesoUnidad() * tarifaKilo + IMPUESTO;
    }
    
    private String nombreAerolinea;
    private String paisDestino;
    private int numeroCasillero;
    private double tarifaKilo;
    private final double IMPUESTO = 25000;
    
}
