import java.util.Scanner;
import java.util.*;
public class sum_of_digits {
    public int sumofdijit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int last=num%10;
            sum+=last;
            num=num/10;
        }
        System.out.println(sum);
    return  0;
    }
}
