package LoopsPatterns;

public class Solutions {
    public void pattern7(int n) {
        for(int i=1; i<=n; i++){

            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public void pattern8(int n) {
            for(int i=n; i>=1; i--){
                for(int j=1; j<=n-i;j++){
                    System.out.print(" ");
                }

                for(int k=1; k<=2*i-1;k++){
                    System.out.print("*");
                }

                System.out.println();
            }
        }
        public void pattern9(int n) {
            // top half (including the widest row)
            for (int i = 1; i <= n; i++) {
                System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
            }

            // bottom half (skip the widest row, it's already printed)
            for (int i = n-1 ; i >= 1; i--) {
                System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
            }

        }
    public void pattern10(int n) {
        for(int i=1; i<=2*n-1;i++){
            int star = (i>n)? 2*n-i : i ;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void pattern11(int n) {

        for(int i=0;i<n;i++){
            int start=(i%2==0)?1:0;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start= 1 - start;
            }
            System.out.println();

        }

    }
    public void pattern12(int n) {
        int space = 2*(n-1);
        for(int i=1; i<=n; i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=space;j++){
              System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
            space =space -2 ;

        }
    }
    public void pattern14(int n) {
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }

    }
    public void pattern15(int n) {
        for(int i=1;i<=n;i++){
            char ch = 'A';
            for(int j=n;j>=i;j--){
                System.out.print(ch++);
            }
            System.out.println();

        }

    }
    public void pattern20(int n) {

        for (int i = 1; i < 2 * n; i++) {
            int k = i <= n ? i : 2 * n - i; // stars on each side
            // left wing
            for (int j = 0; j < k; j++)
                System.out.print("*");

            // middle gap
            for (int j = 0; j < 2 * (n - k); j++)
                System.out.print(" ");

            // right wing
            for (int j = 0; j < k; j++)
                System.out.print("*");

            System.out.println();
        }
    }
    public void pattern21(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==n || j==1 || i==1 || i==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }


    }
