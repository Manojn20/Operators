import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricePerMango=sc.nextInt();
        int purchasedMangoes=sc.nextInt();
        int freeMangoes=purchasedMangoes/3;
        int totalMangoes=purchasedMangoes+freeMangoes;
        int amountToPay=purchasedMangoes*pricePerMango;
        System.out.println(totalMangoes);
        System.out.println(amountToPay);
    }
}
