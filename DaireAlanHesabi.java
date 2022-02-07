import java.util.Scanner;

public class DaireAlanHesabi {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıcapını giriniz : ");
        int yarıcap = input.nextInt();

        System.out.println("Merkez açının ölçüsünü giriniz :  ");
        int merkezAçı = input.nextInt();

        double pi = 3.14;

        System.out.println("Daire diliminin alanı :  " +  ( (pi * (yarıcap*yarıcap) * merkezAçı) / 360) );
    }
}
