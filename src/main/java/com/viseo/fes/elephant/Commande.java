package com.viseo.fes.elephant;

public class Commande {
    private int prix;

    public void saisieArticle(int prix) {
        this.prix = prix;
    }

    public int valeur() {
        return prix;
    }
}
