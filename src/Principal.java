/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luis Medina Raed
 */
public class Principal {
    
    public static void main(String[] args) {
        Pila pilaA= Pila.nuevaPila();
        Pila pilaB= Pila.nuevaPila();
        
        System.out.println("Creamos dos pilas y verificamos si son iguales la pila A y la pila B? "+ Pila.igualdadPilas(pilaA, pilaB));
        
        System.out.println("En primer lugar, agregamos 5 items a la pila");
        pilaA.push(new Item(1));
        pilaA.push(new Item(2));
        pilaA.push(new Item(3));
        pilaA.push(new Item(4));
        pilaA.push(new Item(5));
        
        System.out.println("Creamos otra pila igual");
        pilaB.push(new Item(1));
        pilaB.push(new Item(2));
        pilaB.push(new Item(3));
        pilaB.push(new Item(4));
        pilaB.push(new Item(5));
        
        System.out.println("La altura de la pila A es: "+ pilaA.altura()+" y la altura de la pila B es: "+ pilaB.altura());
        
        System.out.println("Son iguales la pila A y la pila B? "+ Pila.igualdadPilas(pilaA, pilaB));
        
        System.out.println("Hacemos POP 2 veces de la pila A");
        pilaA.pop();
        pilaA.pop();
        
        System.out.println("Son iguales la pila A y la pila B? "+ Pila.igualdadPilas(pilaA, pilaB));
        
        System.out.println("El elemento en el tope A es: "+ pilaA.top().getNumero());
        
        System.out.println("Los elementos de la pila A son: ");
        pilaA.mostrarPila();
        System.out.println("Los elementos de la pila B son: ");
        pilaB.mostrarPila();
        
        System.out.println("Ahora apilamos ambas pilas");
        Pila pilaC= Pila.nuevaPila();
        pilaC= Pila.apilarPilas(pilaA, pilaB);
        System.out.println("Los elementos de la pila C son: ");
        pilaC.mostrarPila();
        
        System.out.println("Los elementos de la pila A son: ");
        pilaA.mostrarPila();
        System.out.println("Los elementos de la pila B son: ");
        pilaB.mostrarPila();
        
        
        
        
    }
}
