public class CarLoan {
    public static void main(String[] args) {
        // initial car loan amount
        int carLoan = 10000;
        // initial loan length in years
        int loanLength = 3;
        // represents a 5% interest rate on the loan
        int interestRate = 5;
        // the down payment to be put down
        int downPayment = 2000;


        // check if the loan length is <= to 0 OR interest rate is <= 0
        if (loanLength <= 0 || interestRate <= 0){
            System.out.print("Error! You must take out a valid car loan.");
            // check if the down payment is >= the car loan amount
        } else if (downPayment >= carLoan) {
            System.out.print("The car can be paid in full.");
            // calculate the monthly payment
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            // monthly balance without interest
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;

            System.out.println(monthlyPayment);
        }
    }
}