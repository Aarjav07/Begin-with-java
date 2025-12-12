import java.util.Scanner;

//IF–ELSE Based Coding Questions (5 Questions)
/* Q1. Check Odd or Even
Q2. Check Vowel or Consonant
Q3. Find Largest of Three Numbers
Q4. Check Eligibility for Voting
Q5. Check if Number is Positive, Negative or Zero */

public class Day4 {
    // Write a program to take a number and print whether it is odd or even.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
        System.out.println(number + " is even.");
    } else {
        System.out.println(number + " is odd.");
    }
    // Input a character and check if it is vowel (a, e, i, o, u) or consonant.

        System.out.print("Enter an alphabeat: ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'i' || ch == 'e'|| ch == 'o'||ch == 'u'){
            System.out.println(ch + " is vowel");
        }
        else {
            System.out.println(ch + " is consonant");
        }
    // Take 3 numbers and print the largest using only if-else.

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the largest number.");
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is the largest number.");
        }
        else {
            System.out.println(num3 + " is the largest number.");
        }
    // Take age as input. If age ≥ 18 → print Eligible, else Not Eligible.

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("Eligible for voting.");
        }
        else {
            System.out.println("Not eligible for voting.");
        }
    // Input a number and classify it using if-else ladder.

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println(num + " is positive.");
        }
        else if (num < 0){
            System.out.println(num + " is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }
        
        scanner.close(); 
    }
}
