// Import statement:
import java.util.ArrayList;

class PrimeDirective {

    // Add your methods here:
    public boolean isPrime(int number) {
        // Check if the number is less than 2, return false
        if (number < 2) {
            return false;
        }
        // Check if the number is 2, return true
        if (number == 2) {
            return true;
        }
        // check if the current element value is less than number
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public  ArrayList<Integer> onlyPrimes(int [] numbers) {
        // initialize arraylist to store prime numbers
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            // check if number is prime, add to primes array if yes
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
//        System.out.println(pd.isPrime(7));  // true
//        System.out.println(pd.isPrime(28));  // false
//        System.out.println(pd.isPrime(2));  // true
//        System.out.println(pd.isPrime(0));  // false
        System.out.println(pd.onlyPrimes(numbers));

    }

}