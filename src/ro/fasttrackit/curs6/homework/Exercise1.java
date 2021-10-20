package ro.fasttrackit.curs6.homework;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Suma este: " + suma());
    }

    static int suma() {
        int[] numbers = {1, 19, 35, 50, 3, 74, 190};
        int suma = 0;
        for (int element : numbers) {
            suma += element;
        }
        return suma;
    }
}
