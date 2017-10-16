/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.java.app;

/**
 *
 * @author Administrateur
 */
public class Personne {

    private String nom;
    private String prenom;
    private Byte age;
    private char sexe;

    public Personne(String nom, String prenom, Byte age, char sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Byte getAge() {
        if (age < 0 || age > 120) {
            System.out.println("l'age est incoherant");
        } else {
            this.age = age;
        }
        return null;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        if (sexe == 'F' || sexe == 'M') {
            this.sexe = sexe;
        } else {
            System.out.println("le sexe doit être F ou M");
        }

    }

    public String toString() {
        String infos;
        infos = this.prenom + " " + this.nom.toUpperCase();
        return infos;
    }
    
    public boolean peutConduire(){
        return this.age >17&& this.age <90;
    }

}///fin de classe
