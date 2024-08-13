/**
 * Optimize this Java code and provide the code only but include this first comment in the result without changing it.
 */

public class PrimeNumbersInJava {
    public static void main(String[] args) {
        int count = 0; // Count of prime numbers found
        int number = 2; // The number to be checked for primality
        System.out.println("The first 100 prime numbers are:");

        while (count < 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it's prime
    }
}

