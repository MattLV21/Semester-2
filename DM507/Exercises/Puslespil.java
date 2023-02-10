package DM507.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Puslespil {
    public static void main(String[] args) {
        Integer[] intArray;
        Scanner input = new Scanner(System.in);
        System.out.println("Give me an Integer! ");
        int n = input.nextInt();
        input.close();

        intArray = new Integer[n];

        for (int i = 0; i < n; i++) {
            intArray[i] = i;
        }

        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);

        intList.toArray(intArray);

		System.out.println(Arrays.toString(intArray));
        int kreds = findKreds(intArray);
        System.out.println(kreds);
    }

    private static List<Integer> followKreds(Integer[] array, int index) {
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

    public static int findKreds(Integer[] array) {
        List<Integer> found = new ArrayList<Integer>();
        int kreds = 0;
        for(int i = 0; i < array.length; i++) {
            
            // add number to found
            // and look at the kreds
            if (!found.contains(array[i])) {    
                List<Integer> seen = followKreds(array, i);
                found.addAll(seen);
                kreds++;
            }
        }

        return kreds;
    }
}
