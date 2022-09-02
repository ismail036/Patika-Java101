public class App {
    public static void main(String[] args) throws Exception {
        int a = 0 , b = 1 , c;

        for(int i = 0;i<15;i++){
            c = a;
            System.out.print(a + " ");
            a = b;
            b = c + b;
        }
    }
}
