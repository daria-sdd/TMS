package tms_homework2.Part1;

import tms_homework2.utilita.Input;

public class PartOneMain {

    public void mainOne() {

        System.out.println("Выберите номер задания: ");
        int taskNumber = Input.inputInt();

        switch (taskNumber) {
            case 1:
                SeasonBySwitch task1 = new SeasonBySwitch();
                task1.season();
                break;
            case 2:
                SeasonByIfElse task2 = new SeasonByIfElse();
                task2.season();
                break;
            case 3:
                EvenOddChecker task3 = new EvenOddChecker();
                task3.evenOdd();
                break;
            case 4:
                WeatherDecision task4 = new WeatherDecision();
                task4.weather();
                break;
            case 5:
                RainbowColors task5 = new RainbowColors();
                task5.rainbow();
                break;
            default:
                System.out.println("Введен неверный номер.");
        }

    }
}
