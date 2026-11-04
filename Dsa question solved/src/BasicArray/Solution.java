package BasicArray;

import java.util.Arrays;

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
    public static int FindLargest(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }

    //brute Force
    static int FindSecondLargest1(int[] arr1, int n) {
        Arrays.sort(arr1);
        int Secondlargest = arr1[1];
        return Secondlargest;
    }
    //optimal Second largest and second smallest
    static int FindSecondLargest(int[] num, int n) {
        int First = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;
        for(int x : num){
            if(x > First){
                Second = First;
                First = x;
            }
           else if(x > Second && x!=First){
               Second =x;
            }
        }
        System.out.println("First largest: "+First);
        return Second;
    }


    //reverse array
    public static void reverse(int[] arr, int n) {
            int left = 0;
            int right =n - 1;
            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            for(int i : arr)
                System.out.print(i);

    }

    //print the pairs
    //if calculate total pair no formula is tp=n(n-1)/2
    public static void printPairs(int[] arr, int n) {
//        int tp = n*(n-1)/2;
//        System.out.println(tp);

        for(int i=0;i<n;i++){
            int curr =arr[i];
            for(int j=i+1;j<n;j++){
                System.out.print("("+curr+","+arr[j] +")");
            }
            System.out.println();
        }
    }
    public static void updates(int [] arr){
        arr[0] = 1;
    }
    //print subArray
    public static void printSubArray(int [] arr,int n){
        //total subarray
        int ts =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray : "+ts);
    }

    public static void main(String[] args) {
        int [] arr ={2,4,6,8,10};
        int [] arr1 ={24,21,15,28,45,45};
        int value = FindSecondLargest(arr1,arr1.length);
        System.out.println("Second Largest : "+value);
//        for(int i : arr)
//            System.out.print(i + " ");

       // printSubArray(arr,arr.length);
    }


}
