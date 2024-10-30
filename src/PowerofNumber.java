import java.util.Scanner;

public class PowerofNumber {
    public void power(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base number");
        int base=sc.nextInt();
        System.out.println("enter power number");
        int poNo=sc.nextInt();
        int res=1;
        for(int i=1;i<=poNo;i++){
            res*=base;
        }
        System.out.println(res);
    }
}
