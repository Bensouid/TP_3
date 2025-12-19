package TP3_EX4;
public class TableauxDoubleUtil {

    // Affiche le tableau : une ligne par ligne du tableau
    public static void affiche(double[][] t) {
        if (t == null) {
            System.out.println("Tableau null");
            return;
        }

        for (double[] ligne : t) {
            for (double val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Teste si le tableau est régulier
    public static boolean regulier(double[][] t) {
        if (t == null || t.length == 0) return true;

        int taille = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != taille) {
                return false;
            }
        }
        return true;
    }

    // Renvoie un tableau contenant la somme de chaque ligne
    public static double[] sommeLignes(double[][] t) {
        if (t == null) return null;

        double[] sommes = new double[t.length];

        for (int i = 0; i < t.length; i++) {
            double somme = 0;
            for (double val : t[i]) {
                somme += val;
            }
            sommes[i] = somme;
        }
        return sommes;
    }

    // Somme de deux tableaux
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (t1 == null || t2 == null) return null;
        if (!regulier(t1) || !regulier(t2)) return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length) return null;

        double[][] resultat = new double[t1.length][t1[0].length];

        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                resultat[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return resultat;
    }
}
