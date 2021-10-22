package ro.fasttrackit.curs6.homework;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {31, 4, 89, 21, 17, 2};
        numereIntregi(numbers);
    }

    public static void numereIntregi(int[] nr) {
        int numar = 10;
        for (int element : nr) {
            if (element > numar) {
                System.out.println(element);
            }
        }
    }
}
