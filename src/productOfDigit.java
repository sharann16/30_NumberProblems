import java.util.Scanner;

public class productOfDigit {
    public void product(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers '235'");
        int num=sc.nextInt();
        int produce=1;
        while(num!=0){
            int last=num%10;
            produce=produce*last;
            num=num/10;
        }
        System.out.println(produce);
    }
}
