package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        //numbers massive with key FOR
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*
        for(int i = 0; i < 10; i++){
        //define counter; i = 0
        //condition < 10
        //increment i++
        }
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
//numbers [0] = 1
//numbers [1] = 2
        //numbers.length - будет интерировать пока счётчик меньше чем массив
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            System.out.println(numbers[i]);
        }
        //если между командами не написать sout, они сливаются в один текст
        // распечатать только чётные числа:

//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
        //если единица делится на два без остатка, то мы её печатаем
//                System.out.println(numbers[i]);
//            }
//        }
//        System.out.println();
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);


//        for (int number : numbers) {
//            System.out.println(number);
//        }

        //Create String array with 10 names
        //Print all names using for & for each
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        //System.out.println(days[2]);
        // System.out.println("=======//======");
        //   for (int i = 0; i < days.length; i++) {
        //      System.out.println(days[i]);
        // }
        //     if (!days[i].equals("Thursday")) {
        //     } else {
        //         System.out.println(days[i]);
        //     }
        // }
        // System.out.println("=======//======");

        //  for (String name : days) {
        //  System.out.println(name);
        //}
        //System.out.println("=======//======");
        //System.out.println(Arrays.toString(days));
        // print all massive:
        System.out.println("=======//======");

        //   String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        //   for (int i = 0; i < days.length; i++) {
        //    if (days[i].equals("Friday")) {
        //    } else {
        //        System.out.println(days[i]);

        //"Tuesday" do not print:
        //for (int i = 0; i < days.length; i++) {
        //    if (days[i].equals("Tuesday")) {
        //    } else {
        //        System.out.println(days[i]);
        //    }
        // ! = NO (with ! don't print, false, without ! = true )
        // for (int i = 0; i < days.length; i++) {
        //     if (!days[i].equals("Tuesday")) {
        //         System.out.println(days[i]);
        //     }
        //&& - true  || - or

//do, do while
      /*
      do {
      // code to be executed
      } (while is true)
       */
// print while i < 10
// int i = 1;
// do {
//System.out.println(i);
//i++;
//} while (i <= 10);
// он будет печатать единичку
// пока память не закончитсяб и чтобы так не было нужно ограничить счётчик
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        // WHILE. Разница в том что в первом варианте он сперва выподнит, потом проверит
        // а во втором сперва проверит потом выполнит
        System.out.println("=======//======");
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }
        System.out.println("=======//======");

        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];
        // move numbers from arrayOfNum to emptyArray using loop
        // emptyArray[0] = arrayOfNum[0]
        for (int j = 0; j < arrayOfNum.length; j++) {
            emptyArray[j] = arrayOfNum[j];
            System.out.println(Arrays.toString(emptyArray));
            //если последнюю } ввести после команды соут,
            // то распечатает весь процесс того, как набивается сяётчик
        }
        System.out.println("=======//======");
        // JAVA METHODS

    }
}

