package lv.acodemy;

import java.util.Arrays;

public class HomeWork_09032023 {
    public static void main(String[] args) {
        String[] countries = {"Norway", "Sweden", "Finland", "Estonia", "Latvia", "Lithuania", "Poland", "Germany", "Denmark", "Netherlands" };
        System.out.println(Arrays.toString(countries));
        for (int i = 0; i < countries.length; i++) {
            if(countries[i].equals("Latvia")) {
                System.out.println("Latvia is my motherland");
            }
        }
        System.out.println(countries[4] + " " + "is my motherland");

        System.out.println("                             ");


        String[] text = {"Sometimes", " ", "it", " ", "pays", " ", "to", " ", "stay", " ", "in", " ", "bed", " ", "on", " ", "Monday", ",", " ", "rather", " ", "than", " ", "spending", " ", "the", " ", "rest", " ", "of", " ", "the", " ", "week", " ", "debugging", " ", "Monday’s", " ", "code", "." };
        System.out.print(text.length);

        System.out.println("                                 ");
        System.out.println("                                 ");

        for (int x = 0; x < text.length; x++) {
         System.out.print(text[x]);
        }
        int x = -8;
        if (x > 0) {
            System.out.println("The number is positive.");
        } else if (x < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        System.out.println("                                 ");

        double salary = 30000.00;

            if (salary <= 5000) {
                System.out.println("Your salary is low.");
            } else if (salary > 5000 && salary <= 1000) {
                System.out.println("Your salary is average.");
            } else {
                System.out.println("Your salary is high.");
            }
        }
}



































