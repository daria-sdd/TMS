package tms_homework2.Part3;

import tms_homework2.utilita.Input;

public class DepositClass {

    public void depositMethod(){

        System.out.println("Первоначальная сумма вклада: ");
        float deposit = Input.inputInt();

        System.out.println("Количество месяцев: ");
        int monthCount = Input.inputInt();

        for(int counter = 0; counter < monthCount; counter++){
            deposit = (float) (deposit + 0.07 * deposit);
        }

        System.out.println("Сумма вклада по прошествии " + monthCount + " месяцев: " + deposit);
    }
}
