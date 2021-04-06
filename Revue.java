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
public class Revue extends Document{
    private String mois ;
    private int annee ;

    public Revue() {}

    public Revue(int NumEnr, String titre) {
        super(NumEnr, titre);
        this.mois = mois ;
        this.annee = annee ;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return super.toString() + "mois=" + mois + ", annee=" + annee ;
    }
    
    
    
}
