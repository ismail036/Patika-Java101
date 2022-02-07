import java.util.Scanner;

public class VucutKitleİndeksi{
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz : ");
        int kilo = input.nextInt();

        System.out.println("Boyunuzu cm cinsinden giriniz : ");
        int boy = input.nextInt();

        double boyMetre = ( (double) boy / 100);

        double kitleİndeksi =  (kilo / (boyMetre * boyMetre) )  ;
        
        System.out.println("Vücüt kitle indeksiniz : " + kitleİndeksi);

        
    }
}
