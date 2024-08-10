public class FindNum {

    public static void main(String[] args) {
        String input = "Java12Script";
        findNumbersInString(input); 
    }
    public static void findNumbersInString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); 
            if (c >= '0' && c <= '9') {
                // 0
                // 9
                System.out.println(c);
            }
        }
    }
}
