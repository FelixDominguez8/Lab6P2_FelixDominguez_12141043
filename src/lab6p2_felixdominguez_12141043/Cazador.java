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
public class Cazador extends Alienigena{
    private int atrapados;

    public Cazador() {
    }

    public Cazador(int atrapados, String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.atrapados = atrapados;
    }

    public int getAtrapados() {
        return atrapados;
    }

    public void setAtrapados(int atrapados) {
        this.atrapados = atrapados;
    }
    
    @Override
    public String getTipo(){
        return "Cazador";
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
