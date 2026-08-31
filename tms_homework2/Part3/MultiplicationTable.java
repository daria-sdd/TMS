package tms_homework2.Part3;

public class MultiplicationTable {

    public void multiplicationTableMethod() {

        for (int multiplier = 1; multiplier < 11; multiplier++) {
            Integer multiplicand = 1;

            while (multiplicand < 11) {
                System.out.println(multiplier + " * " + multiplicand + " = " + multiplicand * multiplier);
                multiplicand++;
            }

            System.out.println("--------------");
        }
    }
}
