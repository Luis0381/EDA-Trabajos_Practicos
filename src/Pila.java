/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Medina Raed
 */
public class Pila {
    Nodo primero;
    int altura=0;
    
    public static Pila nuevaPila(){
        return new Pila();
    }
    
    public boolean esPilaVacia(){
        return primero==null;
    }
    
    public Item top(){
        return primero.getUnItem();
    }
    
    public void pop(){
        primero=primero.getSiguiente();
        altura--;
    }
    
    public Item bottom(){
        if(primero!=null){
            Nodo auxiliar=primero;
            while(auxiliar.getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
            }
            return auxiliar.getUnItem();
        }
        return null;
    }
    
    public void popBottom(){
        if(primero!=null){
            Nodo auxiliar=primero;
            if(auxiliar.getSiguiente()==null){
                primero=null;
            }
            else{
                while(auxiliar.getSiguiente().getSiguiente()!=null){
                auxiliar=auxiliar.getSiguiente();
                }
                auxiliar.setSiguiente(null);
            }
        }
    }
    
    public void push(Item nuevoItem){
        Nodo nuevoNodo=new Nodo(nuevoItem);
        nuevoNodo.setSiguiente(primero);
        primero=nuevoNodo;
        altura++;
    }
    
    public int altura(){
        return altura;
    }
    
    public static boolean igualdadPilas(Pila pilaA, Pila pilaB){
        if(pilaA.altura()==pilaB.altura())
        {
            Boolean valorVerdad=true;
            Nodo auxiliarA=pilaA.primero;
            Nodo auxiliarB=pilaB.primero;
            while(auxiliarA!=null && auxiliarB!=null){
                if(auxiliarA.getUnItem().getNumero()!=auxiliarB.getUnItem().getNumero()){
                    valorVerdad=false;
                }
                auxiliarA=auxiliarA.getSiguiente();
                auxiliarB=auxiliarB.getSiguiente();
            }
            return valorVerdad;
        }
        else{
            return false;
        }
    }
    
    public static Pila apilarPilas(Pila pilaA, Pila pilaB){
        Pila pilaC= Pila.nuevaPila();
        
        while(!pilaA.esPilaVacia()){
            pilaC.push(pilaA.bottom());
            pilaA.popBottom();
        }
        
        while(!pilaB.esPilaVacia()){
            pilaC.push(pilaB.bottom());
            pilaB.popBottom();
        }
        
        return pilaC;
    }

    public void mostrarPila(){
        if(primero!=null){
            Nodo auxiliar=primero;
            while(auxiliar!=null){
                System.out.println(auxiliar.getUnItem().getNumero());
                auxiliar=auxiliar.getSiguiente();
            }
        }
    }
    
//    public static Pila apilarPilas(Pila pilaA, Pila pilaB){ //INTENTO DE QUE NO SE BORREN
//        Pila PilaC= Pila.nuevaPila();
//        int contador=pilaA.altura();
//        if(!pilaA.esPilaVacia()){
//            Nodo auxiliar=pilaA.primero;
//            while(contador!=0){
//                while(auxiliar!=null){
//                    
//                }
//                contador--;
//            }
//        }
//    }
    
    public class Nodo{
        Item unItem;
        Nodo siguiente;

        public Nodo(Item unItem) {
            this.unItem = unItem;
        }
        

        public Item getUnItem() {
            return unItem;
        }

        public void setUnItem(Item unItem) {
            this.unItem = unItem;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
    }
    
    
}
