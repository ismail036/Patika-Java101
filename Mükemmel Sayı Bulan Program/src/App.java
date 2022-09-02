import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");

        int sayi = input.nextInt();

        int toplam = 0;
        int n = sayi-1;

        while(n>0){
            if(sayi%n==0){
                toplam+=n;
            }
            n-=1;
        }

        if(toplam == sayi){
            System.out.println(sayi + " Mükemmel sayidir. ");
        }else{
            System.out.println(sayi + " Mükemmel sayi değildir. ");
        }
    }
}
