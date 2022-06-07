/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolb;

/**
 *
 * @author Luis Medina Raed
 */
public class ArbolB {

    private ArbolB izquierdo;
    private ArbolB derecho;
    private Character raiz;
   
    public void setIzquierdo(ArbolB izquierdo) {
        this.izquierdo = izquierdo;
    }


    public void setDerecho(ArbolB derecho) {
        this.derecho = derecho;
    }


    public void setRaiz(Character raiz) {
        this.raiz = raiz;
    }
    
    
    public static ArbolB ABVacio(){
        return new ArbolB();
    }
    
    public Boolean esABVacio(){
        return raiz == null;
    }
    
    public static ArbolB armarAB(ArbolB izquierdo, Character raiz, ArbolB derecho){
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
    
    public ArbolB izquierdo(){
        return this.izquierdo;
    }
    
    public ArbolB derecho(){
        return this.derecho;
    }
    
    public Character raiz(){
        return this.raiz;
    }
    
    public Boolean pertenece(Character c){
        if(esABVacio())
            return false;
        else
            return raiz==c || izquierdo().pertenece(c) || derecho().pertenece(c);
    }
    
    public void preorden(){
        if(!esABVacio()){
            System.out.printf("%c,",raiz);
            izquierdo.preorden();
            derecho.preorden();
        }
    }
    
    public void inorden(){
        if(!esABVacio()){
            izquierdo.preorden();
            System.out.printf("%c,",raiz);
            derecho.preorden();
        }
    }
    
    public void posorden(){
        if(!esABVacio()){
            izquierdo.preorden();
            derecho.preorden();
            System.out.printf("%c,",raiz);
        }
    }
}
