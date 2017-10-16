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
public class Voiture {

    private String marque;
    private String modele;
    private Integer puissanceMoteur;
    boolean horsService = false;
    private String infos;
    private Personne conducteur;

    /**
     * Methode Constructeur de l' objet
     */
    public Voiture(String arg_marque, String arg_modele) {
        this.marque = arg_marque;
        this.modele = arg_modele;

    }

    public Personne getConducteur() {
        return conducteur;
    }

    public void setConducteur(Personne conducteur) {
        if(conducteur.peutConduire()){
        this.conducteur = conducteur;
    }else {
            System.out.println("ce conducteur ne peut pas conduire");
        }
    }

    public String getMarque() {
        return this.marque;
    }

    public String getModele() {
        return modele;
    }

    public int getPuissanceMoteur() {
        return puissanceMoteur;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setPuissanceMoteur(int puissanceMoteur) {
        if (puissanceMoteur <= 1500) {
            this.puissanceMoteur = puissanceMoteur;
        } else {
            System.out.println("la puissance ne peut être superieure à 1500cv");
        }
    }

    public boolean isHorsService() {
        return horsService;
    }

    public void setHorsService(boolean horsService) {
        this.horsService = horsService;
    }

    public String getInfos() {
        String infos = this.marque + " " + this.modele;
        if (this.puissanceMoteur != null) {
            infos += "" + this.puissanceMoteur + " chevaux";
        } else {
        }
        return infos;
    }

}
