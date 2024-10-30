import java.util.Scanner;

public class powerOfTwo {
    public void powerOf2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find pow of 2");
        int num=sc.nextInt();
        int sum=2;
        int count=1;
        while(sum<=num/2){
            sum=sum*2;
            count++;
        }
        if(sum==num){
            System.out.println(true);System.out.println(count);
        }
        else {
            System.out.println(false);

        }
    }
}
