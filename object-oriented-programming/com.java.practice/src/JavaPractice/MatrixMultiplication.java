package JavaPractice;
import java.util.Scanner;
public class MatrixMultiplication {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Read dimensions of matrix A
            System.out.print("Enter rows and columns of matrix A (M N): ");
            int M = sc.nextInt();
            int N = sc.nextInt();

            // Read dimensions of matrix B
            System.out.print("Enter rows and columns of matrix B (N P): ");
            int N2 = sc.nextInt();
            int P = sc.nextInt();

            // Validate: columns of A must equal rows of B
            if (N != N2) {
                System.out.println("Error: Number of columns of A (" + N +
                        ") does not equal number of rows of B (" + N2 + ")");
                sc.close();
                return;
            }

            // Initialize matrices
            int[][] A = new int[M][N];
            int[][] B = new int[N][P];
            int[][] C = new int[M][P];

            // Read matrix A
            System.out.println("Enter matrix A (" + M + "x" + N + "):");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Read matrix B
            System.out.println("Enter matrix B (" + N + "x" + P + "):");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < P; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Matrix multiplication: C = A * B
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < P; j++) {
                    int sum = 0;
                    for (int k = 0; k < N; k++) {
                        sum += A[i][k] * B[k][j];
                    }
                    C[i][j] = sum;
                }
            }

            // Print result matrix C row by row
            System.out.println("C =");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < P; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }

