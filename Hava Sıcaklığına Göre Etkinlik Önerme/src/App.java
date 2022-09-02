import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz : ");
        heat = input.nextInt();

        if(heat < 5 ){
            System.out.println("Kayak yapabilirsiniz. ");
        }
        else if(heat >= 5 && heat <= 15){
            System.out.println("Sinemaya gidebilirsiniz. ");
        }
        if(heat <= 15 && heat <= 25){
            System.out.println("Piknik yapabilirsiniz. ");
        }
        if(heat > 25 ){
            System.out.println("Yüzme yapabilirsiniz. ");
        }

    }
}
