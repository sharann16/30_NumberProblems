import java.util.Scanner;
public class Sum_of_firstn_natural {
    public void sum_of_natural() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close();
            return;
        }
        int sum = n * (n + 1) / 2;
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        sc.close();
    }

}
