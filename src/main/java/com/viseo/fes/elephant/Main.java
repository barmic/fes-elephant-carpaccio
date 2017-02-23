package com.viseo.fes.elephant;

public class Main {
    public static void main(String[] args) {
        Commande cmd = new Commande();
        int prix = 1001;
        int nbArticles = 5;

        cmd.saisiePrix(nbArticles, prix);
//        cmd.saisiePrix(4, 7);

        System.out.println("Montant commande " + cmd.valeur());
        System.out.println("Montant reduit " + cmd.prixReduit());
    }
}
