package Estructuras;

class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Cola_LE<T> {

    private Nodo<T> frente;
    private Nodo<T> finalCola;

    public Cola_LE() {
        this.frente = null;
        this.finalCola = null;
    }

    public void enqueque(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if (esVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }

    public void dequeue() {
        if (!esVacia()) {
            frente = frente.siguiente;

            if (frente == null) {
                finalCola = null;
            }
        } else {
            System.out.println("La cola está vacía, no se puede desencolar");
        }
    }

    public boolean esVacia() {
        return frente == null;
    }

    public void imprimirCola() {
        Nodo<T> actual = frente;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

//    public static void main(String[] args) {
//        Cola_LE<Integer> cola = new Cola_LE<>();
//
//        cola.enqueque(1);
//        cola.enqueque(2);
//        cola.enqueque(3);
//
//        System.out.println("Cola inicial:");
//        cola.imprimirCola();
//
//        cola.dequeue();
//
//        System.out.println("Cola después de desencolar:");
//        cola.imprimirCola();
//    }
}