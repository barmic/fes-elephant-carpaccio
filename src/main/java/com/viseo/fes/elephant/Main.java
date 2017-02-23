package com.viseo.fes.elephant;

public class Main {
    public static void main(String[] args) {
        Commande cmd = new Commande();

        cmd.saisieEtat(args[0]);

        for (int i = 1; i + 1 < args.length; i += 2) {
            int arts = Integer.parseInt(args[i]);
            int prix = Integer.parseInt(args[i+1]);

            cmd.saisiePrix(arts, prix);
        }

        System.out.println("Montant commande brut " + cmd.valeur());
        System.out.println("Montant reduit " + cmd.prixReduit());
        System.out.println("Montant avec taxe " + cmd.taxe());
        System.out.println("État de la commande " + cmd.etat());
    }
}
