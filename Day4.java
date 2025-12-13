import java.util.Scanner;

//IF–ELSE Based Coding Questions (5 Questions)
/* Q1. Check Odd or Even
Q2. Check Vowel or Consonant
Q3. Find Largest of Three Numbers
Q4. Check Eligibility for Voting
Q5. Check if Number is Positive, Negative or Zero 

SWITCH Based Coding Questions (5 Questions)
Q1. Day of Week
Q2. Simple Calculator
Q3. Month Name
Q4. Grade System
Q5. Check Vowel or Consonant

FOR LOOP
Q1. Print numbers 1 to 10
Use a for-loop to print 1,2,3…10.
Q2. Print even numbers from 1 to 20
Print only even numbers.

while loop
Q3. Print odd numbers from 1 to 20
Q4. Print table of 5
5 × 1 … 5 × 10
Q5. Print first N natural numbers
Input N → print 1 to N.

do while 
Q6. Print numbers from 10 to 1 (reverse order)
Q7. Print alphabets from A to Z
Q8. Print sum of first 10 natural numbers
*/

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
        // Input a number (1–7) and print the corresponding day using switch.

        System.out.println("Enter a number from 1 to 7 to get the day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuseday");
                break;    
                
            case 3:
                System.out.println("wednesday");
                break;
            
            case 4:
                System.out.println("Thursday");
                break;
                
            case 5:
                System.out.println("Friday");
                break;
             
            case 6:
                System.out.println("Saturday");
                break;
                
            case 7:
                System.out.println("Sunday");
                break;

            default:
                break;
        }
        // Take 2 numbers and an operator (+, -, *, /) and perform the calculation.

        System.out.println("Enter first number: ");
        float a = scanner.nextInt();
        System.out.println("Enter second number: ");
        float b = scanner.nextInt();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            
             case '-':
                System.out.println(a - b);
                break;
                
             case '*':
                System.out.println(a * b);
                break;
                
             case '/':
                System.out.println(a / b);
                break;

            default:
                break;
        }
        // Input a number (1–12) and print the month name using switch.

        System.out.println("Enter a number from 1 to 12 to get the month name:");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Janvary");
                break;
        
             case 2:
                System.out.println("February");
                break;

             case 3:
                System.out.println("March");
                break;

             case 4:
                System.out.println("April");
                break;
              
             case 5:
                System.out.println("May");
                break;
                
             case 6:
                System.out.println("June");
                break;

             case 7:
                System.out.println("July");
                break; 
                
             case 8:
                System.out.println("August");
                break;

             case 9:
                System.out.println("September");
                break;
             
             case 10:
                System.out.println("October");
                break;
                
             case 11:
                System.out.println("November");
                break;   
             
             case 12:
                System.out.println("December");
                break;

            default:
                break;
        }
        // Input marks (0–100).Use integer division (marks / 10) inside switch to print grade: 10,9 → A, 8 → B, 7 → C

        System.out.println("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        switch (marks / 10) {
            case 10:
                System.err.println("A");
                break;

            case 9:
                System.out.println("B");
                break;

            case 8:
                System.out.println("C");
                break;

            case 7:
                System.out.println("D");
                break;  

            case 6:
                System.out.println("E");        
                break;  

            case 5:
                System.out.println("F");        
                break;

            case 4:
                System.out.println("F");        
                break;

            case 3:
                System.out.println("F");        
                break;
                
            case 2:
                System.out.println("F");        
                break;

            case 1:
                System.out.println("F");    
                break;    
        
            default:
                break;
        }
        // Input a character and check if it is vowel (a, e, i, o, u) or consonant.Using switch.

        System.out.print("Enter an alphabeat: ");
        char character = scanner.next().charAt(0);

        switch (character) {
            case 'a':
                System.out.println(character + " is vowel");
                break;
        
             case 'e':
                System.out.println(character + " is vowel");
                break;

             case 'i':
                System.out.println(character + " is vowel");
                break;

             case 'o':
                System.out.println(character + " is vowel");
                break;

             case 'u':
                System.out.println(character + " is vowel");
                break;

            default:
                System.out.println(character + " is consonant");
                break;
        }
        // Print numbers 1 to 10.Use a for-loop to print 1,2,3…10.

        System.out.println("Numbers from 1 to 10 are: ");

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        // Print even numbers from 1 to 20. Print only even numbers.

        System.out.println("Even numbers from 1 to 20 are: ");

        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        // Print odd numbers from 1 to 20. While loop.

        System.out.println("Odd numbers from 1 to 20 are: ");
        int i = 1;
        while (i <= 20){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }
        // Print table of 5. 5 × 1 … 5 × 10

        System.out.println("Table of 5 is: ");
        int j = 1;
        while (j <= 10){
            System.out.println("5 x " + j + " = " + (5 * j));
            j++;
        }


        scanner.close(); 

    }
}
