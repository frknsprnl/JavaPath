public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Furkan", 35000, 8, 2019);
        Employee e2 = new Employee("Enes", 180000, 6, 2010);
        Employee e3 = new Employee("Fatih", 10000, 5, 2020);

        e1.printInfo();
        e2.printInfo();
        e3.printInfo();
    }
}
