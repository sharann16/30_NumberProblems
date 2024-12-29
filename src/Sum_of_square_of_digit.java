import java.util.Scanner;

public class Sum_of_square_of_digit {
    public void sumOfSquare(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int sum=0;
        while (num!=0){
            int lastNo=num%10;
            sum+=(lastNo*lastNo);
            num=num/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
