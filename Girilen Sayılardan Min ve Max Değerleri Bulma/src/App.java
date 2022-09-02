import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int n , enKucuk, enBuyuk;
        n = 1;

        System.out.println("Kaç tane sayı gireceksiniz: ");

        int adet = input.nextInt();

        System.out.println(n + ". Sayıyı giriniz : ");
        int sayi =   input.nextInt();
        enBuyuk = sayi;
        enKucuk = sayi;
        n+=1;

        while(adet-1>0){
            System.out.println(n + ". Sayıyı giriniz : ");
            sayi =   input.nextInt();
            n+=1;
            if(sayi>enBuyuk){
                enBuyuk = sayi;
            }
            if(sayi<enKucuk){
                enKucuk = sayi;
            }
            adet-=1;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);


    }
}
