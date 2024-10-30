import java.util.Scanner;

public class NumberOfFactors {
    public void numberOfFactors(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int count=1;
        for(int i=1;i<=num/2;i++){
            if (num%i==0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
