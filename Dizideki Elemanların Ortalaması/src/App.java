public class App {
    public static void main(String[] args) throws Exception {
        int[] list = {15,6,7,12,9,3};
        double avarage;
        int sum = 0;

        for(int i:list){
            sum += i;
        }

        avarage = (double) sum / list.length;

        System.out.println("Ortalama : " + avarage);
    }
}
