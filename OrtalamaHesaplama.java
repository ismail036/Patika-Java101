import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz :  ");
        int matematik = input.nextInt();

        System.out.println("Fizik notunuzu giriniz :  ");
        int fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz :  ");
        int kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz :  ");
        int turkçe = input.nextInt();

        System.out.println("Tarih notunuzu giriniz :  ");
        int tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz :  ");
        int muzik = input.nextInt();


        int toplam = matematik + tarih + fizik + kimya + muzik + turkçe;
        double notOrtalamsı = toplam / 6;

        System.out.println("Not ortalamanız :  " + notOrtalamsı);
        
        System.out.println(notOrtalamsı <= 60 ?  "Sınıfta Kaldı" : "Sınıfı geçti") ;


    }
}
