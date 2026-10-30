package BasicArray;

public class Solution {
    // counts odd numbers in array
    public int countOdd(int[] arr, int n) {
        int counter=0;
        for(int value : arr){
            if(value%2 != 0)
                counter++;
        }
        return counter;

    }

    //sum of array
    public  int sum(int arr[], int n) {
        int sum =0;
        for(int value : arr )
            sum = sum+ value;

        return sum;
    }

    //check given array is sorted or not
    //Brute force
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i = 0; i < n-1; i++){  //0 to length -2
            for(int j=i+1; j<n;j++){   //1 to length - 1
                if(arr[i] > arr[j])
                    return false;
            }
        }
        return true;
    }

    //optimal solution
    boolean arraySortedOrNot1(int[] arr, int n) {
        for(int i = 1; i < n; i++){ //1 to n-1
            if(arr[i] < arr[i-1])    //checks index 1 > index 0
                return false;
        }
        return true;
    }
}
