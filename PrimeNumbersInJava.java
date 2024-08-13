/**
 *
 * <h1>Prompt</h1>
 *
 * Create a single java source code with a PrimeNumbersInJava class and a public static void main method to
 * compute the first 100 prime numbers and print them out
 *
 * <h1>Result</h1>
 *
 * Certainly! Below is a complete Java source code that defines a PrimeNumbersInJava class with a public static void main method.
 * This program computes the first 100 prime numbers and prints them out.
 *
 * <h2>Explanation</h2>
 *
 * **Class Declaration:** The class PrimeNumbersInJava is declared as public.
 * **Main Method:** The public static void main(String[] args) method is the entry point of the program.
 * **Variables:**
 *     count: Keeps track of how many prime numbers have been found.
 *     number: The current number being checked for primality, starting from 2.
 * **While Loop:** The loop continues until 100 prime numbers have been found:
 *     It calls the isPrime method to check if the current number is prime.
 *     If it is prime, the number is printed, and the count is incremented.
 *     The number is then incremented for the next iteration.
 * **isPrime Method:** This method checks if a number is prime:
 *     It returns false for numbers less than or equal to 1.
 *     It checks for divisibility from 2 up to the square root of the number. If any divisor is found, it returns false.
 *     If no divisors are found, it returns true.
 *
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

