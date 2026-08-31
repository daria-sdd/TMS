package tms_homework2.Part1;

import tms_homework2.utilita.Input;

public class SeasonBySwitch {

    public void season() {

        System.out.println("Введите номер месяца (от 1 до 12): ");
        int SeasonNumber = Input.inputInt();

        switch (SeasonNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца.");
        }
    }
}
