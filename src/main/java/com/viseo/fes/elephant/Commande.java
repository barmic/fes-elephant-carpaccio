package com.viseo.fes.elephant;

public class Commande {
    private int prixCommand;

    public void saisiePrix(int nbArticles, int prixUnitaire) {
        this.prixCommand += nbArticles * prixUnitaire;
    }

    public int valeur() {
        return prixCommand;
    }
}
