import java.util.Scanner;
import java.math.*;

public class Armstrong_number {

    public void armstrong(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int copy=num;
        int sum=0;
        int length=(int)(Math.log10(num)+1);
        while(num!=0){
            int last=num%10;
            sum=sum+pow(last,length);
            num=num/10;
        }
        if(copy==sum){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        sc.close();
    }
    public int pow(int last,int length) {
        int power=1;
        for (int i = 1; i <= length; i++) {
            power=power*last;
        }
        return power;
    }
}
