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
public class Conquistador extends Alienigena{
    ArrayList<Planeta> planetas=new ArrayList();

    public Conquistador() {
        
    }

    public Conquistador(String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
    }

    public Conquistador(ArrayList<Planeta> planetas, String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.planetas = planetas;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }
    
    @Override
    public String getTipo(){
        return "Conquistador";
    }

    @Override
    public String toString() {
        return super.toString()+" planetas=" + planetas;
    }
    
    
}
