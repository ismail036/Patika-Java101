import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int sayı;

        int toplam = 0;

        do{
            System.out.println("Bir sayı giriniz");
            sayı = input.nextInt();
            if(sayı%4==0){
                toplam += sayı;
            }

        }while(sayı%2==0);

        System.out.println("Toplam = " + toplam);
    }
}
