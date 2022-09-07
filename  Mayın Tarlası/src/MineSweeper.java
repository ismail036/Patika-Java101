import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int satırSayisi;
    int sutunSayisi;
    String[][] board;
    int mayınSayısı;
    String[][] map;
    int satırSecim;
    int sutunSecim;
    int cevredekiMayın;
    int kapalıKutu;
        
    public MineSweeper(int satırSayisi , int sutunSayisi){
        this.satırSayisi = satırSayisi;
        this.sutunSayisi = sutunSayisi;  
        board = new String[this.satırSayisi][this.sutunSayisi];
        map = new String[this.satırSayisi][this.sutunSayisi];
    }

   

    public  void boardOlustur(){
        for(int i = 0 ;i<board.length;i++){
            for(int j = 0 ; j<board[0].length;j++){
                board[i][j] = "- ";
            }
        }
    }

    public void mapOlustur(){
        mayınSayısı = (sutunSayisi * satırSayisi) / 4 ;
        Random rand = new Random();
        for(int i = 0 ;i<map.length;i++){
            for(int j = 0 ; j<map[0].length;j++){
                map[i][j] = "- ";
            }
        }
        while(mayınSayısı>0){
            int satırNo = rand.nextInt(satırSayisi);
            int sutunNo = rand.nextInt(sutunSayisi);
            if(map[satırNo][sutunNo] != "* "){
                map[satırNo][sutunNo] = "* ";
                mayınSayısı -= 1;
            }
        }
    }

    public void boardYaz(){
        for(String[] i: board){
            for(String j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void game(){
        if(winKontrol()){
            System.out.println("You Win!");
        }else{        System.out.println("===================");
        boardYaz();
        Scanner scan = new Scanner(System.in);
        System.out.println("Satır sayısı giriniz : ");
        satırSecim = scan.nextInt()-1;
        System.out.println("Sütun sayısı giriniz : ");
        sutunSecim = scan.nextInt()-1;
        if(satırSecim>satırSayisi || sutunSecim > sutunSayisi){
            System.out.println("Yaptığınız seçim aralığın dısındadır . Lütfen tekrar deenyiniz!");
            game();
        }else{
            karsılastır();
        }
        
    }

    }

    public boolean winKontrol(){
        kapalıKutu = 0;
        for(int i = 0;i<satırSayisi;i++){
            for(int j = 0 ; j < sutunSayisi ; j++){
                if(board[i][j] == "- "){
                    if(map[i][j] != "* "){
                        kapalıKutu += 1;
                    }
                }
            }
        }
        if(kapalıKutu == 0){
            return true;
        }
        return false;
        
    }

    /**
     * 
     */
    public void karsılastır(){
        cevredekiMayın = 0;
        if(map[satırSecim][sutunSecim] == "* "){
            System.out.println();
            System.out.println("Game over!");
            System.out.println();
            for(String[] i: map){
                for(String j : i){
                    System.out.print(j);
                }
                System.out.println();
            }
        }else{
            
            for(int i = satırSecim-1;i<=satırSecim+1;i++){
                for(int j = sutunSecim-1;j<=sutunSecim+1;j++){
                    try{
                        if(map[i][j] == "* "){
                            cevredekiMayın += 1;
                        }
                    }catch (Exception e) {
                            
                    }
                }
            }

            board[satırSecim][sutunSecim] = String.valueOf(cevredekiMayın) + " ";

            
            game();
        }
    }



    public  void run(){  

        boardOlustur();
        mapOlustur();


        



        game();
    }
}
