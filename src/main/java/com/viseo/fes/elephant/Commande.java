package com.viseo.fes.elephant;

import java.util.HashMap;
import java.util.Map;

public class Commande {
    private Map<String, Double> taxes = new HashMap<>();
//    private Map<Integer, Integer> articles = new HashMap<>();
    private int prixCommand;
    private String etat;

    public Commande() {
        taxes.put("UT", 6.85);
        taxes.put("NV", 8d);
        taxes.put("TX", 6.25);
        taxes.put("AL", 4d);
        taxes.put("CA", 8.25);
    }

    public void saisiePrix(int nbArticles, int prixUnitaire) {
        this.prixCommand += nbArticles * prixUnitaire;
        System.out.println("Articles " + nbArticles + " => " + prixUnitaire + '$');
    }

    public int valeur() {
        return prixCommand;
    }

    public int reduction() {
        if (prixCommand >= 50_000) {
            return 15;
        } if (prixCommand >= 10_000) {
            return 10;
        } if (prixCommand >= 7_000) {
            return 7;
        } if (prixCommand >= 5_000) {
            return 5;
        } if (prixCommand >= 1_000) {
            return 3;
        }
        return 0;
    }

    public double prixReduit() {
        return prixCommand - (prixCommand * reduction() / 100d);
    }

    public double taxe() {
        return prixReduit() + (prixReduit() * taxes.getOrDefault(etat, 0d) / 100d);
    }

    public void saisieEtat(String etat) {
        this.etat = etat;
    }

    public String etat() {
        return etat;
    }
}
