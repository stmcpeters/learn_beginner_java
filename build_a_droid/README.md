# Defining a Droid - Java Project Instructions

## 1. Define the `Droid` Class
- Create a new class named `Droid` in the `Droid.java` file.
- Include a `main()` method (it can be empty for now).

The `Droid` class should model:
- **State**: `name` and `batteryLevel`
- **Behavior**: performing a task and reporting battery level

## 2. Add an Instance Field for `batteryLevel`
Declare an instance field named `batteryLevel` to store whole number values.

## 3. Add an Instance Field for `name`
Declare an instance field named `name` to store the droid's name.

## 4. Create a Constructor
Define a constructor for the `Droid` class with a `String` parameter named `droidName`.

## 5. Initialize Fields in Constructor
- Set the `name` instance field to `droidName`.
- Set the `batteryLevel` instance field to `100`.

## 6. Instantiate a Droid in `main()`
In the `main()` method:
- Create a new `Droid` object named `"Codey"`.

## 7. Print the Droid Object
Use `System.out.println()` to print the `Codey` object.

## 8. Implement `toString()`
Define a `toString()` method that returns a `String` introducing the droid.  
Example output: `"Hello, I’m the droid: Codey"`

## 9. Add `performTask()` Method
Define a method named `performTask()` that:
- Takes one `String` parameter called `task`
- Returns no value

## 10. Implement `performTask()`
Inside `performTask()`:
- Print a message: `"name is performing task: task"`

## 11. Reduce Battery Level
After the message in `performTask()`, reduce `batteryLevel` by 10.

## 12. Perform Tasks in `main()`
Use the `Codey` instance to perform a few tasks by calling `performTask()`.

## 13. Next Steps: Expand Functionality
- Create an `energyReport()` method that prints the current `batteryLevel`.
- Instantiate another `Droid` object.
- Create an `energyTransfer()` method that allows droids to transfer battery energy between each other.

---
