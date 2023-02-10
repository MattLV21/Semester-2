import java.util.Scanner;

// test.java

// public acces modifier

public class test {
    // Display a message on start
    public static void main(String[] args) {
        System.out.print("Plase enter a number ");
        Scanner userInput = new Scanner(System.in);
        int y;
        y = userInput.nextInt();
        System.out.println("You entered " + y);
        userInput.close();
    }

}
