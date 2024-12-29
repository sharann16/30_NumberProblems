import java.util.Scanner;

public class Division_of_a_number {
    public void division(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+",");
            }
        }
        sc.close();
    }
}
