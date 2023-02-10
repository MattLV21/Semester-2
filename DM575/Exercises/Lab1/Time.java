package DM575.Exercises.Lab1;

public class Time {
    public static void main(String[] args) {

        int hours = 1;
        int minuts = 23;
        int seconds = 59;

        minuts = minuts + hours*60;
        seconds = seconds + minuts*60;

        System.out.println(seconds);
    }
}

