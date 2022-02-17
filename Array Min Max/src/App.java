import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Scanner input = new Scanner(System.in);
        int  sayı = input.nextInt();

        Arrays.sort(list);

        int min = list[0];
        int max = list[list.length - 1];

        for(int i : list){
            if(i < sayı){
                min = i;
            }
        }

        for(int i = (list.length - 1) ; i > 0 ; i -- ){
            if(list[i] > sayı){
                max = list[i];
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);

    }
}
