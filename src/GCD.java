import java.util.Scanner;

public class GCD {
    public void display(){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter teo number one by one");
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>b){
            gcd(b,a);
        }
        else {
            gcd(a,b);
        }
    }
    public int gcd(int small,int large){
        while(large%small!=0){
                int temp=small;
                small=large%small;
                large=temp;
        }
        System.out.println(large);
        return large;
    }
}
