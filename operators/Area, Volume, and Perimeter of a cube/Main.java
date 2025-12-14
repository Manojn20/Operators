import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int v=sc.nextInt();
        int p=sc.nextInt();
        int volume=(v*v*v);
        int area=(a*a);
        int perimeter=(12*p);
        System.out.println(6*area);
        System.out.println(volume);
        System.out.println(perimeter);
        
    }
}
