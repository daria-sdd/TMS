package tms_homework2.Part1;

import tms_homework2.utilita.Input;

public class RainbowColors {

    public void rainbow() {

        System.out.println("Введите номер цвета в радуге (от 1 до 7): ");
        int rainbowNumber = Input.inputInt();

        switch (rainbowNumber) {
            case 1:
                System.out.println("Красный!");
                break;
            case 2:
                System.out.println("Оранжевый!");
                break;
            case 3:
                System.out.println("Желтый!");
                break;
            case 4:
                System.out.println("Зеленый!");
                break;
            case 5:
                System.out.println("Голубой!");
                break;
            case 6:
                System.out.println("Синий!");
                break;
            case 7:
                System.out.println("Фиолетовый!");
                break;
            default:
                System.out.println("Введен неверный номер.");
        }
    }
}
