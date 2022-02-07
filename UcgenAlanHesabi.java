import java.util.Scanner;

public class UcgenAlanHesabi {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ücgenin birinci kenarını giriniz :  ");
        int a = input.nextInt();

        System.out.println("Ücgenin ikinci kenarını giriniz :  ");
        int b = input.nextInt();

        System.out.println("Ücgenin ücüncü kenarını giriniz :  ");
        int c = input.nextInt();

        double u = (a + b +c) / 2.0;

        double alanınKaresi =  (u * (u-a) * (u-c) * (u-b));

        double alan = Math.sqrt(alanınKaresi);

        System.out.println("Ücgenin alanı :  " + alan);


    }
}
