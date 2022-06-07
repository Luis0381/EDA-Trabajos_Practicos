/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Medina Raed
 */
public class Club {
    Nodo primero;
    
    // GETTERS & SETTERS

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
    
    
    // CLASE INTERNA PARA NODOS
    public class Nodo{
        Socio socio;
        Nodo siguiente;

        // CONSTRUCTOR
        public Nodo(Socio item) {
            this.socio = item;
        }
       
        // GETTERS & SETTERS
        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Socio getSocio() {
            return socio;
        }

        public void setSocio(Socio item) {
            this.socio = item;
        }
    }
    
    //OPERACIONES
    
    //CLUBVACIO: -> CLUB
    public static Club clubVacio(){
        return new Club();
    };
    
    //ALTASOCIO: CLUB X SOCIO -> CLUB
    public void altaSocio(Socio nuevoSocio){
        Nodo nuevoNodo= new Nodo(nuevoSocio);
        if(primero==null)
        {
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
    };
    
    //ESTAVACIO: CLUB -> BOOL
    public boolean estaVacio(){
        if(primero==null)
        {
            return true;
        }
        else{
            return false;
        }
    };
    
    //CANTIDAD: CLUB -> ENTERO >=0s
    public int cantidad(){
        if(primero==null)
        {
            return 0;
        }
        else
        {
            Nodo aux=primero;
            int contador=1;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
                contador++;
            }
            return contador;
        }
    };
    
    //ESTA: CLUB X SOCIO -> BOOL
    public boolean esta(Socio socioBuscado){
        return esta(socioBuscado,primero);
    };
    
    public boolean esta(Socio socioBuscado,Nodo aux){
        if(aux==null)
        {
            return false;
        }
        else
        {
            if(socioBuscado.getNumeroSocio()==aux.getSocio().getNumeroSocio()){
                return true;
            }
            else{
                return esta(socioBuscado,aux.getSiguiente());
            }
        }
    };
    
    //ULTIMOSOCIO: CLUB -> SOCIO U {INDEFINIDO}
    public Socio ultimoSocio(){
        if(primero==null)
        {
            return null;
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            return aux.getSocio();
        }
    };
    
    // METODOS ADICIONALES
    
    //METODO ADICIONAL PARA PODER HACER METODO UNION
    public void borrarUltimoSocio(){
        if(primero!=null)
        {
            Nodo aux=primero;
            if(primero.getSiguiente()==null){
                primero=null;
            }
            else{
                while(aux.getSiguiente().getSiguiente()!=null){
                    aux=aux.getSiguiente();
                }
                aux.setSiguiente(null);  
            }
        }
    };
    
    //METODO ADICIONAL PARA CONTROL
    public void mostrarClub(){
        if (primero==null) {
            System.out.println("Club Vacio");
        }
        else
        {
            Nodo aux=primero;
            while(aux.getSiguiente()!=null){
                System.out.println(aux.getSocio().getNumeroSocio());
                aux=aux.getSiguiente();
            }
            System.out.println(aux.getSocio().getNumeroSocio());
        }
    }
}
