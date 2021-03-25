/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.le.genie.projet_fiche_note;

/**
 *
 * @author ester maria
 */
public class Professeur {
    private String prenom;
    private String nom;
    private String adresse;
    private int age;
    private String telephone;
    private String email;
    private String specialite;
    
    public Professeur(String prenom, String nom, String adresse, int age, String telephone, String email, String specialite) 
    {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.specialite = specialite;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
    
    public String getSpcialite() {
        return specialite;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public  String toString(){
       return "Personne{" + "prenom=" + prenom + ", nom=" + nom + ", "
               + "adresse=" + adresse + ", age=" + age + ", telephone=" + telephone + 
               ", email=" + email + ", specialite=" + specialite + '}';
    }
    
}
