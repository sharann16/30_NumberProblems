import java.util.Scanner;

public class FindingDigitalRoot {
    public void digitalRoot(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int num=sc.nextInt();
        int sum=0;
        while(num>10){
             num=sumOfDigit(num);

        }
        System.out.println(num);
    }
    static int sumOfDigit(int num){
        int sum=0;
        while (num!=0){
            sum=sum + (num%10);
            num=num/10;
        }
        num=sum;
        return num;
    }
}
