
/**
 *
 * @author Tannia
 */
public enum UnidadesDeMedida {
    KILOGRAMO("Kilogramo", 1000),
    GRAMO("Gramo", 1),
    MILIGRAMO("Miligramo", 0.001);

    private final String UNIDAD;
    private final double VALOR;

    private UnidadesDeMedida(String UNIDAD, double VALOR) {
        this.UNIDAD = UNIDAD;
        this.VALOR = VALOR;
    }

    public String getUNIDAD() {
        return UNIDAD;
    }

    public double getVALOR() {
        return VALOR;
    }
}
