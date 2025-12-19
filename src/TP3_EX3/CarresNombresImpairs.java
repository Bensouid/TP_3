package TP3_EX3;
import java.util.Scanner;

public class CarresNombresImpairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de valeurs : ");
        int n = sc.nextInt();

        int[] impairs = new int[n];
        int[] carres = new int[n];

        for (int i = 0; i < n; i++) {
            impairs[i] = 2 * i + 1;
            carres[i] = impairs[i] * impairs[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(impairs[i] + " a pour carre " + carres[i]);
        }

        sc.close();
    }
}
