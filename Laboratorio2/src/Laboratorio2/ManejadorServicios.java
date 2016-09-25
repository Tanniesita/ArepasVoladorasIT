package Laboratorio2;

/**
 *
 * @author Tannia
 * @author Juan Diego
 * @author Mario
 */

public class ManejadorServicios {
 
    private Empresa[] vectorProductos = new Empresa[6];
    private int contadorProductos = 0;
    
    /**
     * 
     * @param servicio contiene alguno de los servicios de la empresa, se utiliza para agregar en la lista 
     */
     public void listaProductos(Empresa servicio){
         if(contadorProductos < vectorProductos.length){
         vectorProductos[contadorProductos] = servicio;
         contadorProductos++;
       }else{
             System.out.println("No se pueden almacenar mas productos");
         } 
     }
     
     /**
      * 
      * @return una hilera de texto con los datos de todos los servicios adquiridos ademas,
      * el cobro de cada uno y el total recaudado en un día.Para los casos en que se hicieron cálculos de conversión de
      * unidades a Kg se incluye el cálculo en Kg.
      */
     public String datosServicios(){
         String text = "";
         for(int i = 0; i < vectorProductos.length; i++){
            text += " " + vectorProductos[i].toString();
            //falta el cobro individual el cobro de todos y la conversion
         }
         return text;
     }
     
     public void conversionUnidades(){
         
     }
}