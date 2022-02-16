import java.util.Scanner;

public class Login {
    
    boolean login(Hesap hesap) {
        Scanner input = new Scanner(System.in);
        String kullanici_adi;
        String parola;

        System.out.print("Kullanıcı Adı: ");
        kullanici_adi = input.nextLine();
        System.out.print("Parola: ");
        parola = input.nextLine();

        if(hesap.kullanici_adi.equals(kullanici_adi) && hesap.parola.equals(parola)){
            return true;
        }
        else{
            return false;
        }

    }
}
