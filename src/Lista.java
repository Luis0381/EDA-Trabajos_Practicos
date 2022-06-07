/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Medina Raed
 */
public class Lista {
    private Nodo primero;

    public static Lista crearLista(){
        return new Lista();
    }
    
    public boolean esVacia(){
        if (primero==null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public void insertarAlInicio(int dato){
        Nodo aux=new Nodo(dato);
        if (primero==null) {
            primero=aux;
        }
        else
        {
            aux.setSiguiente(primero);
            primero=aux;
        }
    }
    
    public void insertarAlFinal(int dato){
        Nodo nuevoNodo=new Nodo(dato);
        if (primero==null) {
            primero=nuevoNodo;
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevoNodo);
        }
    }
    
    public void mostrar(){
        if (primero==null) {
            System.out.println("Lista vacia");
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente()!=null){
                System.out.println(aux.getNum());
                aux=aux.getSiguiente();
            }
            System.out.println(aux.getNum());
        }
    }
    
    public int cantidad(){
        int contador=0;
        if (primero==null) {
            return contador;
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente()!=null){
                contador++;
                aux=aux.getSiguiente();
            }
            contador++;
            return contador;
        }
    }
    
    public void borrarPrimero(){
        if (primero==null) {
            System.out.println("No hay primero para borrar");
        }
        else
        {
            primero=primero.getSiguiente();
        }
    }
    
    public void borrarUltimo(){
        if (primero==null) {
            System.out.println("No hay ultimo para borrar");
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente().getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(null);
        }
    }
    
    public void borrarConValor(int buscado){
        if (primero==null) {
            System.out.println("No existe el valor buscado en la lista");
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente()!=null){
                if (buscado == aux.getSiguiente().getNum()) {
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                }
                if(aux.getSiguiente()!=null)
                {
                    aux=aux.getSiguiente();
                }
            }
        }
    }
    
    public void borrarEnPosicion(int posicion){
        int contador=0;
        Nodo aux=primero;
        if(posicion==0){
            primero=primero.getSiguiente();
        }
        else
        {
            while(aux.getSiguiente()!=null){
                if(contador+1==posicion){
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                }
                if(aux.getSiguiente()!=null)
                {
                    aux=aux.getSiguiente();
                    contador++;
                }
            }
                contador++;
        }
        }
    
    public int dameValorEnPosicion(int posicion){
        int contador=0;
        if (primero==null) {
            return 44;
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente()!=null){
                if(posicion==contador)
                {
                    return aux.getNum();
                }
                aux=aux.getSiguiente();
                contador++;
            }
            if(posicion==contador)
            {
                return aux.getNum();
            }
        }
        return 999;
    }
    
    public void modificarValorEnPosicion(int valor, int posicion){
        int contador=0;
        if (primero==null) {
            System.out.println("Lista vacia");
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente()!=null){
                if(posicion==contador)
                {
                    aux.setNum(valor);
                }
                aux=aux.getSiguiente();
                contador++;
            }
            if(posicion==contador)
            {
                aux.setNum(valor);
            }
        }
    }
    
    public void insertarEnPosicion(int valor, int posicion){
        Nodo nuevoNodo=new Nodo(valor);
        int contador=0;
        Nodo aux=primero;
            if(posicion==contador){
                nuevoNodo.setSiguiente(primero);
                primero=nuevoNodo;
            }
          while(aux.getSiguiente()!=null){
            if(contador+1==posicion){
                nuevoNodo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevoNodo);
            }
            if(aux.getSiguiente()!=null)
            {
                aux=aux.getSiguiente();
                contador++;
            }
          }
            contador++;
            if(contador==posicion){
                aux.setSiguiente(nuevoNodo);
            }
        }
}
