package tms_homework2.Part1;

import tms_homework2.utilita.Input;

public class SeasonByIfElse {

    public void season() {

        System.out.println("Введите номер месяца (от 1 до 12): ");
        int SeasonNumber = Input.inputInt();

        if (SeasonNumber < 1 || SeasonNumber > 12) {
            System.out.println("Неверное число");
            return;
        }

        if (SeasonNumber < 3 || SeasonNumber == 12) {
            System.out.println("Зима");
        } else if (SeasonNumber < 6) {
            System.out.println("Весна");
        } else if (SeasonNumber < 9) {
            System.out.println("Лето");
        } else {
            System.out.println("Осень");
        }

    }
}
