package ro.fasttrackit.curs6.homework;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = {39, 22, 9, 33, 98, 3, 44};
        impare(numbers);
    }

    public static void impare(int[] nrImpare) {
        for (int element : nrImpare) {
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
    }
}
