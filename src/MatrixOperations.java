import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions
        System.out.print("Enter rows and columns of the matrices: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Input Matrix 1
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = scanner.nextInt();

        // Input Matrix 2
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = scanner.nextInt();

        // Addition
        System.out.println("\nAddition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((matrix1[i][j] + matrix2[i][j]) + " ");
            }
            System.out.println();
        }

        // Subtraction
        System.out.println("\nSubtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((matrix1[i][j] - matrix2[i][j]) + " ");
            }
            System.out.println();
        }

        // Multiplication (only if cols of Matrix1 == rows of Matrix2)
        if (cols != rows) {
            System.out.println("\nMultiplication not possible with non-square matrices of unequal dimensions.");
        } else {
            System.out.println("\nMultiplication:");
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < cols; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
