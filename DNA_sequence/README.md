# DNA Program Instructions (Java)

## 1. Set Up the Program Skeleton

- Create a file named `DNA.java`.
- Inside this file, define a public class named `DNA`.
- Include a `main` method within the `DNA` class.

---

## 2. Add a Program Description

- Near the top of your program, write a comment that describes what the program does.
    - Example: Explain that the program checks DNA sequences to determine if they contain a valid protein.

---

## 3. DNA Strand Variables

- Store the following DNA strands in separate `String` variables:
    - `"ATGCGATACGCTTGA"`
    - `"ATGCGATACGTGA"`
    - `"ATTAATATGTACTGA"`
- Name these variables `dna1`, `dna2`, and `dna3`.

---

## 4. Set a Generic DNA Variable

- Create a generic `String` variable named `dna`.
- Assign it to one of the DNA strand variables (`dna1`, `dna2`, or `dna3`).

---

## 5. Find DNA String Length

- Calculate the length of the `dna` string.
- Use an appropriate method to get and optionally print the result.

---

## 6. Find Start Codon (`ATG`)

- Check if the DNA string contains the start codon `"ATG"`.
- Use a method to find the index where `"ATG"` begins.

---

## 7. Find Stop Codon (`TGA`)

- Check if the DNA string contains the stop codon `"TGA"`.
- Use a method to find the index where `"TGA"` begins.

---

## 8. Validate the Protein

- Use an `if` statement to check all of the following:
    - The start codon exists (index not equal to `-1`).
    - The stop codon exists (index not equal to `-1`).
    - The number of nucleotides between start and stop codons is divisible by 3.

---

## 9. Extract the Protein

- If all conditions are met:
    - Create a `String` variable named `protein`.
    - Use the `substring()` method to extract the protein from the DNA.
    - The start index should be where `"ATG"` starts.
    - The end index should include the full stop codon `"TGA"`.

---

## 10. Handle Invalid Proteins

- Add an `else` clause to handle cases where a valid protein is not found.
- Print: `No protein.`

---

## 11. Test the Program

- Test the program by assigning each of the three DNA strands to the `dna` variable.
- Expected results:
    - `dna1`: Contains a protein.
    - `dna2`: Does not contain a protein.
    - `dna3`: Contains a protein.
