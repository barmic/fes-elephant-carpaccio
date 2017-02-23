package com.viseo.fes.elephant;

public class Commande {
    private int prixCommand;

    public void saisiePrix(int nbArticles, int prixUnitaire) {
        this.prixCommand += nbArticles * prixUnitaire;
    }

    public int valeur() {
        return prixCommand;
    }

    public int reduction() {
        return prixCommand > 1_000 ? 3 : 0;
    }
}
