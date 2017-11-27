/**
 * This is a final class MergeSort. It is meant to be used as a Utility class. There is one no args constructor and two
 * methods in this class
 * credit:
 * 1. http://www.geeksforgeeks.org/merge-sort/
 * 2. https://www.toptal.com/developers/sorting-algorithms/merge-sort
 *
 */

// WHY FINAL?
// Correct way to define utility class is to make it final so that no other class can extend it and to have
// private no-args constructor so that no one can create an instance of the class so you won't be able to create
// instance of class any how. However if you go by abstract approach, you cannot use final and there is no way
// you can prevent it from being extended. Hence former approach is better.

public final class MergeSort {

    /**
     * This constructor is private so that no user can create an instance of this class as this class is meant
     * to be used a utility class.
     */
    private MergeSort() {
    }

    /**
     * This class merges two sorted subarrays of arr[]. The first subarray is arr[l..m]. The second subarray is
     * arr[m+1..r]
     * @param arr the array to be merged
     * @param l the first index
     * @param m the middle index
     * @param r the last index
     */
    private static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int [n1];
        int R[] = new int [n2];

        //Copy data to temp arrays
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * This is a recursive function that sorts the array by sorting in halves. It will recursively call itself till
     * the index of the first index is less than the last index which would indicate that it has reached the last possible
     * half(the subarray contains one element)
     * @param arr array to be sorted
     * @param l the first index
     * @param r the last index
     */
    public static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

}
