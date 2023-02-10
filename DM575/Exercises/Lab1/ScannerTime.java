package DM575.Exercises.Lab1;

import java.util.Scanner;

class ScannerTime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many hours? ");
        int hours = input.nextInt();

        System.out.print("How many minuts? ");
        int minuts = input.nextInt();

        System.out.print("How many seconds? ");
        int seconds = input.nextInt();
        input.close();

        minuts = minuts + hours*60;
        seconds = seconds + minuts*60;

        System.out.println("Time in seconds: " + seconds);
    }
}
