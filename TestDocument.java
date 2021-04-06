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
public class TestDocument {
    public static void main(String [] args)
    {
        Document doc = new Document();
        doc.setNumEnre(0);
        doc.setTitre("lucky luke");
        
        Livre liv = new Livre();
        liv.setAuteur("Jean Martin");
        liv.setNmbrePage(70);
        
        Revue rev =  new Revue();
        rev.setMois("Octobre");
        rev.setAnnee(1997);
        
        Dictionnaire dic = new Dictionnaire();
        dic.setLangue("Anglais");
        
        Roman rom = new Roman();
        rom.setPrixLitt("INTERALLE");
        
        Manuelle man = new Manuelle();
        man.setNiveau(1);
        
        System.out.println("Numero du livre: "+doc.getNumEnre());
        System.out.println("Titre du livre: "+doc.getTitre());
        System.out.println("Auteyr du livre: "+liv.getAuteur());  
        System.out.println("Nombre de page: "+liv.getNmbrePage());  
        System.out.println("Mois de sortie: "+rev.getMois());
        System.out.println("Anneé de sortie: "+rev.getAnnee());
        System.out.println("Langue: "+dic.getLangue());
        System.out.println("Prix litteraire: "+rom.getPrixLitt());
        System.out.println("Niveau du livre: "+man.getNiveau());
    }
}
