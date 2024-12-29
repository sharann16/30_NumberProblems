import java.util.Scanner;

public class Perfect_number {
    public void PerfectNo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num/2;i++){
            if(num%i==0){
               sum+=i;
            }
        }
        if(sum==num){
        System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        sc.close();
    }
}
