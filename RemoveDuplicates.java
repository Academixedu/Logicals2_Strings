public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "Hello World";  
        String result = removeDuplicates(input); 
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        String result = ""; 

    
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

          
            if (result.indexOf(c) == -1) {
                result += c; 
            }
        }

        return result; 
    }
}
