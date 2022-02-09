import java.util.Scanner;

public class BasamaklarToplamı {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        int toplam = 0;

        while(true){
            if(sayi != 0){
                toplam += sayi%10;
                sayi = sayi - sayi%10;
                sayi = sayi /10;
            }
            else{
                break;
            }
        }
        System.out.println("Sayının basamakları toplamı : " +  toplam);
    }
}
