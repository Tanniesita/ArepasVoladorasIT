/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2;

/**
 *Esta clase tiene el constructor, metodos get y set, y toString del producto
 * @author Tannia
 * @author Juan Diego
 * @author Mario
 */
public class Producto {

    /**
     *Constructor para el producto
     * @param descripcion el parametro descripcion contiene la descripcion del producto
     * @param pesoUnidad el parametro pesoUnidad contiene el peso por unidad del producto
     * @param tipoUnidad el parametro pesoUnidad contiene el peso por unidad del producto
     * @param cantidaUnidades
     */
    public Producto(String descripcion, double pesoUnidad, String tipoUnidad, int cantidaUnidades) {
        this.descripcion = descripcion;
        this.pesoUnidad = pesoUnidad;
        this.tipoUnidad = tipoUnidad;
        this.cantidaUnidades = cantidaUnidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPesoUnidad() {
        return pesoUnidad;
    }

    public void setPesoUnidad(double pesoUnidad) {
        this.pesoUnidad = pesoUnidad;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    public int getCantidaUnidades() {
        return cantidaUnidades;
    }

    public void setCantidaUnidades(int cantidaUnidades) {
        this.cantidaUnidades = cantidaUnidades;
    }
    //Fin sets y gets

    @Override
    public String toString() {
        return "Producto{" + "Descripcion=" + descripcion + ", Pesopor unidad=" + pesoUnidad + ", Tipo de unidad=" + tipoUnidad + ", Cantida de unidades=" + cantidaUnidades + '}';
    }
    
    private String descripcion;
    private double pesoUnidad;
    private String tipoUnidad;
    private int cantidaUnidades;
    
    
}
