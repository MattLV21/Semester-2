package DM507.Exercises;

public class InsertionSort {
    
    public static void main(String[] args) {
        Puslespil liste = new Puslespil(50000);
        // System.out.println(Arrays.toString(liste.intArray));
        long time = Sort(liste.intArray);
        // System.out.println(Arrays.toString(liste.intArray));
        System.out.println("Time taken: " + time + " miliseconds");
    }

    public static long Sort(Integer[] A) {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            // Insert A[i] into the sorted subarray A[:i-1] 
            int j = i-1;
            while (j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j = j - 1;
            }
            A[j+1] = key;
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
}
