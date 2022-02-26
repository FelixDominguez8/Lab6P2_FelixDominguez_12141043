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
public class Abduscan extends Alienigena{
    private int abduscan;

    public Abduscan() {
        
    }

    public Abduscan(int abduscan, String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.abduscan = abduscan;
    }

    public int getAbduscan() {
        return abduscan;
    }

    public void setAbduscan(int abduscan) {
        this.abduscan = abduscan;
    }
    
    @Override
    public String getTipo(){
        return "Abduscan";
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
