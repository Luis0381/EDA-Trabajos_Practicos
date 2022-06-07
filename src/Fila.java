/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medina Raed, Luis Eugenio
 */
public class Fila {
    private Nodo primero;
    private Nodo ultimo;
    private int cantidad=0;
    
    public class Nodo {
        private Nodo siguiente;
        private Item dato;

        // CONSTRUCTOR
        public Nodo(Item dato) {
            this.dato = dato;
            this.siguiente = null;
        }

        // GETTERS & SETTERS
        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Item getDato() {
            return dato;
        }

        public void setDato(Item dato) {
            this.dato = dato;
        }   
    }
    
    // OPERACIONES
    
    // FILAVACIA: -> FILA
    public static Fila filaVacia(){
        return new Fila();
    } 
    
    // ESFILAVACIA: FILA -> BOOL
    public boolean esFilavacia(){
        return primero==null;
    }
    
    // FRENTE: FILA -> ITEM U {INDEFINIDO}
    public Item frente(){
        if(primero!=null){
            return primero.getDato();
        }
        else{
            return null;
        }
    }
    
    // ENFILA: FILA -> FILA
    public void enFila(Item nuevoItem){
        Nodo nuevoNodo = new Nodo(nuevoItem);
        if(esFilavacia()){
            primero=nuevoNodo;
            ultimo=nuevoNodo;
            cantidad++;
        }
        else{
            Nodo auxiliar= new Nodo(nuevoItem);
            ultimo.setSiguiente(auxiliar);
            ultimo=auxiliar;
            cantidad++;
        }
    }
    
    // DEFILA: FILA -> FILA
    public void deFila() {
        if (!esFilavacia()) {
            primero=primero.getSiguiente();
            cantidad--;
        }
    }
    
    // LONGITUD: FILA -> ENTERO >=0
    public int longitud(){
        return cantidad;
    }
    
    // IGUALF: FILA X FILA -> BOOL
    public boolean igualF(Fila filaB) {
        Nodo auxA = primero;
        Nodo auxB = filaB.primero;
        if (cantidad != filaB.cantidad) {
            return false;
        } 
        else {
            while (auxA != null && auxB != null) {
                if (auxA.getDato().getNumero() != auxB.getDato().getNumero() || !auxA.getDato().getNombre().equals(auxB.getDato().getNombre())) {
                    return false;
                }
                auxA = auxA.getSiguiente();
                auxB = auxB.getSiguiente();
            }
        }
        return true;
    }

    // CONCAT: FILA X FILA -> FILA
    public void concat(Fila filaB) {
        ultimo.setSiguiente(filaB.primero);
        ultimo = filaB.ultimo;
        filaB.primero=primero;
        cantidad=cantidad+filaB.cantidad;
    }

    // INVERTIR: FILA -> FILA
    public void invertir()
    {
        int izquierda = 0;
        int derecha = cantidad - 1;
        while (izquierda < derecha) {
            Nodo nodoIzquierda = buscarNodo(izquierda);
            Nodo nodoDerecha = buscarNodo(derecha);
 
            Item datoIzquierda = nodoIzquierda.getDato();
            nodoIzquierda.setDato(nodoDerecha.getDato());
            nodoDerecha.setDato(datoIzquierda);
 
            izquierda++;
            derecha--;
        }
    }
    
    // METODOS AUXILIARES
    
    private Nodo buscarNodo(int numeroNodo){ // BUSCA UN NODO POR SU UBICACION
        Nodo aux = primero;
        int contador=0;
        while(contador!=numeroNodo){
            aux=aux.getSiguiente();
            contador++;
        }
        return aux;
    }
    
    public void mostrar(){ // MUESTRA LA FILA
        Nodo aux = primero;
        while(aux!=null){
            System.out.println(aux.getDato().getNombre()+""+aux.getDato().getNumero());
            aux=aux.getSiguiente();
        }
    }
}
