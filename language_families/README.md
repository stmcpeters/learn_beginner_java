## Instructions

### 1. Define the Language Class

- In `Language.java`, create a `Language` class with a `main()` method.
- Add the following protected fields:
    - `name`: a string.
    - `numSpeakers`: an integer.
    - `regionsSpoken`: a string.
    - `wordOrder`: a string.

---

### 2. Create a Constructor

- Above the `main()` method, create a constructor for `Language` that sets all fields to values passed in.

---

### 3. Add the getInfo() Method

- Create a public method `getInfo()` that displays the language’s field values.
- It should print the language name, number of speakers, regions spoken, and word order.

---

### 4. Test the Language Class

- In `main()`, instantiate a new `Language` object of your choice.
- Call `getInfo()` on the language variable.
- Compile and run the code to confirm the output.

---

### 5. Create the Mayan Class

- In `Mayan.java`, create an empty `Mayan` class that inherits from `Language`.

---

### 6. Set Default Traits for Mayan

- Set default values in the constructor:
    - `regionsSpoken`: `"Central America"`
    - `wordOrder`: `"verb-object-subject"`
- Do not require these values as parameters; only `name` and `numSpeakers` should be passed in.

---

### 7. Override getInfo() in Mayan

- Override the `getInfo()` method.
- Print the same information format, but add a sentence stating that the language is ergative.

---

### 8. Test the Mayan Class

- In `Language.java`, instantiate a new `Mayan` language of your choice.
- Call `getInfo()` on the variable.
- Compile and run the code to verify the output.

---

### 9. Create the SinoTibetan Class

- In `SinoTibetan.java`, create an empty `SinoTibetan` class that inherits from `Language`.

---

### 10. Set Default Traits for SinoTibetan

- Set default values in the constructor:
    - `regionsSpoken`: `"Asia"`
    - `wordOrder`: `"subject-object-verb"`
- Require only `name` and `numSpeakers` as parameters.

---

### 11. Adjust Word Order for Chinese Languages

- In the constructor, after calling `super()`, check if the language name contains `"Chinese"`.
- If it does, update `wordOrder` to `"subject-verb-object"`.

---

### 12. Test the SinoTibetan Class

- Instantiate two `SinoTibetan` language objects:
    - One with a name containing `"Chinese"` (e.g., "Mandarin Chinese").
    - One without (e.g., "Burmese").
- Call `getInfo()` on each.
- Compile and run the code to check that both display the expected output.

---

### 13. Wrap-Up and Bonus

- You’ve completed your work modeling languages with Java inheritance and polymorphism!
- As a bonus, consider expanding your project by:
    - Adding more language families.
    - Including more linguistic features.
    - Refactoring to use interfaces or abstract classes.
    - Build an array or ArrayList of several language objects and loop through them to call `getInfo()`.
---