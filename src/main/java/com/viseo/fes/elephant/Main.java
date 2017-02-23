package com.viseo.fes.elephant;

public class Main {
    public static void main(String[] args) {
        Commande cmd = new Commande();
        int prix = 1001;
        int nbArticles = 5;

        cmd.saisiePrix(nbArticles, prix);
        cmd.saisiePrix(4, 7);
        cmd.saisieEtat("AL");

        System.out.println("Montant commande brut " + cmd.valeur());
        System.out.println("Montant reduit " + cmd.prixReduit());
        System.out.println("Montant avec taxe " + cmd.taxe());
        System.out.println("État de la commande " + cmd.etat());
    }
}
