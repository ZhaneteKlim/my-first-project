package lv.acodemy.classroom;

public class VariablesDataTipes {
    public static void main(String[] args) {

        Byte myCurrentAge = 36;
        System.out.println(myCurrentAge);

        Short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        char firstNameLetter = 'Z';
        System.out.println(firstNameLetter);

        int dateOfBirth = 290986;
        System.out.println(dateOfBirth);

        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);

        float LapTime = 32.30f;
        System.out.println(LapTime);

        String name = "Zhanete";
        String surName = "Klimovicha";
        String fullName = name + " " + surName;
        System.out.println(fullName);
        String fullNameWithAge = fullName + myCurrentAge;
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old", fullName, myCurrentAge);

        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20 * 10");

        // / division
        double result = (double)a / b;
        System.out.println(result);

        int number = 10 % 9;
        System.out.println(number);





    }
}
