import java.util.Scanner;

public class Prime_no {
    public void prime(){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean prime=true;
        if(num<=1){
            System.out.println("false");
            return;
        }
        if (num==2){
            System.out.println("true");
            return;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
        System.out.println(prime?"true":"false");
    }
}
