package com.viseo.fes.elephant;

public class Main {
    public static void main(String[] args) {
        Commande cmd = new Commande();
        cmd.saisieArticle(12);

        System.out.println("Montant commande " + cmd.valeur());
    }
}
