public class Hesap {
    
    String kullanici_adi;
    String parola;
    int bakiye;

    public Hesap(String kullanici_adi , String parola , int bakiye){
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }


    void paraYatır(int tutar) {
        this.bakiye += tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye);
    }

    void paraCek(int tutar) {
        if ((bakiye - tutar) < 0){
            System.out.println("Yeterli Bakiyeniz Yok...");
        }
        else{
            this.bakiye -= tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye);
        }
    }



}
