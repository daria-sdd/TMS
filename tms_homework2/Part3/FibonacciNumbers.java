package tms_homework2.Part3;

public class FibonacciNumbers {

    public void sequenceMethod() {
        Integer fibonacciCurrent = 0;
        Integer fibonacciOld = -1;
        Integer buffer;

        for (int counter = 0; counter < 12; counter++) {
            System.out.println(fibonacciCurrent);
            buffer = fibonacciCurrent;
            fibonacciCurrent = fibonacciCurrent + Math.abs(fibonacciOld);
            fibonacciOld = buffer;

        }
    }
}

