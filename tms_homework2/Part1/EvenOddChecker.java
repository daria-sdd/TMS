package tms_homework2.Part1;

import tms_homework2.utilita.Input;

public class EvenOddChecker {

    public static void evenOdd() {

        System.out.println("Введите число: ");
        int numberForCheck = Input.inputInt();

        if (numberForCheck % 2 == 0) {
            System.out.println("Число " + numberForCheck + " четное!");
        } else {
            System.out.println("Число " + numberForCheck + " нечетное!");
        }
    }
}
