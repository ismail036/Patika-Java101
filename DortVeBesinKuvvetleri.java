import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) throws Exception {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :  ");
        int sayi = input.nextInt();


        int i = 1;

        System.out.println("4'ün kuvvetleri");
        while(true){
            if((i)<=sayi){
            System.out.println(i);
            }
            else{
                break;
            }
            i*=4;
        }


        System.out.println();

        i = 1;

        System.out.println("5'in kuvvetleri ");
        while(true){
            if((i)<=sayi){
            System.out.println(i);
            }
            else{
                break;
            }
            i*=5;
        }
    }
}
