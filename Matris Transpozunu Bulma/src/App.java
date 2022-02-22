public class App {
    public static void main(String[] args) throws Exception {
        
        int[][] dizi = {{1,2,3},{4,5,6}};

        int[][] transpoz = new int[dizi[0].length][dizi.length];

        for(int i = 0 ; i<dizi[0].length ; i++){
            for(int j  = 0;j<dizi.length;j++){
                transpoz[i][j] =  dizi[j][i];
            }
        }


        System.out.println("Matris : ");

        for(int i[]:dizi){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();


        System.out.println("Transpozu : ");

        for(int i[]:transpoz){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
