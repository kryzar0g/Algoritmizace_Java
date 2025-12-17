public class Main {
    public static void main(String[] args) {

        Automat a = new Automat();

        a.setInput(0);
        a.next();

        a.setInput(1);
        a.next();

        a.setInput(2);
        a.next();

        System.out.println("State: S" + a.getState());
        System.out.println("Output: O" + a.getOutput());

        a.getStateHistory();
        a.getOutputHistory();
    }
}
