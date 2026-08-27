package app;
import entities.PersonClass;

import java.util.Scanner;
import entities.PersonClass;

public class main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How is your name?");
        String outputname = scanner.nextLine();

        PersonClass user = new PersonClass(outputname);
        System.out.println("Hello, " + user.name);
    }

}
