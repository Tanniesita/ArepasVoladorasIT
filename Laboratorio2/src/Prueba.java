
/**
 *
 * @author Tannia
 * @author Juan Diego
 * @author Mario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        ManejadorServicios manejador = new ManejadorServicios();
        //EnvioDinero servicio1 = new Nacional(2500, "2-770-085", "200 norte del banco");
        //manejador.listaProductos(servicio1);
        //EnvioDinero servicio2 = new Internacional(200000, "215588005130", "Banco Internacional");
        //manejador.listaProductos(servicio2);
        //EnvioProducto servicio3 = new EnvioBus("Transporte ticabus", 100);
        //manejador.listaProductos(servicio3);
        //EnvioProducto servicio4 = new EnvioTren("Horario de lunes a viernes de 7 a 9", "Alajuela", 125);
        //manejador.listaProductos(servicio4);
        //AlquilerAuto servicio5 = new AlquilerCamion("Maderas de altura", 13);
        //manejador.listaProductos(servicio5);
        //AlquilerAuto servicio6 = new AlquilerAutomovilLujo("2-522-004", 5);
        //manejador.listaProductos(servicio6);
        System.out.println(manejador.datosServicios());
    }
}
