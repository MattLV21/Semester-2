import java.util.Scanner;

// test.java

// public acces modifier

public class test {
    // Display a message on start
    public static void main(String[] args) {
        
        int mod = 256;
        int pri = 150;


        int newInt = pri % mod;
        int fromNewInt = pri * mod;
        message(newInt);
        message(fromNewInt);
    }

    public static void message(int message) {
        System.out.println(message);
    }

}
