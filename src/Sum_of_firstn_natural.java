import java.util.Scanner;

public class Sum_of_firstn_natural {
    public void sum_of_natural(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sum=n*(n+1)/2;
        System.out.println(sum);
        sc.close();
    }
}
