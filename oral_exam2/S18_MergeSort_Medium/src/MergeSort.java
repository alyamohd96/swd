/**
 *
 * http://www.geeksforgeeks.org/merge-sort/
 * https://www.toptal.com/developers/sorting-algorithms/merge-sort
 *
 * WHY FINAL?
 * Correct way to define utility class is to make it final so that no other class can extend it and to have
 * private no-args constructor so that no one can create an instance of the class.
 * So you won't be able to create instance of class any how. However if you go by abstract approach, you cannot
 * use final and there is no way you can prevent it from being extended. Hence former approach is better.
 */

public final class MergeSort {

    private MergeSort() {

    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    private static void merge(int arr[], int firstIndex, int middle, int lastIndex)
    {
        // Find sizes of two subarrays to be merged
        int size1 = middle - firstIndex + 1;
        int size2 = lastIndex - middle;

        /* Create temp arrays */
        int left[] = new int [size1];
        int right[] = new int [size2];

        /*Copy data to temp arrays*/
        for (int i=0; i<size1; ++i)
            left[i] = arr[firstIndex + i];
        for (int j=0; j<size2; ++j)
            right[j] = arr[middle + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0;
        int j = 0;

        // Initial index of merged subarry array
        int k = firstIndex;
        while (i < size1 && j < size2)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of left[] if any */
        while (i < size1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < size2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static void sort(int arr[], int firstIndex, int lastIndex)
    {
        if (firstIndex < lastIndex)
        {
            // Find the middle point
            int middle = (firstIndex+lastIndex)/2;

            // Sort first and second halves
            sort(arr, firstIndex, lastIndex);
            sort(arr , middle+1, lastIndex);

            // Merge the sorted halves
            merge(arr, firstIndex, middle, lastIndex);
        }
    }

}
