package tms_homework2.Part1;

import tms_homework2.utilita.Input;

public class WeatherDecision {

    public static void weather() {

        System.out.println("Сколько градусов на улице? ");
        int temperature = Input.inputInt();

        if (temperature <= -15) {
            System.out.println("Ужасно холодно!");
        } else if (temperature <= 0) {
            System.out.println("Холодно:(");
        } else if (temperature <= 10) {
            System.out.println("Прохладно:/");
        } else if (temperature <= 25) {
            System.out.println("Тепло:)");
        } else {
            System.out.println("Жарко!");
        }
    }
}
