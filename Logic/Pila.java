package Logic;

public class Pila<T> {
    private Nodo<T> tope;

    public Pila() {
        this.tope = null;
    }

    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(tope);
        tope = nuevo;
    }

    public T pop() {
        if (estaVacia()) {
            return null;
        }
        T valor = tope.getDato();
        tope = tope.getSiguiente();
        return valor;
    }

    public T peek() {
        return (tope != null) ? tope.getDato() : null;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("\n--- Estado actual de la pila ---");
        Nodo<T> actual = tope;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
        System.out.println("-------------------------------");
    }

}
