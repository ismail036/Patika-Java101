public class App {
    public static void main(String[] args) throws Exception {
        Teacher t1 = new Teacher("Ozan", "05370254193", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "05378549654", "FZK");
        Teacher t3 = new Teacher("Safiye", "05378694523", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);



        



        

        Student s1 = new Student("Mehmet Ali", "131", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(100, 200, 50);
        s1.isPass();

        Student s2 = new Student("Kadir Çakır", "2111", "3", tarih, fizik, biyo);
        s2.addBulkExamNote(80, 75, 71);
        s2.isPass();


    }
}
