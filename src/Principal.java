/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medina Raed, Luis Eugenio
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Trabajo Practico N7");
        System.out.println("Apellido y nombre: Medina Raed, Luis Eugenio");
        System.out.println("DNI: 44028471");
        System.out.println("");
        
        //PRUEBA DE OPERACIONES DEL ADT
        System.out.println("En primer lugar, creamos una Lista Circular");
        ListaCircular listaA = ListaCircular.lcVacia();
        
        System.out.println("La lista creada es una lista vacia? " + listaA.esLcVacia());
        
        System.out.println("Agregamos 5 items a la lista");
        listaA.lcInsertar(new Item(1));
        listaA.lcInsertar(new Item(2));
        listaA.lcInsertar(new Item(3));
        listaA.lcInsertar(new Item(4));
        listaA.lcInsertar(new Item(5));
        
        System.out.println("Mostramos la lista");
        listaA.mostrar();
        System.out.println("");
        
        System.out.println("Mostramos la ventana: " + listaA.lcValor().getNumero());
        System.out.println("");
        
        System.out.println("Rotamos la lista");
        listaA.lcRotar();
        System.out.println("");
        
        System.out.println("Mostramos la lista");
        listaA.mostrar();
        System.out.println("");
        
        System.out.println("Mostramos la ventana: " + listaA.lcValor().getNumero());
        System.out.println("");
        
        System.out.println("Borramos un elemento");
        listaA.lcBorrar();
        System.out.println("");
        
        System.out.println("Mostramos la lista");
        listaA.mostrar();
        System.out.println("");
        
        System.out.println("Mostramos la ventana: " + listaA.lcValor().getNumero());
        System.out.println("");
        
        System.out.println("Borramos un elemento");
        listaA.lcBorrar();
        System.out.println("");
        
        System.out.println("Borramos un elemento");
        listaA.lcBorrar();
        System.out.println("");
        
        System.out.println("Mostramos la lista");
        listaA.mostrar();
        System.out.println("");
        
        System.out.println("Borramos un elemento");
        listaA.lcBorrar();
        System.out.println("");
        
        System.out.println("Mostramos la lista");
        listaA.mostrar();
        System.out.println("");
        
        System.out.println("Borramos un elemento");
        listaA.lcBorrar();
        System.out.println("");
        
        System.out.println("Mostramos la lista");
        listaA.mostrar();
        System.out.println("");
        
        problemaJosefo(41,3);
    }
    
    public static void problemaJosefo(int numeroRebeldes, int salto){
        
        // CREAMOS LISTA CIRCULAR CON n ITEMS
        int contador=numeroRebeldes;
        ListaCircular listaRebeldes = ListaCircular.lcVacia();
        while(contador>0){
            listaRebeldes.lcInsertar(new Item(contador));
            contador--;
        }
        
        System.out.println("Mostramos la lista");
        listaRebeldes.mostrar();
        System.out.println("");
        
        // SE SALTEA K Y SE BORRA UN ITEM HASTA QUE QUEDEN 2
        while(listaRebeldes.longitud()>2){
            listaRebeldes.lcRotar();
            listaRebeldes.lcRotar();
            listaRebeldes.lcBorrar();
        }
        
        System.out.println("Mostramos la lista");
        listaRebeldes.mostrar();
        System.out.println("");
    }
 }
        
