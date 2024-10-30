import java.util.Scanner;

public class SumofDigitsUntilSingleDigit {
    public void sod(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        while(num>10){
            num=sumOfDigit(num);
        }
        System.out.println(sumOfDigit(num));
    }
    public int sumOfDigit(int num){
        int sum=0;
            while(num!=0){
                sum= sum+(num%10);
                num=num/10;
            }
            num=sum;
        return num;
    }
}
