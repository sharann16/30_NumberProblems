import java.util.Scanner;

public class Sum_of_firstn_natural {
    public void sum_of_natural(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
