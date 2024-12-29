import java.util.Scanner;

public class LCM {
    public void lcm(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number one by one");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<b){
            System.out.println(findLcm(a,b));
        }
        else{
            System.out.println(findLcm(b,a));
        }
    }
    public int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int findLcm(int a,int b){

        return (a*b)/findGcd(a,b);
    }
}
