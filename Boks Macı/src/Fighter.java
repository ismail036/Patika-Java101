public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name , int damage , int health , int weight , Double dodge){
        this.name =name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }



    boolean idDodge(){
        double randomNumber =  Math.random() * 100;
        return randomNumber < this.dodge;
    }

    int hit(Fighter foo){


        System.out.println(this.name + " => " + foo.name + " " + this.damage + " hasar vurdu.");
        if  (foo.idDodge()){
            System.out.print(foo.name + " gelen hasarı blokladı ! ");
            System.out.println(foo.name + " health : ");
            return foo.health ;
        }
        else if (foo.health - this.damage < 0){
            System.out.print(foo.name +" health : " );
            return 0;
        }
        System.out.print(foo.name +" health : " );
        return  foo.health - this.damage ;
      }

    
    


}
