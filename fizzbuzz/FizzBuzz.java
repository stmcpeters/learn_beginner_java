public class FizzBuzz {
    public static void main(String[] args){
        for (int i=0; i <= 100; i++){
//            if number is divisible by 3 and 5 == "fizzbuzz"
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
//            if number is divisible by 3 == "fizz"
            } else if (i % 3 == 0){
                System.out.println("Fizz");
//            if number is divisible by 5 == "buzz"
            } else if (i % 5 == 0){
                System.out.println("Buzz");
//                if number is not divisible by 3 or 5, print number
            } else {
                System.out.println(i);
            }
        }
    }
}