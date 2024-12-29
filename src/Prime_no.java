import java.util.Scanner;

public class Prime_no {
    public static void prime() {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Edge cases
        if (num <= 1) {
            System.out.println("false");
            sc.close();
            return;
        }
        if (num == 2) {
            System.out.println("true");
            sc.close();
            return;
        }

        // Check divisors up to the square root of the number
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "true" : "false");
        sc.close();
    }

    public static void main(String[] args) {
        prime();
    }
}
