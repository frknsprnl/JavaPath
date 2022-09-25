public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Saitama" , 85, 200, 70, 80);
        Fighter f2 = new Fighter("B", 20, 85, 75, 40);

        Match match = new Match(f1, f2, 70, 75);
        match.run();
    }
}
