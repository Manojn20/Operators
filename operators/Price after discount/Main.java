import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int original=sc.nextInt();
    int discount=sc.nextInt();
    int discountamount=((original*discount)/100);
    int total=(original-discountamount);
    System.out.println(total);
    }
}