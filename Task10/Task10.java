public class Task10 {
    public static void main (String[] args) {
        commonLetters("hello", "World");
    }

    public static void commonLetters(String str1, String str2) {
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        boolean commaFlag = false;

        System.out.print("Common letters: ");
        for (char letter1 : charArray1)
            for (char letter2 : charArray2)
                if (letter1 == letter2) {
                    if (commaFlag == true)
                        System.out.print(", ");
                    System.out.print(letter1);
                    letter2 = '.';
                    commaFlag = true;
                }
        System.out.println();
    }
}
