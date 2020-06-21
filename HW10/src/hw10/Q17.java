package hw10;

class BubbleException extends Exception {
}

class Fish {
    Fish getFish() throws BubbleException {
        throw new RuntimeException("fish!");
    }
}

public final class Q17 extends Fish {
    public final Q17 getFish() {
        throw new RuntimeException("clown!");
    }

    public static void main(String[] bubbles) {
        final Fish f = new Q17();

        /*
         * - try-catch block is inserted in order to handle RuntimeException and BubbleException
         */
        try {
            f.getFish();
        } catch (RuntimeException | BubbleException r) {

        }
        System.out.println("swim!");
    }
}
