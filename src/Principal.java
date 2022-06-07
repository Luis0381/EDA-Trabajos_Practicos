/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Medina Raed
 */
public class Principal {
    public static void main(String[] args){
//    Persona P1,P2;
//    P1=new Persona("Maria");
//    P2=new Persona("Juan");
//    P2=P1;
//    P2.setNombre("Pedro");
//    System.out.println(P1.getNombre());


      Lista miLista= Lista.crearLista();
      
      System.out.println("La lista es vacia? : " + miLista.esVacia());
      
      System.out.println("Se agregan a la lista 10 numeros");
      miLista.insertarAlInicio(1);
      miLista.insertarAlInicio(2);
      miLista.insertarAlInicio(3);
      miLista.insertarAlInicio(12);
      miLista.insertarAlInicio(25);
      miLista.insertarAlInicio(11);
      miLista.insertarAlFinal(321);
      miLista.insertarAlFinal(4);
      miLista.insertarAlFinal(5);
      miLista.insertarAlFinal(10);
      
      miLista.mostrar();
      
      System.out.println("La cantidad de numeros en la lista es: " + miLista.cantidad());
      
      System.out.println("A continuacion, se borrará el primer elemento de la lista");
      
      miLista.borrarPrimero();
      miLista.mostrar();
      
      System.out.println("A continuacion, se borrará el ultimo elemento de la lista");
      
      miLista.borrarUltimo();
      miLista.mostrar();
      
      System.out.println("A continuacion, se borrarán todos los 4");
      
      miLista.borrarConValor(4);
      miLista.mostrar();
      
      System.out.println("A continuacion, se pide el valor en la posicion 1 : " + miLista.dameValorEnPosicion(1));
      
      miLista.modificarValorEnPosicion(5, 1);
      
      System.out.println("A continuacion, se modifica el valor de la posicion 1 por 5 : " + miLista.dameValorEnPosicion(1));
      
      System.out.println("A continuacion, se agrega el valor 3 en la posicion 2");
      
      miLista.insertarEnPosicion(3, 3);
      miLista.mostrar();
      
      System.out.println("A continuacion, se borrara el elemento en la posicion 3");
      
      miLista.borrarEnPosicion(3);
      miLista.mostrar();
      
    }
}
