import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? ");
        int armut = input.nextInt();

        System.out.println("Elma Kaç Kilo ? ");
        int elma = input.nextInt();

        System.out.println("Domates Kaç Kilo ? ");
        int domates = input.nextInt();

        System.out.println("Muz Kaç Kilo ? ");
        int muz = input.nextInt();

        System.out.println("Patlıcan Kaç Kilo ? ");
        int patlıcan = input.nextInt();

        System.out.println("Toplam tutar :  " + (( (double) domates *  1.11) +  ( (double) elma * 3.67) + ( (double) armut * 2.14) + ( (double) muz * 0.95) + ( (double) patlıcan * 5)));
    }
}
