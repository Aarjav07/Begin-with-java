

class Day7Prattens {
    public static void main(String[] args) {
               
//      * * * *
//      * * * *
//      * * * *
//      * * * *
        for (int i = 1; i<=4; i++){
            for (int j = 1; j <= 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        *
//        * *
//        * * *
//        * * * *
  for (int i = 1; i<=4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    
//        1
//        1 2
//        1 2 3
//        1 2 3 4
 for (int i = 1; i<=4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
         System.out.println();


//        1
//        2 2
//        3 3 3
//        4 4 4 4
 for (int i = 1; i<=4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
         System.out.println();

//        1 2 3 4
//        1 2 3
//        1 2
//        1
 for (int i = 4; i>=1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
         System.out.println();


//        4 4 4 4
//        3 3 3
//        2 2
//        1
 for (int i = 4; i>=1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
         System.out.println();

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
           for (int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
        System.out.println();

//        A
//        B C
//        D E F
//        G H I J
            char ch = 'A';
           for (int i = 1; i<=4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(ch + "");
                ch++;
            }
            System.out.println();
        }
        System.out.println();

//        * * * *
//        *     *
//        *     *
//        * * * *
           for (int i = 1; i<=4; i++){
            for (int j = 1; j <= 4; j++){
                if (i==1||j==1||i==4||j==4) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           }
           System.out.println();

//              *
//            * *
//          * * *
//        * * * *
           int n=4;
           for (int i=1; i<=n; i++){

            for (int s=n; s>i; s--){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();

           }
           System.out.println();

//            1
//           2 2
//          3 3 3
//         4 4 4 4
//        5 5 5 5 5
           int r = 5;
           for(int i=1; i<=r; i++){

            for (int s=r; s>i; s--){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
           }
           System.out.println();

//                *
//              * * *
//            * * * * *
//          * * * * * * *
//        * * * * * * * * *
//          * * * * * * *
//            * * * * *
//              * * *
//                *

           for(int i=1; i<=r; i++){

            for(int s=r; s>i; s--){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
System.out.println();
        }
        for(int i=4; i>0;i--){
                
            for(int s=5; s>i; s--){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

//      * * * * *
//        * * *
//          *
//        * * *
//      * * * * *

        for (int i = 0; i <= r / 2; i++) {

            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j < r - 2 * i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = r / 2 - 1; i >= 0; i--) {

            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j < r - 2 * i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
