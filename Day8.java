public class Day8 {
    public static void main(String[] args) {
        // Find the number Input - arr = [1,2,4,8,6,45,75,14], target  -=45; output - true
        int[] arr = {1,2,4,8,6,45,75,14};
        int target = 45;
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
        System.out.println(found);

        //Find minimum number Input - arr = [18,22,12,8,6,45,75,14] output - 6
        int[] arr2 = {18, 22, 12, 8, 6, 45, 75, 14};
        int min = arr2[0];

        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }
        System.out.println("Minimum number: " + min);

        //Find maximum number Input - arr = [18,22,12,8,6,45,75,14] output - 75
        int max = arr2[0];

        for (int i = 1; i<arr2.length; i++){
            if (arr2[i] > max){
                max =arr2[i];
            }
        }
        System.out.println("Maximum number: " + max);

        //Sum of array Input - arr = [1,2,3,4,5] output - 15
        int[] arr3 = {1,2,3,4,5};
        int sum = arr3[0];

        for (int i = 0; i<arr3.length; i++){
            sum = sum + arr3[i];
        }
        System.out.println("Total Sum = " + sum);

    }
}