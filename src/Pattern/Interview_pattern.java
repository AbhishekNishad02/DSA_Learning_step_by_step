package Pattern;

import java.util.Scanner;

public class Interview_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:- ");
        int n = sc.nextInt();

        int a = n + 3;
        int b = (n * 2) + ((n - 1) * 2);
        int mid = a / 2;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {

                if (i == 0 && j < n - 1) {
                    System.out.print("e ");
                }

                else if (i == a && j > b - (n - 1)) {
                    System.out.print("e ");
                }

                else if (i >= 1 && i <= a - 1 &&
                        (j == n - 1 || j == b - (n - 1))) {
                    System.out.print("* ");
                }

                // 🔄 middle ROW -> * (n times)
                else if  (j == b / 2 &&
                        i >= mid - n &&
                        i <= mid + n &&
                        i != mid) {
                    System.out.print("e ");
                }

                // 🔄 middle COLUMN -> e (n*2 times)
                else if(i == mid &&
                        j >= (b / 2) - (n / 2) &&
                        j <= (b / 2) + (n / 2))  {
                    System.out.print("8 ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
