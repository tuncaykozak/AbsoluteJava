package homework_003.primenumber;

public class PrimeNumber {

    public static void main(String[] args) {

        //System.out.println(isPrime( 6245098347044246839L));
        test();
    }

    public static void test() {

        for (int i = 0; i < 1000000; ++i) {
            if (isPrime(i))
                System.out.printf("%d is prime number!%n", i);
        }
    }

    public static boolean isPrime(long number) {

        if (number <= 1)
            return false;

        if (number % 2 == 0)
            return number == 2;

        for (long i = 3; i * i <= number; i += 2) {
            if (number % i == 0)
                return false;
        }

        return true;
    }
}
