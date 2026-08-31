package tms_homework2.utilita;

import java.util.Scanner;

public class Input {

    private static final Scanner input = new Scanner(System.in);

    private Input() {}

    public static String inputString() {
        return input.nextLine();
    }

    public static int inputInt() {
        return Integer.parseInt(inputString().trim());
    }

    public static void closeInput() {
        input.close();
    }

}
