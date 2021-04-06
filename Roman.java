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
public class Roman extends Livre{
    
    private String PrixLitt ;

    public Roman() {}

    public Roman(int NumEnr, String titre) {
        super(NumEnr, titre);
        this.PrixLitt = PrixLitt ;
    }

    public String getPrixLitt() {
        return PrixLitt;
    }

    public void setPrixLitt(String PrixLitt) {
        this.PrixLitt = PrixLitt;
    }

    @Override
    public String toString() {
        return super.toString() + "PrixLitt=" + PrixLitt ;
    }
    
    
}
