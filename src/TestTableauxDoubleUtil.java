import TP3_EX4.TableauxDoubleUtil;

public class TestTableauxDoubleUtil {
    public static void main(String[] args) {

        double[][] t1 = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };

        double[][] t2 = {
            {10.0, 20.0, 30.0},
            {40.0, 50.0, 60.0}
        };

        System.out.println("Tableau t1 :");
        TableauxDoubleUtil.affiche(t1);

        System.out.println("\nTableau t2 :");
        TableauxDoubleUtil.affiche(t2);

        System.out.println("\nT1 est regulier ? " + TableauxDoubleUtil.regulier(t1));

        System.out.println("\nSomme des lignes de t1 :");
        double[] sommes = TableauxDoubleUtil.sommeLignes(t1);
        for (double s : sommes) {
            System.out.println(s);
        }

        System.out.println("\nSomme de t1 et t2 :");
        double[][] somme = TableauxDoubleUtil.somme(t1, t2);
        TableauxDoubleUtil.affiche(somme);
    }
}
