package Laboratorio2;


/**
 *Esta clase tiene el constructor de EnvioBus, los metodos get y set, y el toString
 *tambien tiene el metodo calculoCobro
 * @author Tannia
 * @author Juan Diego
 * @author Mario
 */
public class EnvioBus extends EnvioProducto {

    /**
     *Este es el constructor del envioBus
     * @param nombreEmpresa este parametro es el nombre de la empresa autobusera
     * @param tarifaKilo este parametro es la tarifa que cobra el bus por kilo
     */
    public EnvioBus(String nombreEmpresa, double tarifaKilo) {
        this.nombreEmpresa = nombreEmpresa;
        this.tarifaKilo = tarifaKilo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }


    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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
        return "Bus{" + "Nombre empresa autobusera=" + nombreEmpresa + ", Tarifa por kilo=" + tarifaKilo + '}';
    }
    
    /**
     *Este metodo es para calcular el cobro de cada producto llevado por el bus
     * @param producto este parametro contiene el producto al quese le va a calcular el costo por enviarlo
     * @return retorna el cobro de cada producto
     */    
    @Override
    public double calculoCobros(Producto producto) {
        return producto.getCantidaUnidades() * producto.getPesoUnidad() * tarifaKilo;
    }
    
    private String nombreEmpresa;
    private double tarifaKilo;
    
    
    
}
