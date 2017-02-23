package com.viseo.fes.elephant;

public class Main {
    public static void main(String[] args) {
        Commande cmd = new Commande();
        int prix = 12;
        int nbArticles = 4;

        cmd.saisiePrix(nbArticles, prix);

        System.out.println("Montant commande " + cmd.valeur());
    }
}
