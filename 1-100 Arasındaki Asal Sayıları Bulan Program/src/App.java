import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    

      int a = 0;
        
      for(int i = 2 ; i<100;i++){
        for(int j = i-1 ; j>1 ; j--){
            if(i%j==0){
                a += j;
            }
        }
        if(a==0){
            System.out.println(i);
        }

        a = 0;

      }
      
    }
}
