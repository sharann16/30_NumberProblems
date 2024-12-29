import java.util.Scanner;
public class Nth_fibonacci {
    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close();
            return;
        }
        if (num == 0) {
            System.out.println("Fibonacci number at position " + num + " is 0.");
            sc.close();
            return;
        } else if (num == 1) {
            System.out.println("Fibonacci number at position " + num + " is 1.");
            sc.close();
            return;
        }
        int a = 0, b = 1;
        int nth = 0;
        for (int i = 2; i <= num; i++) {
            nth = a + b;
            a = b;
            b = nth;
        }
        System.out.println("Fibonacci number at position " + num + " is " + nth + ".");
        sc.close();
    }
}