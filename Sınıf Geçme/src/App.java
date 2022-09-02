import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         
        int mat,  fizik , kimya , muzik , turkce;
        

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz :");
        while(true){
            mat = input.nextInt();
            if(mat>100 || mat<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        }

        System.out.println("Fizik notunuz :");
        while(true){
            fizik = input.nextInt();
            if(fizik>100 || fizik<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        }

        System.out.println("Kimya notunuz :");
        while(true){
            kimya = input.nextInt();
            if(kimya>100 || kimya<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        }

        System.out.println("Müzik notunuz :");
        while(true){
            muzik = input.nextInt();
            if(muzik>100 || muzik<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        }

        System.out.println("Turkçe notunuz :");
        while(true){
            turkce = input.nextInt();
            if(turkce>100 || turkce<0){
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır. Lütfen tekrar deneyiniz.");
            }else{
                break;
            }
        };


        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if(avarage<=55){
            System.out.println("Sınıfta kaldınız , seneye tekrar görüşmek üzere ! ");
            System.out.println("Ortalamanız : " + avarage);
        }else{
            System.out.println("Tebrikler , sınıfı geçtiniz ! ");
            System.out.println("Ortalamanız : " + avarage);
        }



        
    }
}
