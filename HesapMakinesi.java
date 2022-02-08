import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) throws Exception {
       
        int n1 , n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();   

        System.out.println(" Seçimizi yapınız  :  ( 1- Toplama /  2 - Çıkarma / 3 - Çarpma  / 4 - Bölme)");
        select = input.nextInt();

        switch(select){
            case 1 : System.out.println("Toplam : " +  (n1 + n1)); break;

            case 2 : System.out.println("Fark : " + (n1 - n2));

            case 3 : System.out.println("Çarpım : " + ( n1 * n2));

            case 4 : System.out.println("Bölüm : " + ( ( (double) n1 / (double) n2)));

            default : System.out.println("Hatalı seçim yaptınız");
        }

    }
}
