public class RevString {
    public static void main(String[] args) {

        String input = "Hello";
        String OrgString = input;

        // Convert the string to a char array
        char[] chars = input.toCharArray();

        // Use two pointers to swap characters
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }
        // Convert char array back to string
        String reversedString = new String(chars);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);

        if(input.equals(OrgString)){
            System.out.println("yes");
        }

    }
}
