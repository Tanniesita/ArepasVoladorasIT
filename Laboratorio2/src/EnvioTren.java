/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *
 * @author Tannia
 * @author Juan Diego
 * @author Mario
 */
public class EnvioTren extends EnvioProducto {

    /**
     *Este es el constructor de EnvioTren
     * @param horario este parametro contiene el horario del bus
     * @param provinciaDestino este parametro contiene la provincia de destino del bus
     * @param tarifaKilo este parametro contiene la tarifa por kilo 
     */
    public EnvioTren(String horario, String provinciaDestino, double tarifaKilo) {
        this.horario = horario;
        this.provinciaDestino = provinciaDestino;
        this.tarifaKilo = tarifaKilo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProvinciaDestino() {
        return provinciaDestino;
    }

    public void setProvinciaDestino(String provinciaDestino) {
        this.provinciaDestino = provinciaDestino;
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
        return "Tren{" + "Horario=" + horario + ", Provincia destino=" + provinciaDestino + ", Tarifa por kilo=" + tarifaKilo + '}';
    }
    
    /**
     *Este metodo es para calcular el cobro de cada producto llevado por el tren
     * @param producto este parametro contiene el producto al quese le va a calcular el costo por enviarlo
     * @return retorna el cobro de cada producto
     */    
    @Override
    public double calculoCobros(Producto producto) {
        return producto.getCantidaUnidades() * producto.getPesoUnidad() * tarifaKilo;
    }
    
    private String horario;
    private String provinciaDestino;
    private double tarifaKilo;
    
}
