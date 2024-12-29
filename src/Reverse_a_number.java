import java.util.Scanner;

public class Reverse_a_number {
    public void reverse(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to reverse");
        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
            int last=num%10;
            rev=(rev*10)+last;
            num=num/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
