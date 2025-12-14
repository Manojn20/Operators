import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int basic=sc.nextInt();
        int hra=sc.nextInt();
        int allowance=sc.nextInt();
        int total=(basic+hra+allowance);
        System.out.println(total);
    }
}