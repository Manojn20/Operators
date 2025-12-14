import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int v=sc.nextInt();
        int p=sc.nextInt();
        double volume=(3.14*v*v*v);
        double area=(a*a*3.14);
        System.out.println(4*area);
        System.out.println(4/3*volume);
        
    }
}
