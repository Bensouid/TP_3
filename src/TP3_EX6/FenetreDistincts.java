package TP3_EX6;
import java.util.Scanner;

public class FenetreDistincts {

    static final int MAXV = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lecture des données
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] T = new int[n];
        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int[] freq = new int[MAXV + 1];
        int distinct = 0;

        // Initialisation de la première fenêtre [0..k-1]
        
        for (int i = 0; i < k; i++) {
            int x = T[i];
            if (freq[x] == 0) {
                distinct++;
            }
            freq[x]++;
        }

        // Affichage du résultat pour la première fenêtre
        
        System.out.print(distinct);

        // Glissement de la fenêtre
        
        for (int i = k; i < n; i++) {
            int out = T[i - k]; // élément sortant
            freq[out]--;
            if (freq[out] == 0) {
                distinct--;
            }

            int in = T[i]; // élément entrant
            if (freq[in] == 0) {
                distinct++;
            }
            freq[in]++;

            System.out.print(" " + distinct);
        }

        System.out.println();
        sc.close();
    }
}
