package DM507.Lessions;

// Basic algorithm for calculating largest contiguous segment sum
import java.util.Random;
import java.util.Scanner;

public class MaxSum1 {
    Scanner input = new Scanner(System.in);
    System.out.print("How large an array? ");
    int size = input.nextInt();
    
    // Set up array of n random ints (including negatives)
    // int n = Integer.parseInt(size);
    int[] data = new int[size];
    Random random = new Random();
    for(int i=0; i<n; i++){
        data[i] = -1000 + random.nextInt(2000);
    }

    // Visualize data
    if (n <= 20){
        for(int i=0; i<n; i++){
        System.out.println(data[i]);
        }
    }

    // Start timing
    long time = System.currentTimeMillis();

    // Start of main algorithm
    int maxsofar = 0;
    int sum;
    // For all subsegments
    for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
        // Sum the segment
        sum = 0;
        for(int k=i; k<=j; k++){
            sum += data[k];
        }
        // Update best known segment sum
        maxsofar = Math.max(maxsofar, sum);
        }
    }
    // Print final best segment sum
    System.out.println("Max segment sum: " + maxsofar);

    // End timing
    time = System.currentTimeMillis() - time;
    System.out.println("Milliseconds: " + time);

    }
}
