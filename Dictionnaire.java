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
public class Dictionnaire extends Document{
    private String langue ;

    public Dictionnaire() {}

    public Dictionnaire(int NumEnr, String titre) {
        super(NumEnr, titre);
        this.langue = langue ;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return super.toString() + "langue=" + langue ;
    }
}
