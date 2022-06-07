/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medina Raed, Luis Eugenio
 */
public class Item {
    private int numero;
    private String nombre;

    // CONSTRUCTOR
    public Item(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    
    // GETTERS & SETTERS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
