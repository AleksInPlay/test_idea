package Methods;

import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);
   static int secretNumber = 5;

    public static void main(String[] args) {
        start();
    }

    static void start(){
        int attempts = readNumberOfAttempts();
        guessNumber(attempts);
        scanner.close();
    }

    static int readNumberOfAttempts(){
        System.out.println("Enter number of attempts");
        return scanner.nextInt();
    }



    static int readNumber(){
        System.out.println("Guess a number between 0 and 9");
        return scanner.nextInt();
    }


    static void guessNumber(int attempts){

        while(attempts > 0) {
           int number = readNumber();
            attempts--;

            if (number == secretNumber) {
                System.out.println("You are right! You have guessed the secret number !");
               return;
            }

            else {
                System.out.print("Sorry, the number  ");

                if (number < secretNumber)
                    System.out.println("is too small");
                else System.out.println("is too big");

                System.out.println("You have " + attempts + " attempts left");
            }

        }
        System.out.println("Sorry, body. maybe some other time");
    }
}
