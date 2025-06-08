# PrimeDirective.java Instructions

## 1. Import ArrayList
At the very top of your program, above the `PrimeDirective` class, import `ArrayList` from `java.util`.

## 2. Create `isPrime()` Method
Inside the `PrimeDirective` class, but outside of the `main()` method, create a public method named `isPrime` that:

- Takes one parameter: an integer called `number`
- Returns `true` if the number is prime
- Returns `false` if the number is not prime

## 3. Understand Prime Numbers
Before implementing logic, remember:

- A prime number is greater than 1
- It is divisible only by 1 and itself
- You can ignore checking divisibility by 1 since every number is divisible by 1
- Focus on checking if the number is divisible by any integer from 2 to `number - 1`

Use paper and pencil to map out how you would check for prime status.

## 4. Add a For-Loop in `isPrime()`
Inside `isPrime()`, create a `for` loop that:

- Starts a counter at 2
- Runs while the counter is less than the input number
- Increments the counter on each loop

## 5. Check If Number is Divisible
Inside the loop, check if the input number is divisible by the current counter.  
If it is divisible, immediately return `false` — the number is not prime.

## 6. Return True If No Divisors Found
If the loop completes without returning `false`, return `true` — the number is prime.

## 7. Handle Edge Cases
Before the loop, include conditions to check for edge cases:

- If the number is equal to 2, return `true` (2 is the smallest prime)
- If the number is less than 2, return `false` (not a prime)

## 8. Test `isPrime()` in `main()`
In the `main()` method, test `isPrime()` by passing several numbers through it using the instance of `PrimeDirective`.  
Test with:

- A prime number (should return `true`)
- A non-prime number (should return `false`)
- The number 2 (should return `true`)
- A number less than 2 (should return `false`)

Then run your program from the command line.

## 9. Create `onlyPrimes()` Method
Inside the `PrimeDirective` class, create another method named `onlyPrimes` that:

- Returns an `ArrayList` of integers
- Takes one parameter: an array of integers

## 10. Create an Empty ArrayList
Inside `onlyPrimes()`, initialize an empty `ArrayList` to store the prime numbers found in the input array.

## 11. Use a For-Each Loop
Use a for-each loop to iterate through each number in the array.

## 12. Add Primes to the List
For each number, use the `isPrime()` method to determine if it is prime.  
If it is, add it to the `ArrayList`.

## 13. Return the ArrayList
After the loop, return the `ArrayList` containing only the prime numbers.

## 14. Test `onlyPrimes()` in `main()`
In the `main()` method, call `onlyPrimes()` on the numbers array using the instance of `PrimeDirective`.  
Print the result to verify only prime numbers are returned.  
Run the program from the command line.

## 15. Expand the Project (Optional)
Enhance the program by trying the following ideas:

- Identify and display twin primes (pairs of primes that differ by 2)
- Generate a list of prime numbers up to a specified limit
- Count the number of primes found in an array
- Optimize the `isPrime()` method to check only up to the square root of the number
- Accept user input to check if a number is prime
- Format the output with clear, user-friendly messages
