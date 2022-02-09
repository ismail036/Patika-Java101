import java.util.Scanner;

public class HarmonikSayı {
    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = input.nextInt();


        double toplam = 0;
        for(double i = 1;i <=sayi;i++){
            toplam += 1/i;
        }


        System.out.println( "Harmonik toplam : " + toplam );
    }
}
