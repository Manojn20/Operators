import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int candies=sc.nextInt();
        int student=sc.nextInt();
        int d=(student*8);
        int remaining=(candies-d);
        System.out.println(remaining);
    }
}