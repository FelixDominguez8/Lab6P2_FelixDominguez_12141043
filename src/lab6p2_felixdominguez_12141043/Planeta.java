/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_felixdominguez_12141043;

import java.util.ArrayList;

/**
 *
 * @author Lenovo I7
 */
public class Planeta {
    private String nombre;
    private int temperatura;
    private int tamanio;
    private boolean agua;
    private ArrayList<Alienigena> habitantes=new ArrayList();

    public Planeta() {
        
    }

    public Planeta(String nombre, int temperatura, int tamanio, boolean agua) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.tamanio = tamanio;
        this.agua = agua;
    }

    public Planeta(String nombre, int temperatura, int tamanio, boolean agua, ArrayList<Alienigena> habitantes) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.tamanio = tamanio;
        this.agua = agua;
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public ArrayList<Alienigena> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(ArrayList<Alienigena> habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", temperatura=" + temperatura + ", tamanio=" + tamanio + ", agua=" + agua + ", habitantes=" + habitantes;
    }
    
}
