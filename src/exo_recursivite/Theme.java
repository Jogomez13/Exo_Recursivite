package exo_recursivite;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathan-gomez
 */
public class Theme {
    public String nom = "";
     //On cree une liste de theme vide
        List<Theme> themes = new ArrayList();

    public Theme(String nom) {
        this.nom = nom;
    }
    
}
