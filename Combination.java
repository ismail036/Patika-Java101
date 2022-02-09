import java.util.Scanner;

public class Combination {
    public static void main(String[] args) throws Exception {
        

        System.out.println("N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.");

        Scanner input = new Scanner(System.in);
        System.out.println("n sayısını giriniz:  ");
        int n = input.nextInt();

        System.out.println("r sayısını giriniz : ");
        int r = input.nextInt();


        int sayac1 = 1;
        int sayac2 = 1;
        for(int i = n ; i > (n-r) ;i-- ){
            sayac1 *= i;
        }


        for(int i = r ; i>0 ;i-- ){
            sayac2 *= i;
        }

        System.out.println(sayac1/sayac2);
    }
}
