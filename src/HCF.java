import java.util.Scanner;

public class HCF {
    public void hcf(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbew for finding hcf");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if(a<b &&a<c){
            System.out.println(checkHCF(a,b,c));
        }
        else if (b<a &&b<c){
            System.out.println(checkHCF(b,a,c));
        }
        else {
            System.out.println(checkHCF(c,a,b));
        }
    }
    public int checkHCF(int a, int b,int c){
        if(b%a==0 && c%a==0){
            return a;
        }
        else{
            a=a/2;
        }
        return a;
    }
}
