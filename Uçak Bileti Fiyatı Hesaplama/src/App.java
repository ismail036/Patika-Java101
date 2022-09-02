import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int km , yas , yolculukTipi;

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz ");
        while(true){
            km = input.nextInt();
            if(km<=0){
                System.out.println("Hatalı girisi yaptınız , lütfen tekrar deneyiniz...");
            }
            else{
                break;
            }
        }

        System.out.println("Yaşınızı giriniz ");
        while(true){
            yas = input.nextInt();
            if(yas<=0){
                System.out.println("Hatalı girisi yaptınız , lütfen tekrar deneyiniz...");
            }
            else{
                break;
            }
        }

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş )");
        while(true){
            yolculukTipi = input.nextInt();
            if(!(yolculukTipi == 1 || yolculukTipi == 2)){
                System.out.println("Hatalı girisi yaptınız , lütfen tekrar deneyiniz...");
            }
            else{
                break;
            }
        }

        if(yolculukTipi==1){
            if(yas<12){
                System.out.println("Toplam tutar : " + (km/10)*0.5);
            }else if(yas>12 && yas < 24){
                System.out.println("Toplam tutar : " + (km/10)*0.9);
            }else if(yas>65){
                System.out.println("Toplam tutar : " + (km/10)*0.7);
            }else{
                System.out.println("Toplam tutar : " + (km/10));
            }
        }else{
            if(yas<12){
                System.out.println("Toplam tutar : " + (km/10)*0.5*1.6);
            }else if(yas>12 && yas < 24){
                System.out.println("Toplam tutar : " + (km/10)*0.9*1.6);
            }else if(yas>65){
                System.out.println("Toplam tutar : " + (km/10)*0.7*1.6);
            }else{
                System.out.println("Toplam tutar : " + (km/10)*1.6);
            }
        }

        

    }
}
