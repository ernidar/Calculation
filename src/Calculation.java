import java.util.Scanner;

public class Calculation {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int firstNumber = userInput.nextInt();

        System.out.print("Please enter another number: ");
        int secondNumber = userInput.nextInt();

        // two ways of getting sum:
        // a. create new variable just for sum
        int sum = firstNumber + secondNumber;
        int product = firstNumber * secondNumber;
        System.out.println("The sum is : " + (firstNumber + secondNumber));
        System.out.println("The product is : " + (firstNumber * secondNumber));

//        //b. do the sum in the print statement
//        System.out.println("---------------------------------------");
//        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is equal to " + sum);
//        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is equal to " + product);

        int square = firstNumber * firstNumber;
        int square2 = secondNumber * secondNumber;
        System.out.println("---------------------------------------");
        System.out.println("The square for first number is : " + square);
        System.out.println("The square for second number is : " + square2);

        System.out.println("---------------------------------------");
        Scanner Input = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String firstWord = Input.nextLine();

        System.out.print("Please enter another word: ");
        String secondtWord = Input.nextLine();

        System.out.println("You say is : " + firstWord + " " + secondtWord);

    }
}