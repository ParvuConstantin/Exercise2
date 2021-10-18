package ro.fasttrackit.curs6;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("This is my homework");
        String[] names = {"Ana", "Oana", "Daria"};
        printLongerThan(names, 4);
    }

    static void printLongerThan(String[] names, int minLenght) {
        for (String name : names) {
            if (name.length() >= minLenght) {
                System.out.println(name);
            }
        }
    }
}
