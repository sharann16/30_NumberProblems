import java.util.Scanner;
public class oddAndEvenSum {
    public void oddEvenSum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        PowerofNumber poww=new PowerofNumber();
        int count=1;
        int oddSum=0;
        int evenSum=0;
        while(num!=0){
            int length=(int)Math.log10(num);
            int first= (int) (num/ Math.pow(10,length));
            System.out.println(first);
            num=num%(int) (Math.pow(10,length));
            if(count%2==0){
                evenSum+=first;
            }
            else {
                oddSum+=first;
            }
            count++;
        }
        System.out.println("Evev sum : "+evenSum);
        System.out.println("odd sum : "+oddSum);
    }
}
