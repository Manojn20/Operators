import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int speed=sc.nextInt();
        int hrs=sc.nextInt();
        int distance=(speed*hrs);
        System.out.println(distance);
    }
}