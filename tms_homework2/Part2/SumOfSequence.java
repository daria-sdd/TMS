package tms_homework2.Part2;

import tms_homework2.utilita.Input;

public class SumOfSequence {

    public void sumMethod() {

        System.out.println("Введите любое число: ");
        int inputNumber = Input.inputInt();

        Integer finalSum = 0;

        for (int counter = 1; counter <= inputNumber; counter++) {
            finalSum = finalSum + counter;
        }

        System.out.println("Финальная сумма: " + finalSum);
    }
}
