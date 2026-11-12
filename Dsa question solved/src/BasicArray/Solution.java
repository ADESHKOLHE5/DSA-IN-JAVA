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
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j] +")");
            }
            System.out.println();
        }
    }
    public static void updates(int [] arr){
        arr[0] = 1;
    }
    //print subArray
    //brute force
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
    //sum of subArray and find maximum sum of between them
    public static void printSubArraySum(int [] arr,int n){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++) {
                int currentSum =0;
                 for(int k = i; k <= j; k++) {
                     currentSum += arr[k];
                 }
                //System.out.println(currentSum);
                 maxSum = Math.max(currentSum, maxSum);
            }

        }
        System.out.println("MAX SUM : "+maxSum);
    }

    public static void LeftRotateOnes(int[] nums,int n){
        int first =nums[0];
        for(int i=1; i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=first;
    }
    //brute force 189 rotate and array k times 
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n <= 1) return;
        k = k % n;

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

    //leetcode 26 remove duplicate from sorted array
    public int removeDuplicates(int[] nums) {
        int j = 0, n=nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }


    public static void main(String[] args) {
        int [] arr ={2,4,6,8,10};
        int [] arr1 ={24,21,15,28,45};
        LeftRotateOnes(arr1,arr1.length);
        //System.out.println("Second Largest : "+value);
        for(int i : arr1)
            System.out.print(i + " ");

        //printSubArraySum(arr,arr.length);
    }


}
