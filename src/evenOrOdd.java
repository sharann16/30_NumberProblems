import java.util.Scanner;

public class evenOrOdd {
    public void oddEven(){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        if(number%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
