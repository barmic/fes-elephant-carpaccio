package com.viseo.fes.elephant;

public class Main {
    public static void main(String[] args) {
        Commande cmd = new Commande();
        int prix = 1001;
        int nbArticles = 5;

        cmd.saisiePrix(nbArticles, prix);
        String etat = "UT";
        cmd.saisieEtat(etat);
//        cmd.saisiePrix(4, 7);

        System.out.println("Montant commande " + cmd.valeur());
        System.out.println("Montant reduit " + cmd.prixReduit());
        System.out.println("Montant avec taxe " + cmd.taxe());
        System.out.println("État de la commande " + cmd.etat());
    }
}
