/**
 * @author Pavel Belov
 * http://www.shtanyuk.tk/edu/nniit/java-new/labs/labs2.html
 * Lab №2
 * Coffee vending emulator.
 */

public class Main {
    public static void main(String[] args) {
        Automata cafemonster = new Automata();
        cafemonster.on();
        cafemonster.printState();
        cafemonster.printMenu();
        cafemonster.coin(50);
        cafemonster.printState();
        cafemonster.choice("2");
        cafemonster.printState();
        cafemonster.off();
    }
}