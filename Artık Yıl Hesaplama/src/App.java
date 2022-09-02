import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input  = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");

        int yıl = input.nextInt();
        
        if(yıl%100==0){
            if(yıl%400==0){
                System.out.println(yıl +  "  Artık bir yıldır");
            }else{
                System.out.println(yıl + "  Artık bir yıl değildir");
            }
        }
        else if(yıl%4==0){
            System.out.println(yıl + "  Artık bir yıldır");
        }
        else{
            System.out.println(yıl + "  Artık bir yıl değildir");
        }
    }
}
