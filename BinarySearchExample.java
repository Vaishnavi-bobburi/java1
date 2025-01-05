import java.util.Scanner;

class BinarySearchExample {
    // Binary Search method
    int binarySearch(int array[], int element, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid-point

            // Check if the element is present at mid
            if (array[mid] == element)
                return mid;

            // If element is greater, ignore the left half
            if (array[mid] < element)
                low = mid + 1;

            // If element is smaller, ignore the right half
            else
                high = mid - 1;
        }
        // Return -1 if the element is not found
        return -1;
    }

    public static void main(String args[]) {
        BinarySearchExample bs = new BinarySearchExample();
        int[] array = { 3, 4, 5, 6, 7, 8, 9 }; // Sorted array
        int n = array.length;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter element to be searched:");
        int element = input.nextInt();
        input.close();

        // Perform binary search
        int result = bs.binarySearch(array, element, 0, n - 1);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}
