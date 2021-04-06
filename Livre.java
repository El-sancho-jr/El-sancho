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
public class Livre extends Document {
   private String  auteur ;
   private int NmbrePage ;
   
   public Livre(){}

    public Livre(int NumEnr, String titre) {
        super(NumEnr, titre);
        this.NmbrePage = NmbrePage ;
        this.auteur = auteur ;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNmbrePage() {
        return NmbrePage;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNmbrePage(int NmbrePage) {
        this.NmbrePage = NmbrePage;
    }

    @Override
    public String toString() {
        return  super.toString()+ "auteur=" + auteur + ", NmbrePage=" + NmbrePage ;
    }
   
   
    
}
