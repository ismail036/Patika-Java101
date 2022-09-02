import java.util.Scanner;

public class App {

    static int us(int taban,int üs){
        int sonuc = 1;
        for(int i = 0; i<üs;i++){
            sonuc *= taban;
        }

        return sonuc;
    }


    public static void main(String[] args) throws Exception {

        int taban , üs;

        Scanner input = new Scanner(System.in);

        System.out.println("Taban değerini giriniz : ");

        taban = input.nextInt();

        System.out.println("Üs değerini giriniz : ");

        üs = input.nextInt();

       
        System.out.println("Sonuc : " +  us(taban, üs));


    }
}
