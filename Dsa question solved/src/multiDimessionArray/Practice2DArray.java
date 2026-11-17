package multiDimessionArray;

public class Practice2DArray {


    public static void spiralMatrix(int[][] matrix) {
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // 1. Left to Right
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // 2. Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // 3. Right to Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            // 4. Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }


    public static void largest(int [][] arr ){
        int max = Integer.MIN_VALUE;
        int n = arr.length, m = arr[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        System.out.println("The largest number is " + max);
    }
    //brute  force
    public static void diagonalSum(int [][] arr){
        int n = arr.length, m = arr[0].length;
        int sum =0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               if(i==j){
                   sum += arr[i][j];
               } else if (i+j ==n-1) {
                   sum += arr[i][j];
               }
            }
        }
        System.out.println("Sum of diagonal is " + sum);
    }

    //optimal
    public static void diagonalSum2(int [][] arr){
        int n = arr.length, m = arr[0].length;
        int sum =0;
        for(int i = 0; i < n; i++){
            sum += arr[i][i];

            if(i!=n-1-i)
                sum += arr[i][n-1-i];
        }
        System.out.println("Sum of diagonal is " + sum);
    }
    public static void main(String[] args) {
//        int [] [] matrix = new int [3][3];
//        int n=matrix.length, m=matrix[0].length;
////        Scanner sc = new Scanner(System.in);
////        for(int i=0;i<n;i++){
////            for(int j=0;j<m;j++) {
////                System.out.println("Enter in "+i+" "+j);
////                matrix[i][j] = sc.nextInt();
////            }
////        }
       // largest(matrix);

        //output
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++)
//                System.out.print(matrix[i][j]+" ");
//            System.out.println();
//        }

      int [] [] spiral ={
              {1,2,3,4},
              {5,6,7,8},
              {9,10,11,12},
              {13,14,15,16} };
        diagonalSum(spiral);

    }


}
