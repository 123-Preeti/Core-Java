public class array2 {

    public static void main(String[] args) {

        String[] arr = {"NO26 Sound"};

        // Traverse array
        for (int i = 0; i < arr.length; i++) {

            // Take one string
            String str = arr[i];

            // Traverse each character
            for (int j = 0; j < str.length(); j++) {

                char ch = str.charAt(j);

                // Print uppercase characters
                if (Character.isUpperCase(ch)) {

                    System.out.println("Uppercase: " + ch);
                }

                // Print lowercase characters
                if (Character.isLowerCase(ch)) {

                    System.out.println("Lowercase: " + ch);
                }

                // Print digits
                if (Character.isDigit(ch)) {

                    System.out.println("Digit: " + ch);
                }

                // Print ASCII value
                System.out.println(ch + " -> ASCII: " + (int) ch);
            }
        }
    }
}