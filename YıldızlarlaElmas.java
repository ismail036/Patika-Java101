import java.util.Scanner;

public class YıldızlarlaElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int sayi = input.nextInt();



        int m  = sayi;

        for(int i = 1;i<=sayi;i++){
            for(int j = (m-1) ; j>=1 ; j --){
                System.out.print(" ");
            }
            for(int k = 2 ; k <=  2 * ( (i-1) + 1 ) ; k++ ){
                System.out.print("*");
            }
            for(int j = (sayi-1) ; j>=1 ; j --){
                System.out.print(" ");
            }
            System.out.println();

            m -= 1;
        }


        int n = sayi;
        for(int i = 1 ; i<= (sayi -1) ; i++){
            for(int j = 1 ; j<= i ;j++){
                System.out.print(" ");
            }
            for(int k = (((n -1)*2) -1 )   ; k>=1 ; k-- ){
                System.out.print("*");
            }
            for(int j = 1 ; j<= i ;j++){
                System.out.print(" ");
            }

            n-=1;

            System.out.println();
        }
    }
}