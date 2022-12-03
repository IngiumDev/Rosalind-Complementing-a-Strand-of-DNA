public class ComplementDNA {
    public static void main(String[] args) {
        // Sample input: AAAACCCGGT
        String sampleInput = "AAAACCCGGT";
        System.out.println(reverseComplement(sampleInput)); // Output: ACCGGGTTTT
    }

    // This method returns the reverse complement of a DNA string
    public static String reverseComplement(String DNA) {
        // Create a string to hold the reverse complement
        StringBuilder reversedDNA = new StringBuilder();
        // Array of Bases
        char[] Bases = {'A', 'C', 'G', 'T'};
        // Array of Complements
        char[] Complements = {'T', 'G', 'C', 'A'};
        // Loop through the DNA string in reverse
        for (int i = DNA.length() - 1; i >= 0; i--) {
            // Loops through the Bases array
            for (int j = 0; j < Bases.length; j++) {
                // If the current base is equal to the current base in the Bases array
                if (Character.toLowerCase(DNA.charAt(i)) == Character.toLowerCase(Bases[j])) {
                    // Add the complement to the reversedDNA string
                    reversedDNA.append(Complements[j]);
                }
            }
        }
        // Return the reversedDNA string
        return reversedDNA.toString();
    }
}
