package DM575.Exercises.Lab1;

import java.util.Scanner;

public class ScannerDurations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Duration in seconds ");
        int durations = input.nextInt();
        input.close();
        int hours = durations / 60 / 60;

        durations = durations - hours * 60 * 60;

        int minuts = durations / 60;
        int endSeconds = durations - minuts * 60;

        System.out.println("Hours: " + hours + " Minuts: " + minuts + " Seconds: " + endSeconds);
    }
}
