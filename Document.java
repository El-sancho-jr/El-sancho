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
public class Document {
    private int NumEnre ;
    private String titre ;
    
    public Document(){}
    
    public Document(int NumEnr, String titre)
    {
        this.NumEnre = NumEnr;
        this.titre = titre ; 
    }

    public int getNumEnre() {
        return NumEnre;
    }

    public String getTitre() {
        return titre;
    }

    public void setNumEnre(int NumEnre) {
        this.NumEnre = NumEnre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document{" + "NumEnre=" + NumEnre + ", titre=" + titre + '}';
    }
    
}
