package lv.acodemy.classroom2;

import java.util.Arrays;

public class VariablesDataTypes {
    public static void main(String[] args) {

        byte myCurrentAge = 36;
        System.out.println(myCurrentAge);

        short salaryPerMunth = 1000;
        System.out.println(salaryPerMunth);

        //char contains just a symbols and z have 122 code
        char firstNameLetter = 122;
        System.out.println(firstNameLetter);

        // Letter should be written in ''
        char nameLetter = 'Z';
        System.out.println(nameLetter);

        //int data type is all whole numbers
        int dateOfBirth = 290986;
        System.out.println(dateOfBirth);

        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);

        //if we would not type f in the end, java will try to write it as a double
        float lapTime = 32.30f;
        System.out.println(lapTime);

        //difference in double and float is necessary in counting
        double weight = 71.5;
        System.out.println(weight);

        //boolean is; has; for true and false
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;
        // haw to combine several strings
        System.out.printf("%s %s %s\n", isWinter, isSpring, hasApples );

        // String
        String name = "Zhanete";
        String surName = "Klimovicha";
        //Concatenation, in "" is a space
        String fullName = name + " " + surName;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;
        //System.out.println("Zhanete Klimovicha 36");
        // Zhanete Klimovicha 36
        System.out.printf("My full name is: %s. I am %d years old.%n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        //Println = print a new line, and printf writing all in one line
        // to create different lines use \n or %n, and it does not work in println


        // COUNTING OPERATIONS
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20 * 10");

        // divisions / btw int might be just whole number, and that's why is written (double)
        double result = (double) a / b;
        System.out.println(result);

        // % остаток от деления, нужно чтобы найти чётное число, что поделится без остатка
        int number = 10 % 9;
        System.out.println(number);

        // int[] numbers массив чисел
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        // СОЗДАНИЕ ЛОГИКИ:"если деление этого числа без остатка = 0, то значит оно чётное"
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println("This is even number:" + numbers [i]);
            }
        }
    }
}
