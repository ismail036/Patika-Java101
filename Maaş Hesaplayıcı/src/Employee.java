public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name , int salary , int workHours , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    double tax(){
        if(salary < 1000){
            return 0;
        }
        else{
            return salary * 0.03;
        }
    }

    double bonus(){
        int fazlaMesai = workHours - 40;
        return  fazlaMesai *30;
    }

    double raiseSalary(){
            if(this.hireYear < 10){
                return  salary * 0.5;
            }
            else if(this.hireYear > 9 && this.hireYear< 20){
                return salary * 0.1;
            }
            else{
                return salary * 0.15;
            }
    }


    void ToString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maası : " + this.salary);
        System.out.println("Çalısma saati : " + this.workHours);
        System.out.println("Baslangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas artısı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" +   (this.salary + (bonus() - tax())));
        System.out.println("Toplam Maaş : " +   ( this.salary +  ( (bonus() - tax()) + raiseSalary() ) )  );
    }



    
}
