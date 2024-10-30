import java.util.Scanner;

public class DeficientPerfectAbundant {
    public void defecient_perfect_ambudant(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to find Deficient, Perfect, or Abundant");
        int num=sc.nextInt();
        int sum=0;
        for (int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if (sum<num){
            System.out.println("deficient");
        } else if (sum>num) {
            System.out.println("Abundant");
        }else {
            System.out.println("perfect");
        }
    }
}
