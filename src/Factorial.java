import java.util.Scanner;

public class Factorial {
    public void factorial(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int fat=1;
        for(int i=num;i>0;i--){
            fat=fat*i;
        }
        System.out.println(fat);
    }
}
