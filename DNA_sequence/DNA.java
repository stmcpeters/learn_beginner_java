public class DNA {
    // program that determines whether there is a protein in a strand of DNA.

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        String dna1 = "ATGCGATACGCTTGA"; // yes
        String dna2 = "ATGCGATACGTGA"; // no
        String dna3 = "ATTAATATGTACTGA"; // yes

        String dna = dna3;
//        System.out.println(dna1.length()); // 15
//        System.out.println(dna2.length()); // 13
//        System.out.println(dna3.length()); // 15


        int start = dna.indexOf("ATG"); // 0
        int end = dna.indexOf("TGA"); // 12
//        System.out.println(start);
//        System.out.println(end);

        if (start != -1 && end != -1 && (end-start) % 3 == 0){
            String protein = dna.substring((start + 3), end);
            System.out.println("Protein: " + protein);
        } else {
            System.out.println("No protein.");
        }

    }

}
