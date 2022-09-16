package main;

public class Main {
    public static void main(String[] args) {

//        The rules of the FizzBuzz game are very simple.
//        Say Fizz if the number is divisible by 3.
//        Say Buzz if the number is divisible by 5.
//        Say FizzBuzz if the number is divisible by both 3 and 5.
//        Return the number itself, if the number is not divisible by 3 and 5.

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }


    }

}
