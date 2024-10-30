import java.util.Scanner;
import java.math.*;
public class StrongNumber {
    public void strongNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number '123'");
        int num=sc.nextInt();
        int og=num;
        int sum=0;
        while (num!=0){
            int last=num%10;
            sum=sum+fac(last);
            num=num/10;
        }
        System.out.println(sum);
        if(og==sum){
            System.out.println("strong");
        }else{
            System.out.println("not a strong");
        }
    }
    public int fac(int num){
        int sum=1;
        for(int i=1;i<=num;i++){
            sum=sum*i;
        }
        return sum;
    }
}
