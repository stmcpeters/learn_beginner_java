// create a new class called calculator
public class Calculator {

    // Calculator constructor
    public Calculator(){

    }

    // method to add numbers
    public int add(int a, int b){
        return a + b;
    }

    // method to subtract numbers
    public int subtract(int a, int b){
        return a - b;
    }

    // method to multiply numbers
    public int multiply(int a, int b){
        return a * b;
    }

    // method to divide numbers
    public int divide(int a, int b){
        return a / b;
    }

    // method to get the remainder of 2 numbers
    public int modulo(int a, int b){
        return a % b;
    }

    // main method
    public static void main(String[] args){
        // create new instance of calculator class
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7)); // 12
        System.out.println(myCalculator.subtract(45,11)); // 34
        System.out.println(myCalculator.divide(20,2)); // 10
        System.out.println(myCalculator.modulo(6,3));
    }
}