import java.util.Scanner;

public class UcVeDordeBolunenSayılar {
    public static void main(String[] args) throws Exception {
        int sayi;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        sayi = input.nextInt();


        int sayac = 0;
        int sayac2 = 0;
        for(int i = 1;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                sayac += i;
                sayac2 += 1;
            }
        }


        System.out.println("Ortalama : " + (sayac/sayac2));
    }
}
