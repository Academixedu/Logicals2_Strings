public class VowelsandConsonants {

    public static void main(String[] args) {
        String input = "Hello World 12";  
        separateVowelsAndConsonants(input);
    }

    
    public static void separateVowelsAndConsonants(String str) {
        String vowels = "";     // String to store vowels
        String consonants = ""; // String to store consonants

        // Convert the string to lower case to handle both upper and lower case uniformly
        str = str.toLowerCase();

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels += c; 
            }
            
            else if (c >= 'a' && c <= 'z') {
                consonants += c; 
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
