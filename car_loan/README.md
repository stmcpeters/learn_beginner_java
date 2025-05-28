# Car Loan Payment Calculator - Java Project Instructions

## 1. Declare Loan Details
- Create an `int` variable `carLoan` and set it to `10000`.
- Create an `int` variable `loanLength` and set it to `3` (representing 3 years).
- Create an `int` variable `interestRate` and set it to `5` (representing 5% interest).
- Create an `int` variable `downPayment` and set it to `2000`.

## 2. Validate Loan Inputs
- Write an `if` statement to check if:
    - `loanLength <= 0` **or**
    - `interestRate <= 0`
- If this condition is true, print:  
  `"Error! You must take out a valid car loan."`

## 3. Handle Full Payment Scenario
- Add an `else if` clause to check if `downPayment >= carLoan`.
- If true, print a message like:  
  `"The car can be paid in full."`

## 4. Calculate Monthly Payment
- Add an `else` block to handle valid loan calculations.
- Inside the `else` block:
    - Create an `int` variable `remainingBalance = carLoan - downPayment`.
    - Create an `int` variable `months = loanLength * 12`.
    - Create an `int` variable `monthlyBalance = remainingBalance / months`.
    - Create an `int` variable `interest = (monthlyBalance * interestRate) / 100`.
    - Create an `int` variable `monthlyPayment = monthlyBalance + interest`.
    - Print the value of `monthlyPayment`.

## 5. Expected Output
- If all variables are set correctly, the console should output:  
  `233`

## 6. Add Documentation
- Near the top of your program, include comments that describe what the program does.
