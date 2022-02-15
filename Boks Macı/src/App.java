public class App {
    public static void main(String[] args) throws Exception {
        Fighter f1 = new Fighter("Ömer", 10, 120, 100 , 10.0);
        Fighter f2 = new Fighter("Ali",20, 90, 85 , 100.0);

        Match match = new Match(f1, f2, 70, 110);

        match.run();

    }
}
