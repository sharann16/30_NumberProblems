import java.util.Scanner;

public class Trailing {
    public void trailing(){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("enter number");
        int num=sc.nextInt();
        long fat=1;
        for(int i=num;i>0;i--){
            fat=fat*i;
        }
        System.out.println(fat);
        while(fat!=0){
            long last=fat%10;

            if(last==0){
                System.out.println(last);

                count=count+1;
            }fat=fat/10;
        }
        System.out.println(count);
    }
}
