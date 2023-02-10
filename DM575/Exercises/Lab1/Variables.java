package DM575.Exercises.Lab1;

public class Variables {
    public static void main(String[] args) {
        int number = 5;
        double d = 15.3223;
        float f = 123.31123f;
        int end = 1000;
        int i = 0;

        Lab_1 printer = new Lab_1();
        printer.printString("number: " + number);
        printer.printString("d: " + d);
        printer.printString("f: " + f);
        printer.printString("end: " + end);
        printer.printString("i: " + i);
    }
}