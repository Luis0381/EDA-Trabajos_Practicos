/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medina Raed, Luis Eugenio
 */
public class ListaCircular {
    private Nodo primero;
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
    
    // LCVACIA: -> LISTACIRCULAR
    public static ListaCircular lcVacia(){
        return new ListaCircular();
    } 
    
    // ESLCVACIA: LISTACIRCULAR -> BOOL
    public boolean esLcVacia(){
        return primero==null;
    }
    
    // LCVALOR: LISTACIRCULAR -> ITEM U {INDEFINIDO}
    public Item lcValor(){
        if(primero!=null){
            return primero.getSiguiente().getDato();
        }
        else{
            return null;
        }
    }
    
    // LCINSERTAR: LISTACIRCULAR X ITEM -> LISTACIRCULAR
    public void lcInsertar(Item nuevoItem){
        Nodo nuevoNodo = new Nodo(nuevoItem);
        if(esLcVacia())
        {
           primero=nuevoNodo;
           primero.setSiguiente(primero);
           cantidad++;
        }
        else{
            nuevoNodo.setSiguiente(primero.getSiguiente());
            primero.setSiguiente(nuevoNodo);
            cantidad++;
        }
    }
    
    // LCBORRAR: LISTACIRCULAR -> LISTACIRCULAR
    public void lcBorrar() {
        if (!esLcVacia()) {
            primero.setSiguiente(primero.getSiguiente().getSiguiente());
            cantidad--;
        }
    }
    
    // LONGITUD: FILA -> ENTERO >=0
    public int longitud(){
        return cantidad;
    }
    
    // LCROTAR: LISTACIRCULAR -> LISTACIRCULAR
    public void lcRotar(){
        primero=primero.getSiguiente();
    }
    
    // METODOS AUXILIARES
    
    public void mostrar(){
        Nodo aux = primero.getSiguiente();
        int contador=0;
        while(contador<cantidad){
            System.out.println(aux.getDato().getNumero());
            aux=aux.getSiguiente();
            contador++;
        }
    }
}
