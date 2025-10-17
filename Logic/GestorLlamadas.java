package Logic;

public class GestorLlamadas {
    private Pila<Llamada> pila;

    public GestorLlamadas() {
        pila = new Pila<>();
    }

    public void llamarFuncion(String nombre, String tipoRetorno, String... params) {
        Llamada nueva = new Llamada(nombre, tipoRetorno, params);
        System.out.println("PUSH → Llamada a " + nueva);
        pila.push(nueva);
        pila.mostrarPila();
    }

    public void finalizarLlamada() {
        Llamada finalizada = pila.pop();
        if (finalizada != null) {
            System.out.println("POP  → Retorna de " + finalizada);
        } else {
            System.out.println("⚠ No hay llamadas para finalizar.");
        }
        pila.mostrarPila();
    }

    public boolean pilaVacia() {
        return pila.estaVacia();
    }
    
    public void mostrarPila() {
    pila.mostrarPila();
}

}
