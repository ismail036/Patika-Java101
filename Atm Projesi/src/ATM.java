import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap) {
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgelsiniz.....");

        System.out.println("***************************************************");
        System.out.println("Kullanıcı Girisi");
        System.out.println("***************************************************");

        int giris_hakki = 3;
        
        while (true) {
            if(login.login(hesap)){
                    System.out.println("Giris Basarılı...");
                    break;
            }
            else {
                System.out.println("Giris Basarısız...");
                giris_hakki -= 1;
                System.out.println("Kalan Giris Hakkınız : " + giris_hakki);
            }

            if (giris_hakki == 0){
                System.out.println("Giris Hakkınız Bitti...");
                return;
            }
        }

        System.out.println("******************************************************");
        String islemler = "Yapmak isrediğiniz islemi seçiniz :  \n" +  "1. Bakiye Görüntüle\n" + "2. Para Yatırma\n" + "3. Para Çekme\n" + "4. Çıkış";

        System.out.println(islemler);
        
        while (true) {
            String islem = scanner.nextLine();
            if (islem.equals("1")){
                System.out.println("Bakiyeniz : " + hesap.bakiye);
                System.out.println(islemler);
            }
            else if ( islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutarı giriniz : " );
                int tutar = scanner.nextInt();
                hesap.paraYatır(tutar);
                System.out.println(islemler);
            }
            else if(islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                hesap.paraCek(tutar);
                System.out.println(islemler);
            }
            else if(islem.equals("4")){
                break;
            }
        }
    }
}
