package com.brightpaths.javadrills;

import java.util.Scanner;

public class JavaDrills {

    public static void main(String[] args) {


        //PART 1: Variables & Data Types
        String charName = "C-3P0";
        String charBirthYr = "32 BBY";
        String charHomeWrld = "Tatooine";
        String charHeight = "5.10";
        String charWeight = "75 kg";

        //PART 2: Mathematical Operators
        double purse = 150.0;
        purse -= 24.3;
        purse -= 45;
        purse *= 2;
        purse *= .9;

        System.out.println(String.format("%.2f", purse));

        //PART 3: Conditional Love
        String handle = "black";
        String blade = "purple";

        if (handle == "black" && blade == "purple") {
            System.out.println("This one's mine!");
        } else {
            System.out.println("Pass");
        }

        String ship = " not Millennium Falcon";

        if (ship == "Millennium Falcon") {
            System.out.println("let's go");
        } else {
            System.out.println("I better hide somewhere");
        }

        int item = 4;
        boolean recommended = true;


        if (item < 5 && recommended == true) {
            System.out.println("I will try it!");
        } else {
            System.out.println("I won't try it");
        }

        double drink = 0.5;
        boolean large = true;


        if (drink < 1 && large == true) {
            System.out.println("I will order it!");
        } else {
            System.out.println("I won't order it");
        }
        //PART 4: FizzBuzz Deep Dive
/*

public class FizzBuzz {   --On this line the class is declared---

    public static void main(String[] args) {  --On this line the main method is declared--
        fizzBuzz100(); --This line evokes the method written below
    }

    private static void fizzBuzz100() {  --the private method is first declared and does not return anything--
        for (int i = 1; i <= 100; i++) { --a for loop is initialized for 100 iterations--
            if ((i % 3) == 0)            --the loop checks whether the index is divisible by 3--
                System.out.println("fizz");  --if so, it prints out "fizz"
            else if ((i % 5) == 0)       --the loop otherwise checks whether the index is divisible by 5--
                System.out.println("buzz");  --if so, it prints out "buzz"
            else if (((i % 5) == 0) && ((i % 3) == 0)) --the loop otherwise checks if the index is divisible by both 3 and 5--
                System.out.println("fizzbuzz"); --if so, it prints out "fizzbuzz"
            else
                System.out.println(i); --the loop otherwise prints the index number--
        }
    }
}


     ------ REWRITE WITH SWITCH STATEMENT ------
public class FizzBuzz {

    public static void fizzy(String[] args) {
        fizzBuzz100();
    }

    private static void fizzBuzz100() {
        for (int i = 1; i <= 100; i++) {

            switch (i) {
                case (boolean) (i % 3 = 0):
                    System.out.println("fizz");
                    break;
                case (i % 5 == 0):
                    System.out.println("buzz");
                    break;
                case (((i % 5) == 0) && ((i % 3) == 0)):
                    System.out.println("fizzbuzz");
                    break;
                default:
                    System.out.println(i);
                    break;
            }
        }
    }
}

*/


        //PART 5: Functions
        helloWorld();
        greeting();
        System.out.println(add(1,2));
        System.out.println(favColorFinder("red"));
        System.out.println(thatsOdd(2));
        int[] array = new int[]{1,104,3,5};
        bigOrSmall(array);
}

    public static String[] bigOrSmall(int[] arr) {
        String[] answers = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                answers[i] = "big";
            } else if (arr[i] <= 100) {
                answers[i] = "small";
            }
        }
        for (String ans : answers) {
            System.out.println(ans);
        }
    return answers;
    }

    public static String thatsOdd(int num) {
        if (num % 2 == 0) {
            return "That's not odd!";
        } else {
            return "That is odd indeed!";
        }
    }

    public static String favColorFinder(String color) {
        if (color == "red") {
            return "red is a great color";
        } else if (color == "green") {
            return "green is a solid favorite color choice";
        } else if (color == "black") {
            return "so trendy";
        } else {
            return "you need to evaluate your favorite color choice";
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static void greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");

        String name = input.nextLine();
        System.out.println("Hello, " + name + " !");
    }

    public static void helloWorld() {
        System.out.println("Hello, World!");
    }
}
