import java.util.Scanner;

public class Palindrome_number {
    public void palindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int copy=num;
        int rev=0;
        while(copy!=0){
            int last=copy%10;
            rev=(rev*10)+last;
            copy=copy/10;
        }
        if(num==rev){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        sc.close();
    }
}
