import java.util.Scanner;

public class KDVhesaplama {
    public static void main(String[] args) throws Exception {
       double tutar , kdvOranı , kdvTutar , kdvliTutar;

       Scanner input = new Scanner(System.in);
       System.out.println("Ücret tutarını giriniz : ");
       tutar = input.nextInt();

       if(tutar<=1000){
           kdvOranı = 0.18;
       }
       else{
           kdvOranı = 0.08;
       }

        kdvTutar = tutar * kdvOranı;
        kdvliTutar = kdvTutar + tutar;

        System.out.println("Tutar : " + tutar);
        System.out.println("KDV oranı  : " +  kdvOranı);
        System.out.println("KDV tutarı : " + kdvTutar);
        System.out.println("KDV'Lİ tutar : " + kdvliTutar);
    }
}
