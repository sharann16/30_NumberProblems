import java.util.Scanner;

public class sumOfPrimeNumberInRange {
    public void primeNumberRange(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit ");
        int lim1=sc.nextInt();
        int lim2=sc.nextInt();
        int sum=0;
        for(int i=lim1+1;i<lim2;i++){
            boolean value=true;
            for(int k=2;k<i;k++){
                if(i%k==0){
                    value=false;
                    break;
                }
            }
            if(value){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
