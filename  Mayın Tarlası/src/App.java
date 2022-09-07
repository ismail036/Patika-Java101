import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("=====================");
        System.out.println();
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");
        System.out.println();
        System.out.println("=====================");
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Satır boyutunu giriniz : ");
        int satırSayısı = scan.nextInt();

        System.out.println("Sütun boyutunu giriniz : ");
        int sutunSayisi = scan.nextInt();
        MineSweeper mine = new MineSweeper(satırSayısı, sutunSayisi);
        mine.run();
    }
}
