package tms_homework2;

import tms_homework2.Part1.PartOneMain;
import tms_homework2.Part2.PartTwoMain;
import tms_homework2.Part3.PartThreeMain;
import tms_homework2.utilita.Input;

public class MainRunner {

    static void main() {

        System.out.println("Выберите номер части: ");
        int partNumber = Input.inputInt();

        switch (partNumber) {
            case 1:
                PartOneMain main1 = new PartOneMain();
                main1.mainOne();
                break;
            case 2:
                PartTwoMain main2 = new PartTwoMain();
                main2.mainTwo();
                break;
            case 3:
                PartThreeMain main3 = new PartThreeMain();
                main3.mainThree();
                break;
            default:
                System.out.println("Введен неверный номер.");
        }
    }
}
