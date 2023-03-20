package lv.acodemy.classroom;

import java.util.Arrays;

public class HomeWork_09032023 {
    public static void main(String[] args) {
        String[] countries = {"Norway", "Sweden", "Finland", "Estonia", "Latvia", "Lithuania", "Poland", "Germany", "Denmark", "Netherlands" };
        System.out.println(Arrays.toString(countries));
        System.out.println(countries[4] + " " + "is my motherland");

        System.out.println("                             ");


        String[] text = {" Sometimes", " ", "it", " ", "pays", " ", "to", " ", "stay", " ", "in", " ", "bed", " ", "on", " ", "Monday", ",", " ", "rather", " ", "than", " ", "spending", " ", "the", " ", "rest", " ", "of", " ", "the", " ", "week", " ", "debugging", " ", "Monday’s", " ", "code", "." };
        System.out.print(text.length);
        for (int x = 0; x < text.length; x++) {
            System.out.print(text[x]);
        }
        System.out.println("                                 ");
        System.out.println("                                 ");

        int x = -8;
        if (x > 0) {
            System.out.println("The number is positive.");
        } else if (x < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.println("                                 ");

        double salary = 40000.00;

        for (int i = 0; i < 10000; i++) {

            if (salary <= 5000) {
                System.out.println("Your salary is low.");
                return;
            } else if (salary <= 10000) {
                System.out.println("Your salary is average.");
                return;
            } else {
                System.out.println("Your salary is high.");
                return;
            }
        }
    }
}

