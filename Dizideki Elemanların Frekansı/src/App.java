import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] dizi =  {1,3,25,12,21,10,5,6,2,3,5,4,5,58,9,5,1,3,6,4,5,23,32,21,74,65,23,12};

        Arrays.sort(dizi);
        
        int sayac = 1;
        for(int i = 1 ; i < dizi.length ; i++){
            
            if(dizi[i] == dizi[i-1]){
                sayac += 1;
             }
            else if(dizi[i] != dizi[i-1]){
                System.out.println(dizi[i-1] + " " + sayac + "kez tekrar edildi.");
                sayac = 1;
            }
            
          
        }
    }
}
