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
public class Explorador extends Alienigena{
    private ArrayList<Planeta> planetas=new ArrayList();
    private Planeta favorito;

    public Explorador() {
        
    }

    public Explorador(Planeta favorito, String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.favorito = favorito;
    }

    public Explorador(ArrayList<Planeta> planetas, Planeta favorito, String nombre, Raza raza, int edad, boolean amenaza) {
        super(nombre, raza, edad, amenaza);
        this.planetas = planetas;
        this.favorito = favorito;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }

    public Planeta getFavorito() {
        return favorito;
    }

    public void setFavorito(Planeta favorito) {
        this.favorito = favorito;
    }

    @Override
    public String toString() {
        return super.toString() + " planetas=" + planetas + ", favorito=" + favorito;
    }
    
    
}
