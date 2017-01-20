/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo_recursivite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonathan-gomez
 */
public class Exo_recursivite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //On cree une liste de theme vide
        List<Theme> themes = new ArrayList();
        //On ajoute des themes dans la liste
        themes.add(new Theme("Informatique"));
        themes.add(new Theme("Jeux"));
        themes.add(new Theme("Multimédia"));
        themes.add(new Theme("Football"));

        //On boucle dans le tableau pour afficher la liste
        for (Theme theme : themes) {
            System.out.println(theme.nom);
        }
        // Partie 2 : barre de nav sous theme de site internet
        Theme site = new Theme("Site internet");
        Theme informatique = new Theme("Informatique");
        informatique.themes.add(new Theme("Périphérique"));

        Theme pc = new Theme("PC FIXE");
        pc.themes.add(new Theme("Samsung"));

        Theme ordinateur = new Theme("Ordinateur");
        ordinateur.themes.add(pc);
        ordinateur.themes.add(new Theme("PC Portable"));
        informatique.themes.add(ordinateur);

        site.themes.add(informatique);
        site.themes.add(new Theme("Jeux vidéos"));
        System.out.println("Les sous thèmes de " + site.nom + " : ");

        for (Theme theme : site.themes) {
            System.out.println(theme.nom);

            for (Theme t : theme.themes) {
                System.out.println("\t" + t.nom);
                for (Theme ordi : t.themes) {

                    System.out.println("\t\t" + ordi.nom);

                    for (Theme boucle : ordi.themes) {
                        System.out.println("\t\t\t" + boucle.nom);
                       //
                    }

                }
            }

        }

    }

}
