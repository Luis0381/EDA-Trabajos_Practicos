/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolb;

/**
 *
 * @author Luis Medina Raed
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArbolB morse = generarArbol(5);
        
        System.out.println("En primer lugar printeamos el arbol vacio:");
        morse.preorden();
        
        System.out.println("");
        
        System.out.println("Luego, agregamos el codigo morse: ");
       
        morse = insertarMorse(morse, ".-",'A');
        morse = insertarMorse(morse, "-...",'B');
        morse = insertarMorse(morse, "-.-.",'C');
        morse = insertarMorse(morse, "-..",'D');
        morse = insertarMorse(morse, ".",'E');
        morse = insertarMorse(morse, "..-.",'F');
        morse = insertarMorse(morse, "--.",'G');
        morse = insertarMorse(morse, "....",'H');
        morse = insertarMorse(morse, "..",'I');
        morse = insertarMorse(morse, ".---",'J');
        morse = insertarMorse(morse, "-.-",'K');
        morse = insertarMorse(morse, ".-..",'L');
        morse = insertarMorse(morse, "--",'M');
        morse = insertarMorse(morse, "-.",'N');
        morse = insertarMorse(morse, "---",'O');
        morse = insertarMorse(morse, ".--.",'P');
        morse = insertarMorse(morse, "--.-",'Q');
        morse = insertarMorse(morse, ".-.",'R');
        morse = insertarMorse(morse, "...",'S');
        morse = insertarMorse(morse, "-",'T');
        morse = insertarMorse(morse, "..-",'U');
        morse = insertarMorse(morse, "...-",'V');
        morse = insertarMorse(morse, ".--",'W');
        morse = insertarMorse(morse, "-..-",'X');
        morse = insertarMorse(morse, "-.--",'Y');
        morse = insertarMorse(morse, "--..",'Z');
        morse = insertarMorse(morse, ".----",'1');
        morse = insertarMorse(morse, "..---",'2');
        morse = insertarMorse(morse, "...--",'3');
        morse = insertarMorse(morse, "....-",'4');
        morse = insertarMorse(morse, ".....",'5');
        morse = insertarMorse(morse, "-....",'6');
        morse = insertarMorse(morse, "--...",'7');
        morse = insertarMorse(morse, "---..",'8');
        morse = insertarMorse(morse, "----.",'9');
        morse = insertarMorse(morse, "-----",'0');   
        
        morse.preorden();
        System.out.println("");
        
        
        System.out.println("A que letra corresponde -----? : " + decodificarLetraMorse("-----",morse));
        System.out.println("A que letra corresponde ..-? : " + decodificarLetraMorse("..-",morse));
        System.out.println("A que letra corresponde .---? : " + decodificarLetraMorse(".---",morse));
        System.out.println("A que letra corresponde ..-.? : " + decodificarLetraMorse("..-.",morse));
        
        System.out.println("Que significa ... --- ...? : " + decodificarPalabraMorse("... --- ...",morse));
    }

    public static ArbolB generarArbol(int altura) {
        if (altura == 0) {
            return ArbolB.armarAB(ArbolB.ABVacio(), '*', ArbolB.ABVacio());
        }
        return ArbolB.armarAB(generarArbol(altura - 1), '*', generarArbol(altura - 1));
    }

    public static ArbolB insertarMorse(ArbolB arbol, String codigo, Character valor) {
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
    
    public static Character decodificarLetraMorse (String codigo, ArbolB arbol){
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
            palabra= palabra+decodificarLetraMorse(letras[i],arbol);
        }
        return palabra;
    }
}
