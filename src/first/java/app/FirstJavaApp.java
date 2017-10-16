/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package first.java.app;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class FirstJavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String name;
        name = "Fabiola";
        Short age = 10;
        
        System.out.println("Entrez votre nom");
        //créer une instance de Scanner
        Scanner sc = new Scanner(System.in);
        //lecture de la saisie et affectation de la variable nom
        name = sc.next();
        System.out.println(" quel est votre age?");
        age = sc.nextShort();
        
        
        
        
        
       System.out.println("hello " + name + " vous avez " + age + " ans");
       if(age < 18){
           System.out.println("vous êtes mineur");
       }else{
           System.out.println("vous êtes majeur");
       }
        */
    }
        
    /**
     * Addition interactive d 'une liste de nombre saisi par utilisateur 
     */
    public static void addition(){
         // nombre saisi par l'utilisateur
    Short inputNumber;
    //le total de nombre saisis
    Integer total = 0;
    // Instanciation du scanner
    Scanner sc = new Scanner(System.in);
    //demande la saisie d' un nombre tant que la saisie correspond
    // à un nombre valide
    System.out.println("Veuillez saisir un nombre");
    while(sc.hasNextShort()){
        System.out.println("Veuillez saisir un autre nombre");
        
    }
    //Stockage de la saisie dans la variable inputNumber
    inputNumber = sc.nextShort();
    
    //totalisation
    total +=inputNumber;
    //Affichage du resultat
    System.out.println("la somme est" + total);
    
    
    
     }
}
