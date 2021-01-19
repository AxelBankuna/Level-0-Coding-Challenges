public class Task06 {
    public static void main (String[] args) {
        System.out.println(max(10));
    }

    public static int max(int ...numbers) {
        int maximum = numbers[0];
        if (numbers.length > 1) {
            for (int i = 1; i < numbers.length; i++)
                if (numbers[i] > maximum)
                    maximum = numbers[i];
        }
        return maximum;
    }
}
