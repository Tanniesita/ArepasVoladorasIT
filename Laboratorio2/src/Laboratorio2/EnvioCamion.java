package Laboratorio2;


/**
 *Esta clase tiene el constructor, metodos get y set, y toString del envioCamion
 * tambien tiene el metodo calculoCobro
 * @author Tannia
 * @author Juan Diego
 * @author Mario
 */
public class EnvioCamion extends EnvioProducto implements Empresa {

    /**
     *Costructor del envioCamion
     * @param placa este parametro contiene la placa del camion
     */
    public EnvioCamion(String placa) {
        this.placa = placa;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    //Fin sets y gets

    @Override
    public String toString() {
        return "Camion{" + "Placa=" + placa + ", Tarifa por kilo=" + TARIFA_KILO + '}';
    }
    
    /**
     *Este metodo es para calcular el cobro de cada producto llevado por el camion
     * @param producto este parametro contiene el producto al quese le va a calcular el costo por enviarlo
     * @return retorna el cobro de cada producto
     */
    @Override
    public double calculoCobros(Producto producto) {
        return producto.getCantidaUnidades() * producto.getPesoUnidad() * TARIFA_KILO;
    }
    
    private String placa;
    private final double TARIFA_KILO = 2000;
    
    
    
}
