/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_felixdominguez_12141043;

/**
 *
 * @author Lenovo I7
 */
public class Alienigena {
    private String nombre;
    private Raza raza;
    private int edad;
    private boolean amenaza;

    public Alienigena() {
        
    }

    public Alienigena(String nombre, Raza raza, int edad, boolean amenaza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.amenaza = amenaza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAmenaza() {
        return amenaza;
    }

    public void setAmenaza(boolean amenaza) {
        this.amenaza = amenaza;
    }
    
    public String getTipo(){
        return " ";
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public String toString2() {
        return nombre + raza + edad + amenaza ;
    }
       
}
