/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolBinario;

/**
 *
 * @author Luis Medina Raed
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Trabajo Practico N8");
        System.out.println("Apellido y nombre: Medina Raed, Luis Eugenio");
        System.out.println("DNI: 44028471");
        System.out.println("");
        
        System.out.println("En primer lugar generamos un arbol de altura 5 con caracteres de relleno");

        ArbolB morse = generarArbol(5);
        System.out.println("");
        
        
        System.out.println("Mostramos el arbol generado:");
        morse.preorden();
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Luego, agregamos el codigo morse: ");
        System.out.println("");
       
        morse = insertarMorse(morse, ".-",new Item('A'));
        morse = insertarMorse(morse, "-...",new Item('B'));
        morse = insertarMorse(morse, "-.-.",new Item('C'));
        morse = insertarMorse(morse, "-..",new Item('D'));
        morse = insertarMorse(morse, ".",new Item('E'));
        morse = insertarMorse(morse, "..-.",new Item('F'));
        morse = insertarMorse(morse, "--.",new Item('G'));
        morse = insertarMorse(morse, "....",new Item('H'));
        morse = insertarMorse(morse, "..",new Item('I'));
        morse = insertarMorse(morse, ".---",new Item('J'));
        morse = insertarMorse(morse, "-.-",new Item('K'));
        morse = insertarMorse(morse, ".-..",new Item('L'));
        morse = insertarMorse(morse, "--",new Item('M'));
        morse = insertarMorse(morse, "-.",new Item('N'));
        morse = insertarMorse(morse, "---",new Item('O'));
        morse = insertarMorse(morse, ".--.",new Item('P'));
        morse = insertarMorse(morse, "--.-",new Item('Q'));
        morse = insertarMorse(morse, ".-.",new Item('R'));
        morse = insertarMorse(morse, "...",new Item('S'));
        morse = insertarMorse(morse, "-",new Item('T'));
        morse = insertarMorse(morse, "..-",new Item('U'));
        morse = insertarMorse(morse, "...-",new Item('V'));
        morse = insertarMorse(morse, ".--",new Item('W'));
        morse = insertarMorse(morse, "-..-",new Item('X'));
        morse = insertarMorse(morse, "-.--",new Item('Y'));
        morse = insertarMorse(morse, "--..",new Item('Z'));
        morse = insertarMorse(morse, ".----",new Item('1'));
        morse = insertarMorse(morse, "..---",new Item('2'));
        morse = insertarMorse(morse, "...--",new Item('3'));
        morse = insertarMorse(morse, "....-",new Item('4'));
        morse = insertarMorse(morse, ".....",new Item('5'));
        morse = insertarMorse(morse, "-....",new Item('6'));
        morse = insertarMorse(morse, "--...",new Item('7'));
        morse = insertarMorse(morse, "---..",new Item('8'));
        morse = insertarMorse(morse, "----.",new Item('9'));
        morse = insertarMorse(morse, "-----",new Item('0'));   
        
        System.out.println("Mostramos el arbol generado:");
        morse.preorden();
        System.out.println("");
        System.out.println("");
        
        System.out.println("Pertenece A? : " + morse.pertenece(new Item('A')));
        System.out.println("Pertenece D? : " + morse.pertenece(new Item('D')));
        System.out.println("Pertenece F? : " + morse.pertenece(new Item('F')));
        System.out.println("Pertenece T? : " + morse.pertenece(new Item('T')));
        System.out.println("Pertenece #? : " + morse.pertenece(new Item('#')));
        System.out.println("Pertenece !? : " + morse.pertenece(new Item('!')));
        System.out.println("Pertenece @? : " + morse.pertenece(new Item('@')));
        System.out.println("");
        
        System.out.println("A que letra corresponde -.-.? : " + decodificarLetraMorse("-.-.",morse).getDato());
        System.out.println("A que letra corresponde .-? : " + decodificarLetraMorse(".-",morse).getDato());
        System.out.println("A que letra corresponde ...? : " + decodificarLetraMorse("...",morse).getDato());
        System.out.println("A que letra corresponde --? : " + decodificarLetraMorse("--",morse).getDato());
        System.out.println("");
        
        System.out.println("Que significa ... --- ...? : " + decodificarPalabraMorse("... --- ...",morse));
        System.out.println("Que significa .- .-. -... --- .-.. -... .. -. .- .-. .. ---? : " + decodificarPalabraMorse(".- .-. -... --- .-.. -... .. -. .- .-. .. ---",morse));
        System.out.println("Que significa .-.. ..- .. ... -- . -.. .. -. .- .-. .- . -..? : " + decodificarPalabraMorse(".-.. ..- .. ... -- . -.. .. -. .- .-. .- . -..",morse));
        System.out.println("");
    }

    public static ArbolB generarArbol(int altura) {
        if (altura == 0) {
            return ArbolB.armarAB(ArbolB.ABVacio(), new Item('*'), ArbolB.ABVacio());
        }
        return ArbolB.armarAB(generarArbol(altura - 1), new Item('*'), generarArbol(altura - 1));
    }

    public static ArbolB insertarMorse(ArbolB arbol, String codigo, Item valor) {
        if (codigo.isEmpty()) {
            arbol.setRaiz(valor);
            return arbol; 
        } else {
            if (codigo.charAt(0) == '.') {
                return ArbolB.armarAB(insertarMorse(arbol.izquierdo(), codigo.substring(1), valor), arbol.raiz(), arbol.derecho()); //
            }
            if (codigo.charAt(0) == '-') {
                return ArbolB.armarAB(arbol.izquierdo(), arbol.raiz(), insertarMorse(arbol.derecho(), codigo.substring(1), valor));
            }
        }
        return null;  
    }
    
    public static Item decodificarLetraMorse (String codigo, ArbolB arbol){
        if (codigo.isEmpty()) {
            return arbol.raiz();
        } else {
            if (codigo.charAt(0) == '.') {
                return decodificarLetraMorse(codigo.substring(1), arbol.izquierdo());
            }
            if (codigo.charAt(0) == '-') {
                return decodificarLetraMorse(codigo.substring(1), arbol.derecho());
            }
        }
        return null;  
    }
    
    public static String decodificarPalabraMorse(String codigo, ArbolB arbol){ 
        String[] letras = codigo.split(" ");
        String palabra="";
        for (int i = 0; i < letras.length; i++) {
            palabra= palabra+decodificarLetraMorse(letras[i],arbol).getDato();
        }
        return palabra;
    }
}
