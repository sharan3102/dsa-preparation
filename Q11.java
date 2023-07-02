public class StringEncoder {
    public static String encodeString(String inputString) {
        StringBuilder encodedString = new StringBuilder();
        int count = 1;
        char previousChar = inputString.charAt(0);

        for (int i = 1; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (currentChar == previousChar) {
                count++;
            } else {
                encodedString.append(previousChar).append(count);
                previousChar = currentChar;
                count = 1;
            }
        }

        encodedString.append(previousChar).append(count);
        return encodedString.toString();
    }

    public static void main(String[] args) {
        String inputString = "AAAABBBCCCDDEFGG";
        String encodedString = encodeString(inputString);
        System.out.println(encodedString);  // Output: A4B3C3D2E1F1G2
    }
}
