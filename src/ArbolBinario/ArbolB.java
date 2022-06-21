/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArbolBinario;

/**
 *
 * @author Luis Medina Raed
 */
public class ArbolB {

    private ArbolB izquierdo;
    private ArbolB derecho;
    private Item raiz;
    
    //SETTERS   
    public void setIzquierdo(ArbolB izquierdo) {
        this.izquierdo = izquierdo;
    }


    public void setDerecho(ArbolB derecho) {
        this.derecho = derecho;
    }


    public void setRaiz(Item raiz) {
        this.raiz = raiz;
    }
    
    //OPERACIONES
    
    // ABVACIO: --> AB
    public static ArbolB ABVacio(){
        return new ArbolB();
    }
    
    // ESABVACIO: AB --> BOOL
    public Boolean esABVacio(){
        return raiz == null;
    }
    
    // ARMARAB: AB X ITEM X AB --> AB
    public static ArbolB armarAB(ArbolB izquierdo, Item raiz, ArbolB derecho){
        if(raiz == null)
            return null;
          
        ArbolB nuevo = ABVacio();
        
        if(izquierdo == null){
            nuevo.izquierdo = ABVacio();
        }
        else{
            nuevo.izquierdo = izquierdo;
        }
        
        if(derecho == null){
            nuevo.derecho = ABVacio();
        }
        else{
            nuevo.derecho = derecho;
        }
        nuevo.raiz = raiz;
        return nuevo;
    }
    
    // IZQUIERDO: AB --> AB
    public ArbolB izquierdo(){
        return this.izquierdo;
    }
    
    // DERECHO: AB --> AB
    public ArbolB derecho(){
        return this.derecho;
    }
    
    // RAIZ: AB --> ITEM U {INDEFINIDO}
    public Item raiz(){
        return this.raiz;
    }
    
    // PERTENECE: ARBOL X ITEM --> BOOL
    public Boolean pertenece(Item c){
        if(esABVacio())
            return false;
        else
            return raiz.getDato()==c.getDato() || izquierdo().pertenece(c) || derecho().pertenece(c);
    }
    
    // METODOS ADICIONALES
    
    //METODO QUE MUESTRA POR PANTALLA EL ARBOL CON RECORRIDO PREORDEN
    public void preorden(){ //VLR
        if(!esABVacio()){
            System.out.printf("%c,",raiz.getDato());
            izquierdo.preorden();
            derecho.preorden();
        }
    }
    
    //METODO QUE MUESTRA POR PANTALLA EL ARBOL CON RECORRIDO ENORDEN
    public void inorden(){ //LVR
        if(!esABVacio()){
            izquierdo.preorden();
            System.out.printf("%c,",raiz.getDato());
            derecho.preorden();
        }
    }
    
    //METODO QUE MUESTRA POR PANTALLA EL ARBOL CON RECORRIDO POSORDEN
    public void posorden(){ //LRV
        if(!esABVacio()){
            izquierdo.preorden();
            derecho.preorden();
            System.out.printf("%c,",raiz.getDato());
        }
    }
}
