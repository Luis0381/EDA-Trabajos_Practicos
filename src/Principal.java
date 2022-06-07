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
        System.out.println("Trabajo Practico N6");
        System.out.println("Apellido y nombre: Medina Raed, Luis Eugenio");
        System.out.println("DNI: 44028471");
        System.out.println("");
        
        //PRUEBA DE OPERACIONES DEL ADT
        System.out.println("En primer lugar, creamos una fila (Fila A)");
        Fila filaA = Fila.filaVacia();
        
        System.out.println("La fila creada es una fila vacia? " + filaA.esFilavacia());
        
        System.out.println("Agregamos 5 items a la fila");
        filaA.enFila(new Item(1,"A"));
        filaA.enFila(new Item(2,"B"));
        filaA.enFila(new Item(3,"C"));
        filaA.enFila(new Item(4,"D"));
        filaA.enFila(new Item(5,"E"));
        
        System.out.println("Mostramos la fila A");
        filaA.mostrar();
        System.out.println("");
        
        System.out.println("El frente de la fila es: " + filaA.frente().getNombre() + "" + filaA.frente().getNumero());
        
        System.out.println("Hacemos 2 veces defila de la fila A");
        filaA.deFila();
        filaA.deFila();
        
        System.out.println("Mostramos la fila A");
        filaA.mostrar();
        System.out.println("");
        
        System.out.println("Creamos otra fila (Fila B) y agregamos items");
        Fila filaB = Fila.filaVacia();
        filaB.enFila(new Item(6,"F"));
        filaB.enFila(new Item(7,"G"));
        filaB.enFila(new Item(8,"H"));
        
        System.out.println("Mostramos la fila B");
        filaB.mostrar();
        System.out.println("");
        
        System.out.println("Son iguales estas dos filas? "+ filaA.igualF(filaB) );
        System.out.println("La fila B es igual a si misma? " + filaB.igualF(filaB));
        System.out.println("");
        
        System.out.println("Concatenamos ambas filas (Fila A y Fila B)");
        filaA.concat(filaB);
        
        System.out.println("Mostramos la fila concatenada");
        filaA.mostrar();
        System.out.println("");
        
        System.out.println("Invertimos la fila concatenada");
        filaA.invertir();
        
        System.out.println("Mostramos la fila concatenada invertida");
        filaA.mostrar();
        
        System.out.println("");
        System.out.println("");
        
        
        //PRUEBA DE FUNCIONES COMO USUARIO DEL ADT
        System.out.println("Ahora pasaremos a probar las operaciones como usuario");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Creamos dos filas C y D y agregamos items");

        Fila filaC = Fila.filaVacia();
        filaC.enFila(new Item(1,"A"));
        filaC.enFila(new Item(2,"B"));
        filaC.enFila(new Item(3,"C"));
        
        Fila filaD = Fila.filaVacia();
        filaD.enFila(new Item(4,"D"));
        filaD.enFila(new Item(5,"E"));
        filaD.enFila(new Item(6,"F"));
        
        System.out.println("Mostramos la fila C");
        filaC.mostrar();
        System.out.println("");
        System.out.println("Mostramos la fila D");
        filaD.mostrar();
        System.out.println("");
        
        System.out.println("Son iguales estas dos filas? "+ igualF(filaC,filaD));
        System.out.println("La fila D es igual a si misma? " + igualF(filaD,filaD));
        
        System.out.println("");
        System.out.println("Creamos una fila E y agregamos items");
        Fila filaE = Fila.filaVacia();
        filaE.enFila(new Item(7,"G"));
        filaE.enFila(new Item(8,"H"));
        filaE.enFila(new Item(9,"I"));
        
        System.out.println("Mostramos la fila E");
        filaE.mostrar();
        System.out.println("");
        
        System.out.println("Ahora invertimos la fila E");
        Fila filaF= invertir(filaE);
        
        System.out.println("Mostramos la fila invertida (Fila F)");
        filaF.mostrar();
        System.out.println("");
        
        System.out.println("Ahora creamos dos filas G y H, agregamos items y las concatenamos");
        Fila filaG = Fila.filaVacia();
        filaG.enFila(new Item(1,"A"));
        filaG.enFila(new Item(2,"B"));
        filaG.enFila(new Item(3,"C"));
        Fila filaH = Fila.filaVacia();
        filaH.enFila(new Item(4,"D"));
        filaH.enFila(new Item(5,"E"));
        filaH.enFila(new Item(6,"F"));
        
        System.out.println("Mostramos la fila G");
        filaG.mostrar();
        System.out.println("");
        
        System.out.println("Mostramos la fila H");
        filaH.mostrar();
        System.out.println("");
        
        Fila filaI= concat(filaG,filaH);
        
        System.out.println("Mostramos la fila concatenada (Fila I)");
        filaI.mostrar();
    }
    
    // METODOS COMO USUARIO DEL ADT
    
    public static boolean igualF(Fila filaA, Fila filaB){
        while(!filaA.esFilavacia() && !filaB.esFilavacia() && filaA.frente().getNumero()==filaB.frente().getNumero() && filaA.frente().getNombre().equals(filaB.frente().getNombre())){
            filaA.deFila();
            filaB.deFila();
        }
        return filaA.esFilavacia()&& filaB.esFilavacia();
    }
    
    public static Fila concat(Fila filaA, Fila filaB){
        while(!filaB.esFilavacia()){
            filaA.enFila(filaB.frente());
            filaB.deFila();
        }
        return filaA;
    }
    
    // METODO SOBRECARGADO PARA RECURSIVIDAD
    
    public static Fila invertir(Fila filaA){
        Fila filaInvertida= Fila.filaVacia();
        return invertir(filaA,filaInvertida);
    }
    
    public static Fila invertir(Fila filaA, Fila filaInvertida){
        if(!filaA.esFilavacia()){
            Item itemAux= filaA.frente();
            filaA.deFila();
            invertir(filaA,filaInvertida);
            filaInvertida.enFila(itemAux);
        }
        return filaInvertida;
    }
}
