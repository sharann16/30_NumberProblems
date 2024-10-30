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
    public int findLcm(int a,int b){
        while (b%a!=0){
            if(b%a!=0){
                b*=2;
            }
        }
        return b;
    }
}
