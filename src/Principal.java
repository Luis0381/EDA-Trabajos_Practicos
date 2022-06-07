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
        System.out.println("En primer lugar, creamos un club");
        System.out.println("");
        Club miClub= Club.clubVacio(); //SE CREA UN CLUB
        
        System.out.println("El club es vacio?: " + miClub.estaVacio()); //MUESTRA SI EL CLUB ESTA VACIO
        System.out.println("Cantidad de socios: " + miClub.cantidad()); //MUESTRA CANTIDAD SOCIOS
        System.out.println("");
        
        System.out.println("Agregamos 10 socios"); //SE AGREGAN 10 SOCIOS CON NUMEROS DEL 1 AL 10
        System.out.println("");
        miClub.altaSocio(new Socio(1));
        miClub.altaSocio(new Socio(2));
        miClub.altaSocio(new Socio(3));
        miClub.altaSocio(new Socio(4));
        miClub.altaSocio(new Socio(5));
        miClub.altaSocio(new Socio(6));
        miClub.altaSocio(new Socio(7));
        miClub.altaSocio(new Socio(8));
        miClub.altaSocio(new Socio(9));
        miClub.altaSocio(new Socio(10));
        
        System.out.println("Socios del club:"); //SE MUESTRAN EN PANTALLA TODOS LOS SOCIOS DEL CLUB
        miClub.mostrarClub();
        System.out.println("");
        
        System.out.println("El club es vacio?: " + miClub.estaVacio()); //MUESTRA SI EL CLUB ESTA VACIO
        System.out.println("Cantidad de socios: " + miClub.cantidad()); //MUESTRA CANTIDAD SOCIOS
        System.out.println("El ultimo socio es: " + miClub.ultimoSocio().getNumeroSocio()); //MUESTRA ULTIMO SOCIO AGREGADO
        System.out.println("Esta el socio numero 5?: " + miClub.esta(new Socio(5))); //SE VERIFICA SI SE AGREGARON AL CLUB LOS SOCIOS 5,15 Y 17
        System.out.println("Esta el socio numero 15?: " + miClub.esta(new Socio(15)));
        System.out.println("Esta el socio numero 17?: " + miClub.esta(new Socio(17)));
        System.out.println("");
        
        System.out.println("Agregamos 10 socios mas");//SE AGREGAN 10 SOCIOS CON NUMEROS DEL 11 AL 20
        System.out.println("");
        miClub.altaSocio(new Socio(11));
        miClub.altaSocio(new Socio(12));
        miClub.altaSocio(new Socio(13));
        miClub.altaSocio(new Socio(14));
        miClub.altaSocio(new Socio(15));
        miClub.altaSocio(new Socio(16));
        miClub.altaSocio(new Socio(17));
        miClub.altaSocio(new Socio(18));
        miClub.altaSocio(new Socio(19));
        miClub.altaSocio(new Socio(20));
        
        System.out.println("Socios del club:"); //SE MUESTRAN EN PANTALLA TODOS LOS SOCIOS DEL CLUB
        miClub.mostrarClub();
        System.out.println("");
        
        System.out.println("El club es vacio?: " + miClub.estaVacio()); //MUESTRA SI EL CLUB ESTA VACIO
        System.out.println("Cantidad de socios: " + miClub.cantidad()); //MUESTRA CANTIDAD DE SOCIOS
        System.out.println("El ultimo socio es: " + miClub.ultimoSocio().getNumeroSocio()); //MUESTRA ULTIMO SOCIO
        System.out.println("Esta el socio numero 15?: " + miClub.esta(new Socio(15))); //SE VERIFICA SI SE AGREGARON AL CLUB LOS SOCIOS 15,17,20,21
        System.out.println("Esta el socio numero 17?: " + miClub.esta(new Socio(17)));
        System.out.println("Esta el socio numero 20?: " + miClub.esta(new Socio(20)));
        System.out.println("Esta el socio numero 21?: " + miClub.esta(new Socio(21)));
        System.out.println("");
        
        System.out.println("Borramos el ultimo socio"); //SE BORRA EL ULTIMO SOCIO AGREGADO
        miClub.borrarUltimoSocio();


        System.out.println("Esta el socio numero 20?: " + miClub.esta(new Socio(20))); //SE VERIFICA SI SE BORRÓ EL SOCIO 20
        System.out.println("");
        
        System.out.println("Ahora creamos dos clubes, uno con miembros del 1 al 10 y otro del 5 al 15"); 
        System.out.println("");
        
        Club clubA= Club.clubVacio(); 
        Club clubB= Club.clubVacio();
        
        clubA.altaSocio(new Socio(1));
        clubA.altaSocio(new Socio(2));
        clubA.altaSocio(new Socio(3));
        clubA.altaSocio(new Socio(4));
        clubA.altaSocio(new Socio(5));
        clubA.altaSocio(new Socio(6));
        clubA.altaSocio(new Socio(7));
        clubA.altaSocio(new Socio(8));
        clubA.altaSocio(new Socio(9));
        clubA.altaSocio(new Socio(10)); //SE CREA UN CLUB A CON SOCIOS DEL 1 AL 10
        
        clubB.altaSocio(new Socio(5));
        clubB.altaSocio(new Socio(6));
        clubB.altaSocio(new Socio(7));
        clubB.altaSocio(new Socio(8));
        clubB.altaSocio(new Socio(9));
        clubB.altaSocio(new Socio(10));
        clubB.altaSocio(new Socio(11));
        clubB.altaSocio(new Socio(12));
        clubB.altaSocio(new Socio(13));
        clubB.altaSocio(new Socio(14));
        clubB.altaSocio(new Socio(15)); //SE CREA UN CLUB A CON SOCIOS DEL 5 AL 15
        
        System.out.println("Socios del club A:");
        clubA.mostrarClub(); //SE MUESTRA EN PANTALLA CLUB A
        System.out.println("");
        
        System.out.println("Socios del club B:");
        clubB.mostrarClub(); //SE MUESTRA EN PANTALLA CLUB B
        System.out.println("");
        
        System.out.println("Unimos ambos clubes y chequeamos que no se haya agregado al mismo socio dos veces");
        System.out.println("");
        
        Club clubC= Club.clubVacio();
        clubC = union(clubB,clubA); //SE UNEN CLUB A Y CLUB B EN UN NUEVO CLUB
        
        System.out.println("Socios del club unido:");
        clubC.mostrarClub(); //SE MUESTRA EN PANTALLA EL CLUB UNIDO
        System.out.println("");
    }
    
    public static Club union(Club clubA,Club clubB){
        Club nuevoClub= Club.clubVacio(); 
        while(!clubA.estaVacio()){ //SE AGREGAN TODOS LOS SOCIOS DEL CLUB A AL CLUB UNION
            nuevoClub.altaSocio(clubA.ultimoSocio());
            clubA.borrarUltimoSocio();
        }
        while(!clubB.estaVacio()){ //SE AGREGAN TODOS LOS SOCIOS DEL CLUB B QUE NO HAYAN SIDO AÑADIDOS(POR PERTENECER TAMBIEN AL CLUB A)AL CLUB UNION
            if(!nuevoClub.esta(clubB.ultimoSocio())){
            nuevoClub.altaSocio(clubB.ultimoSocio());
            }
            clubB.borrarUltimoSocio();
        }
        return nuevoClub;
    }
}
