// import java.util.Scanner;

// public class function {
//     public static void printMyname(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printMyname(name);
//     }
// }

// import java.util.Scanner; 

// public class function {
//     public static int sum(int a, int b) {
//         int result = a + b;
//         return result;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         int result = sum(a, b);
//         System.out.println("The sum is: " + result);
//     }
// }

// import java.util.Scanner;

// public class function {
//     public static int product(int a, int b) {
//         return a * b;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         System.out.println("The product is: " + product(a, b));
//     }
// }

// import java.util.Scanner;

// public class function {
//     public static int factorial(int n) {
//         if (n==1) {
//             return n;
//         }
//         else{
//             return n * factorial(n-1);
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int n = sc.nextInt();

//         System.out.println("The Factorial of the number : " + factorial(n));
//     }
// }

// Enter 3 numbers from the user & make a function to print their average.
// import java.util.Scanner;

// public class function {
//     public static int average(int a ,int b, int c) {
//         return (a+b+c)/3;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number");
//         int b = sc.nextInt();
//         System.out.println("Enter the third number");
//         int c = sc.nextInt();

//         System.out.println("The average of the numbers is: " + average(a, b, c));
//     }
// }

// Write a function to print the sum of all odd numbers from 1 to n.
// import java.util.Scanner;

// public class function {
//     public static int sumOfOddnumber(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 sum += i;
//             }
//         }
//         return sum;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number");
//         int n = sc.nextInt();
//         System.out.println(" sum of all odd numbers from 1 to " + n + " is :" + sumOfOddnumber(n));
//     }
// }