import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class App {
    public static void main(String[] args) throws Exception {
        int sayi1 , sayi2 , i , j ;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("1. sayıyı giriniz.");
            sayi1 = input.nextInt();
    
            System.out.println("2. sayıyı giriniz");
            sayi2 = input.nextInt();
    
    
            if(sayi1>sayi1){
                i = sayi1;
                j = sayi1;
            }else{
                i = sayi2;
                j = sayi2;
            }
    
            while(sayi1%i!=0 || sayi2%i!=0){
                i-=1;
            }
    
            while(j%sayi1!=0 || j%sayi2!=0){
                j+=1;
            }
    
            System.out.println("EBOB = " + i);
            System.out.println("EKOK = " + j);
        
        }




    

    }
}
