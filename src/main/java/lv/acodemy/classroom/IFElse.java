package lv.acodemy.classroom;

import java.sql.SQLOutput;

public class IFElse {
    // psv command show that we would create here now
    public static void main(String[] args) {
        //IF, ELSE, ELSEIF
        // IF
        /*
        if(condition) conditions give back truth/false {
        code to be executed}
         */
//boolean x = 5 > 2;
//        System.out.println(x);
//if would work only if x is truth
//        if (x) {
//            System.out.println("Yes, 5 is more than 2");
//    }
// If number is cutting by 2 without the rest, number is even (look VariablesDataTypes)

        // if = true, and what if else, to print any condition
        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number:" + number + " is even");
        } else {
            System.out.println("Number:" + number + " is not even");
        }
        //{ code bloc }
        // one = is to get the value, and second = is to compare
        //boolean isEvenNumber = 30 % 2 == 0;
        //System.out.println(isEvenNumber);
        //IF - ELSE - IF - ELSE
        /*
        if(condition) {
        code to be executed
        } else {
        code to be executed
        }
         */

        // pay attention! Bags live on borders (int age = 18 and if < 18? Show Welcome)
        // and IF is checking one by one, so works second, just, "if" does not accepted first
        // If is looking for the first logic in chane
        // int age = 0;
        //if (age <= 18) {
        //    System.out.println("You are not allowed to buy here");
        //} else if (age <= 0) {
        //   System.out.println("Who are You?");
        //} else {
        //   System.out.println("Welcome to our shop!");
        //}

        int age = 18;
        if (age <= 0) {
            System.out.println("Age 0 or less is not allowed");
        } else if (age <= 17) {
            System.out.println("You are not allowed to buy here");
        } else {
            System.out.println("Welcome to our shop!");
        }

        //int age = 18;
        //if (age <= 0) {
        //    System.out.println("Age 0 or less is not allowed");
        //} else if (age <= 17) {
        //    System.out.println("You are not allowed to buy here");
        //} else if(false) {
        // else if(condition), no if, no condition
        //    System.out.println("Welcome to our shop!");
        //}

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Summer months: June, July, August");
        }
        //STRING IF / equals method
        // If John = Hello John!
        // If Tomara = You are not welcome!
        // All others = Very interesting name!

        String name = "Max";
        if (name.equals("John")) {
            System.out.println("Hello John!");
        } else if (name.equals("Tomara")) {
            System.out.println("You are not welcome!");
        } else {
            System.out.println("Very interesting name!");
        }
        // SWITCH CASE;
        //int currentMonth = 1;
        //switch (currentMonth) {
        //    case 0:
        //        System.out.println("This is winter");
        //        break;
        //    case 1:
        //        System.out.println("This is winter");
        //        break;
        //    case 2:
        //        System.out.println("This is winter");
        //        break;
        //    case 3:
        //        System.out.println("This is autumn");
        //        break;
        //    case 4:
        //        System.out.println("This is autumn");
        //}

        // We can make all similar cases in one line!
        // || - it means "or"
        // && - and
        int currentMonth = 4;
        if (currentMonth == 0 || currentMonth == 1 || currentMonth == 2) {
            System.out.println("This is spring");
        } else if (currentMonth == 3 || currentMonth == 4 || currentMonth == 5) {
            System.out.println("This is summer");
        } else if (currentMonth == 6 || currentMonth == 7 || currentMonth == 8) {
            System.out.println("This is autumn");
        } else if (currentMonth == 9 || currentMonth == 10 || currentMonth == 11) {
            System.out.println("This is winter");
        } else {
            throw new IllegalStateException("Unexpected value: " + currentMonth);
            // it means: "give me this type of mistake, in that case"
        }
// IF student1 = "John" and student2 = "Max"
// Print: They will work together
// &&;
        String student1 = "John";
        String student2 = "Max";
        if (student1.equals("John") && student2.equals("Max")) {
            System.out.println("They will work together");
        }
// VAR - variable, principally var should be changed to the other variable, if you don't know what command will be correct
        var myAge = 36;
        System.out.println(myAge);

    }

}


