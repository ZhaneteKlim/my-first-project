package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExample {
        //MASSIVE
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(numbers[4]);
            // in java we are counting from 0, so number 1 have index 0
            // (number[4]) is to get number 5

            int apples = numbers[6];
            System.out.println("I have " + apples + " apples");
            System.out.println("Number array contains of: " + numbers.length + " numbers");
            //numbers.length - with a command length we get qty of numbers
// we can not change the size of massive, but can change variables, 1 vs 90:
            numbers [0] = 90;
            numbers [9] = 50;
            System.out.println(Arrays.toString(numbers));
//Arrays - it is a class, toString - command (called from class), full command: Arrays.toString

//We can not change size of massive, but we can make variable size from very beginning
//euribor - is empty massive, with the places for 10 numbers:
            int[] euribor = new int[10];
            euribor[0] = 3;
            euribor[1] = 5;
            System.out.println(Arrays.toString(euribor));

//We can create a massive from any data types (int, byte etc):
            String[] names = {"John", "Andrew", "Mike", "Anna", "Marija"};
            System.out.println(names.length);
            System.out.println("My name is: " + names [4]);

            names[3] = "Oscar";
            System.out.println(Arrays.toString(names));

        }
    }
