package Logic;


public class Llamada {
    private String nombre;
    private String[] parametros;
    private String tipoRetorno;

    public Llamada(String nombre, String tipoRetorno, String... parametros) {
        this.nombre = nombre;
        this.parametros = parametros;
        this.tipoRetorno = tipoRetorno;
    }

    @Override
    public String toString() {
        return nombre + "(" + String.join(", ", parametros) + ") -> " + tipoRetorno;
    }
}
