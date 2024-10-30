import java.util.Scanner;

public class nthPrime {
    public void nthp(){
        System.out.println("enter number to fint nth prime");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int prime=0;
        int i=1;
        while(i<=num){
            boolean isprime=true;
            int num2=3;
            for (int j=2;j<num;j++){
                if(num%j==0){
                    isprime=false;
                    break;
                }
                if (isprime){
                    prime=num;
                    num++; System.out.println(prime);
                }
            }

        }


    }
}
