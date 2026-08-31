package tms_homework2.Part3;

import tms_homework2.Part1.*;
import tms_homework2.utilita.Input;

public class PartThreeMain {

    public void mainThree (){
        System.out.println("Выберите номер задания: ");
        int taskNumber = Input.inputInt();

        switch (taskNumber) {
            case 1:
                FibonacciNumbers task12 = new FibonacciNumbers();
                task12.sequenceMethod();
                break;
            case 2:
                DepositClass task13 = new DepositClass();
                task13.depositMethod();
                break;
            case 3:
                MultiplicationTable task14 = new MultiplicationTable();
                task14.multiplicationTableMethod();
                break;
            default:
                System.out.println("Введен неверный номер.");
        }
    }
}
