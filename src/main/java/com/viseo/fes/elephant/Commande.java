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
        if (prixCommand > 50_000) {
            return 15;
        } if (prixCommand > 10_000) {
            return 10;
        } if (prixCommand > 7_000) {
            return 7;
        } if (prixCommand > 5_000) {
            return 5;
        } if (prixCommand > 1_000) {
            return 3;
        }
        return 0;
    }

    public double prixReduit() {
        return prixCommand - (prixCommand * reduction() / 100d);
    }

    public double taxe() {
        double taxe = 6.85;
        return prixReduit() + (prixReduit() * taxe / 100d);
    }
}
