package DM575.Exercises.Lab1;

public class Durations {
    public static void main(String[] args) {

        int durations = 3603 + 1383 + 53;

        int hours = durations / 60 / 60;

        durations = durations - hours * 60 * 60;

        int minuts = durations / 60;
        int endSeconds = durations - minuts * 60;

        System.out.println("Hours: " + hours + " Minuts: " + minuts + " Seconds: " + endSeconds);
    }
}
