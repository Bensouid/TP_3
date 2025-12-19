package TP3_EX5;

import java.util.Scanner;

public class RotationMatrice {

    // Affichage de la matrice
	
    static void afficher(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Rotation 90° horaire (en place)
    
    static void rotate90ClockwiseInPlace(int[][] A) {
        int n = A.length;

        // 1) Transposition
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }

        // 2) Renverser chaque ligne
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = tmp;
            }
        }
    }

    // BONUS : rotation 90° antihoraire
    
    static void rotate90CounterClockwiseInPlace(int[][] A) {
        int n = A.length;

        // Transposition
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = tmp;
            }
        }

        // Renverser chaque colonne
        
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n / 2; i++) {
                int tmp = A[i][j];
                A[i][j] = A[n - 1 - i][j];
                A[n - 1 - i][j] = tmp;
            }
        }
    }

    // BONUS : rotation 180°
    static void rotate180InPlace(int[][] A) {
        int n = A.length;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = A[i][j];
                A[i][j] = A[n - 1 - i][n - 1 - j];
                A[n - 1 - i][n - 1 - j] = tmp;
            }
        }

        // Si n impair, inverser la ligne centrale
        
        if (n % 2 == 1) {
            int i = n / 2;
            for (int j = 0; j < n / 2; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = tmp;
            }
        }
    }

    // Programme principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] A = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        rotate90ClockwiseInPlace(A);
        afficher(A);

        sc.close();
    }
}
