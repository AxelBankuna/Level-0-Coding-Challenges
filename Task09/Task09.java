public class Task09 {
    public static void main (String[] args) {
        voweler("Hello wAAArld or is it hellow World?");
    }

    public static void voweler(String str) {
        String strLower = str.toLowerCase();
        char[] charArray = strLower.toCharArray();

        for (char currentChar : charArray)
            if (isVowel(currentChar))
                System.out.print(currentChar);
        System.out.println();
    }

    public static boolean isVowel(char character) {
        if (character == 'a' || character == 'e' ||
            character == 'i' || character == 'o' || character == 'u')
            return true;
        return false;
    }
}
