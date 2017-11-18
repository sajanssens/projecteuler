package nl.bramjanssens.problem1;

public class Main {

    static int calculate(int to) {
        int sum = 0;
        for (int i = 1; i < to; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(i + " is multiple of 3 or 5");
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1000));
    }

}
