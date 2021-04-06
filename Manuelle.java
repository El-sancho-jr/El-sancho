/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.le.genie.exercice2;

/**
 *
 * @author ester maria
 */
public class Manuelle extends Livre {
    
    private int niveau ;
    public Manuelle(){}

    public Manuelle(int NumEnr, String titre) {
        super(NumEnr, titre);
        this.niveau = niveau ;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return super.toString() + "niveau=" + niveau ;
    }
    
}
