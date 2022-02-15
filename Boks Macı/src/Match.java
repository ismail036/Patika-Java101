import java.util.Random;
import java.util.function.IntFunction;

import javax.lang.model.util.ElementScanner6;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    
    Match(Fighter f1 , Fighter f2 , int minWeight , int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    boolean isCheck(){
        return ( (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)  &&  (this.f2.weight >= minWeight && this.f2.weight <= maxWeight) );
    }

    Random random =new Random();
    int randomSayı = (random.nextInt(2) + 1);

    void run(){
        if(isCheck()){

            if(randomSayı == 1){
                System.out.println("Dövüse " + f1.name + " baslıyacak ");
            }
            else{
                System.out.println("Dövüse " + f2.name + " baslıyacak ");
            }

            System.out.println("   ----------------------------------------    ");
            
            
            while(this.f1.health > 0 && this.f2.health > 0){

                if(randomSayı == 1){
                    this.f2.health = f1.hit(f2);
                    System.out.println(f2.health);
                    if (isWin()){
                        break;
                    }
                    System.out.println("   ----------   ");
                    this.f1.health = f2.hit(f1);
                    System.out.println(f1.health);
                    if (isWin()){
                        break;
                    } 
                    System.out.println("   ----------   ");
                }
                else{
                    this.f1.health = f2.hit(f1);
                    System.out.println(f1.health);
                    if (isWin()){
                        break;
                    }
    
                    System.out.println("   ----------   ");
                    this.f2.health = f1.hit(f2);
                    System.out.println(f2.health);
                    if (isWin()){
                        break;
                    } 
    
                    System.out.println("   ----------   ");
                }

            }
        }
        else{
            System.out.println("Sporcuların sikletleri uymuyor. ");
        }




    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(f2.name + " health : " + f2.health);
            System.out.println(this.f2.name + " kazandı ! ");
            return true;
        }
        else if(this.f2.health == 0){
            System.out.println(f1.name + " health : " + f1.health);
            System.out.println(this.f2.name + " kazandı ! ");
            return true;
        }
        else{
            return false;   
        }
    }
}