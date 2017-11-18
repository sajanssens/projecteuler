package nl.bramjanssens.problem2;

public class Main {

    static long calculate(long to) {
        long prevFib = 1;
        long currFib = 2;
        long nextFib = 0;

        int result = 2;

        while (nextFib < to) {
            nextFib = nextFib(prevFib, currFib);
            if (nextFib % 2 == 0) result += nextFib;
            prevFib = currFib;
            currFib = nextFib;
        }

        return result;
    }

    static long nextFib(long fib1, long fib2) {
        return fib1 + fib2;
    }

    public static void main(String[] args) {
        System.out.println(calculate(4000000));
    }

}
