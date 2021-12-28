package se.lexicon.susanne;
import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello" );
//      System.out.println( "Susanne" );
//     mathNumbers();
 //       averageOfThree2();
 //       writeUsername();
//        timeConverter();
        guessTheNumber();
    }

    /**
     * Create a program that takes a year as input from user and print if it’s leap year or not.
      */
    public static void leapYear()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Vilket år vill du kontrollera? ");

        int year = myObj.nextInt();
        if (year % 4 == 0)
            System.out.print("Skottår!");
        else
            System.out.print(" Inte skottår.");
    }
/**
 * Write a Java program to print the sum/multiplication/division and subtraction of two numbers.
 */
    public static void mathNumbers()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Första siffran?  ");
        int number1 = myObj.nextInt();

        System.out.println("Andra siffran?  ");
        int number2 = myObj.nextInt();

        int result;

        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result );

        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result );

        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result );

        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result );
    }

    /**
     * Write a Java program that prints the average of three numbers
     */
    public static void averageOfThree(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Första siffran?  ");
        double number1 = myObj.nextDouble();

        System.out.println("Andra siffran?  ");
        double number2 = myObj.nextDouble();

        System.out.println("Tredje siffran?  ");
        double number3 = myObj.nextDouble();

        double result;

        result = ( number1 + number2 + number3 ) / 3;
        System.out.println("( "+ number1 + " + " + number2 + " + " + number3 + " / 3" + " ) " + " = " + result );
    }

    public static void averageOfThree2(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Första siffran?  ");
        int number1 = myObj.nextInt();

        System.out.println("Andra siffran?  ");
        int number2 = myObj.nextInt();

        System.out.println("Tredje siffran?  ");
        int number3 = myObj.nextInt();

        int result;

        result = ( number1 + number2 + number3 ) / 3;
        System.out.println("( "+ number1 + " + " + number2 + " + " + number3 + " / 3" + " ) " + " = " + result );
    }
/**
 * Create a program that asks user to input his/her name and store it in a variable instead of having fixed name.
 * Then print ‘Hello username’ where username is what you got from user as input.
 */

    public static void writeUsername(){
        Scanner myObj=new Scanner(System.in);
        class Person{
            String userName;
        }
        System.out.println("Your username: ");
        Person nyPerson = new Person();
        nyPerson.userName = myObj.next();
        System.out.print("Hello " + nyPerson.userName);
    }
/**
 * Create a program that converts seconds to hours, minutes and seconds
 */
    public static void timeConverter(){
        long rest;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Seconds to convert: ");
        long inSeconds = myObj.nextLong();
        long hour = inSeconds/3600;
        rest = inSeconds % 3600;
        long minutes = rest / 60;
        long seconds = rest % 60;
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
    /**
     * Write a program that first generates a random number between 1 and 500 and
     * stores it into a variable (see the Random class). Then let the user make a
     * guess for which number it is. If the user types the correct number, he should
     * be presented with a message (including the number of guesses he has made).
     * If he types a number that is greater or smaller than the given number,
     * display either “Your guess was too small” or “Your guess was too big”.
     * The program should keep executing until the user input the correct guess.
     */
    public static void guessTheNumber(){
        int randomNumber = new Random().nextInt(501);
        System.out.print("Gissa ett nummer mellan 1 och 500: ");
        int guessingNumber = new Scanner(System.in).nextInt();
        boolean rightNumber = true;

        do{
            if (guessingNumber > randomNumber){
                System.out.println("Numret är för stort, prova ett lägre nummer: ");
                guessingNumber = new Scanner(System.in).nextInt();
            }else if (guessingNumber < randomNumber){
                System.out.println("Numret är för litet, försök igen: ");
                guessingNumber = new Scanner(System.in).nextInt();
            }
            else {
                System.out.println("Grattis du gissade rätt! ");
                rightNumber=false;
            }
        }while(rightNumber);
    }
}
