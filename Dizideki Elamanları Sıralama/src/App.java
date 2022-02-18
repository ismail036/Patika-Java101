import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int n = input.nextInt();
        int[] dizi = new int[n];

        for(int i = 1 ; i<=n ; i++){
            System.out.println("Dizinin " + i + ". elemanını giriniz : ");
            dizi[i-1] = input.nextInt(); 
        }  

        Arrays.sort(dizi);

        for(int i : dizi){
            System.out.print(i + " ");
        }
    }
}
