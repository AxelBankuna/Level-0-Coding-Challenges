public class Task08 {
    public static void main (String[] args) {
        timeConverter(1);
    }

    public static void timeConverter(int timeInput) {
        int hours = timeInput / 60;
        int minutes = timeInput % 60;

        System.out.print(hours);
        if (hours == 1)
            System.out.print(" hour, " + minutes);
        else
            System.out.print(" hours, " + minutes);
        if (minutes == 1)
            System.out.println(" minute");
        else
            System.out.println(" minutes");
    }
}
