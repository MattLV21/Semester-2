package DM507.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Puslespil {
    Integer[] intArray;
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give me an Integer! ");
        int n = input.nextInt();
        input.close();

        Puslespil spil = new Puslespil(n);
		System.out.println(Arrays.toString(spil.intArray));

        int[] kredse = new int[1000];
        for (int i = 0; i < kredse.length; i++) {
            Puslespil puslespil = new Puslespil(n);
            kredse[i] = puslespil.findKreds();
        }
        
        int[] kredsCounts = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < kredse.length; j++) {
                if (kredse[j] == i) {
                    count++;
                }
            }
            kredsCounts[i] = count;
        }

        System.out.println(Arrays.toString(kredsCounts));
        System.out.println(spil.H());

    }
    public Puslespil(int size) {
        intArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            intArray[i] = i;
        }
        intArray = shuffleArray(intArray);
    }

    private Integer[] shuffleArray(Integer[] array) {
        List<Integer> intList = Arrays.asList(array);
        Collections.shuffle(intList);

        array = intList.toArray(array);
        return array;
    }

    public double H() {
        double average = 1;
        for (int i = 2; i < intArray.length; i++) {
            average = average + (double) 1/i;
        }
        return average;
    }

    private List<Integer> followKreds(Integer[] array, int index) {
        boolean endOfKreds = false;
        List<Integer> seen = new ArrayList<Integer>();
        while (!endOfKreds) {
            if (seen.contains(array[index])) {
                endOfKreds = true;
            } else {
                seen.add(array[index]);
                index = array[index];
            }
        }
        return seen;
    }

    public int findKreds() {
        List<Integer> found = new ArrayList<Integer>();
        int kreds = 0;
        for(int i = 0; i < intArray.length; i++) {
            
            if (!found.contains(intArray[i])) {    
                List<Integer> seen = followKreds(intArray, i);
                found.addAll(seen);
                kreds++;
            }
        }

        return kreds;
    }
}
