import java.util.Scanner;

public class nth_fibonacci {
    public void finbonacci(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter nubre");
        int num=sc.nextInt();
        if (num == 0) {
            System.out.println("Fibonacci number at position " + num + " is 0.");
            return;
        } else if (num == 1) {
            System.out.println("Fibonacci number at position " + num + " is 1.");
            return;
        }
        int a=0,b=1;
        int nth=0;
        for(int i=2;i<=num;i++){
            nth=a+b;
            a=b;
            b=nth;
        }
        System.out.println(nth);
    }
}
