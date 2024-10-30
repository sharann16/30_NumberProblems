import java.util.Scanner;

public class LargestPrimeNumber {
    public void largestPrime(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int largest=0;
        for(int i=1;i<num/2;i++){
            if(num%i==0){
                largest=i;
            }
        }
        System.out.println(largest);
    }
}
