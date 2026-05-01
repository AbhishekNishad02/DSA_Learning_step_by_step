package Pattern;

public class check {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern (n x n)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print '*' if it's on the main or secondary diagonal
                if (j == i || j == n - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print space
                }
            }
            System.out.println(); // New line after each row
        }
    }
}


