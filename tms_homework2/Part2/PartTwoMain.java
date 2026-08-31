package tms_homework2.Part2;

import tms_homework2.Part1.*;
import tms_homework2.utilita.Input;

public class PartTwoMain {

    public void mainTwo() {

        System.out.println("Выберите номер задания: ");
        int taskNumber = Input.inputInt();

        switch (taskNumber) {
            case 1:
                OddNumbers task6 = new OddNumbers();
                task6.oddNumbersSequence();
                break;
            case 2:
                FromFiveToOne task7 = new FromFiveToOne();
                task7.sequenceMethod();
                break;
            case 3:
                SumOfSequence task8 = new SumOfSequence();
                task8.sumMethod();
                break;
            case 4:
                SevenSequence task9 = new SevenSequence();
                task9.sequenceMethod();
                break;
            case 5:
                SequenceOfTen task10 = new SequenceOfTen();
                task10.sequenceMethod();
                break;
            case 6:
                SquaresOfNumbers task11 = new SquaresOfNumbers();
                task11.sequenceMethod();
                break;
            default:
                System.out.println("Введен неверный номер.");
        }
    }
}
