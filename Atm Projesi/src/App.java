public class App {
    public static void main(String[] args) throws Exception {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Ahmet", "123456789", 10000);
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
    }
}
