import java.math.*;
import java.util.Scanner;

public class countNumberOfDigit {
    public void countDigit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number '1234'");
        int num=sc.nextInt();
        System.out.println((int)(Math.log10(num)+1));
    }
}
