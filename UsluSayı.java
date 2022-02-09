import java.util.Scanner;

public class UsluSayı {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Tabanı giriniz : ");
        int taban = input.nextInt();

        System.out.println("Üssü giriniz : ");
        int üs = input.nextInt();

        long sonuc = 1;
        for(int i = 1;i<=üs;i++){
            sonuc *= taban;
        }

        System.out.println(sonuc);
    }
}
