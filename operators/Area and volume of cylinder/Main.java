import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int h=sc.nextInt();
        double volume=(3.14*r*r*h);
        double area=(2*3.14*r*h)+(2*3.14*r*r);
        System.out.println(area);
        System.out.println(volume);
    }
}
