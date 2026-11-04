package SearchingAlgo;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int start = 0, end =arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
     }
     //for a string
    public static int binarySearch(String[] movies, String target) {
        int left = 0, right = movies.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid:"+mid);
            int result = target.compareTo(movies[mid]);
            if (result == 0)
                return mid; // Found
            if (result > 0){
                left = mid + 1; // Search right half
                System.out.println("left:"+left);
            }
            else{
                right = mid - 1; // Search left half
                System.out.println("right:"+right);
            }
        }
        return -1; // Not found
    }

    public static int findFirstNonRepeating(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isRepeated = false;

            // Check if arr[i] is repeated in the array
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

            // If not repeated, return the element
            if (!isRepeated) {
                return arr[i];
            }
        }

        return -1; // No non-repeating element found
    }
    public static void main(String[] args) {
        /*int [] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 9;
        System.out.println(search(nums,target));

        String[] movies = {"Avatar","Bagman","Blitz","Carry-on","Dune","Inception", "Interstellar","Titanic","The Gorge"};
        String targetString = "Titanic";
        System.out.println(binarySearch(movies,targetString));*/

        int[] arr1 = {9, 4, 9, 6, 7, 4};
        System.out.println("First non-repeating element: " + findFirstNonRepeating(arr1)); // Output: 6

        int[] arr2 = {1, 1, 1, 2, 2, 3, 3};
        System.out.println("First non-repeating element: " + findFirstNonRepeating(arr2)); // Output: -1

    }
}
