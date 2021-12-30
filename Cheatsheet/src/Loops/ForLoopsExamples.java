package Loops;

public class ForLoopsExamples<l> {
    public static void countTo100() {
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }

    public static void countTo100ButOnlyPrintEven() {
        for (int j = 0; j < 101; j++) {
            if (j % 2 == 0) {  //logikken som tjekker om nummeret er lige eller ej ...
                System.out.println(j);
            }
        }
    }

    public static void countTo100ButOnlyPrintOdd() {
        for (int k = 0; k < 101; k++) {
            if (k % 2 != 0) {
                System.out.println(k);
            }
        }
    }
}

