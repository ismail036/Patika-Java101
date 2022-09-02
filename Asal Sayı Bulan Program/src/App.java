import java.util.Scanner;

public class App {

    static boolean asalMı(int sayı , int i){
        if(sayı == i)
            return true;

        if(sayı % i == 0)
            return false;

        return asalMı(sayı, i + 1);
    }
    public static void main(String[] args) throws Exception {

        
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");

        int sayı = input.nextInt();

        System.out.print(asalMı(sayı,2) ? sayı + " sayısı ASALDIR !" : sayı + " sayısı ASAL değildir !" );


    }
}
