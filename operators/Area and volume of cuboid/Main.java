import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();
        int volume=(l*w*h);
        int area=(l*w+l*h+w*h);
        System.out.println(2*area);
        System.out.println(volume);
        
    }
}
