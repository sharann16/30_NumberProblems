import java.util.Scanner;

public class GCD {
    public void FindGCD(){
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
        sc.close();
    }
    public int gcd(int small,int large){
        while(large%small!=0){
                int temp=small;
                small=large%small;
                large=temp;
        }
        System.out.println(small);
        return small;
    }
}
