package algorithms;

public class BinarySearch {

    public static int search(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        int target = 23;
        int result = search(numbers, target);

        if (result != -1) {
            System.out.println(
                    "Element found at index: " + result
            );
        } else {
            System.out.println("Element not found.");
        }
    }
}
