import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cake=sc.nextInt();
        int hrs=sc.nextInt();
        int total=(cake*hrs);
        System.out.println(total);
    }
}