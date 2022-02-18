
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        int[] list = {3,1,2,52,25,2,10,23,32,62,32,14,85,14,75,66,31,12,25,12,14,232,6,98,5,4,6,4,8};
        ArrayList<Integer> ciftSayi = new ArrayList();
        ArrayList<Integer> tekrarEdenCiftSayi = new ArrayList<>();
        for(int i : list){
            if(i%2==0){
               ciftSayi.add(i);
            }
        }
        for(int i = 0 ; i<ciftSayi.size();i++){
            for(int j = 0 ; j <ciftSayi.size();j++){
                if(j != i && ciftSayi.get(i) == ciftSayi.get(j)){
                    if(         tekrarEdenCiftSayi.indexOf(ciftSayi.get(i))   == -1 ){
                        tekrarEdenCiftSayi.add(ciftSayi.get(i));
                    }
                }
            }
        }

        for(int i : tekrarEdenCiftSayi){
            System.out.print(i + " ");
        }
    }
}
