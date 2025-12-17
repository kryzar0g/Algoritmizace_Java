import java.util.ArrayDeque;
import java.util.Deque;

public class Automat {

    public int state = 0;
    public int input = 0;

    
    public int[][] transition = {
            {2, 2, 3}, // S0
            {0, 1, 2}, // S1
            {1, 1, 0}, // S2
            {0, 0, 1}  // S3
    };

    public int[] output = {0, 1, 5, 3};

    public Deque<Integer> stateHistory = new ArrayDeque<>();
    public Deque<Integer> outputHistory = new ArrayDeque<>();


    public void setInput(int i) {
        input = i;
    }

    public int getState() {
        return state;
    }

    public int getOutput() {
        return output[state];
    }

    public void next() {
        saveHistory();
        state = transition[state][input];
    }

    public void getStateHistory() {
        System.out.println("State history: " + stateHistory);
    }

    public void getOutputHistory() {
        System.out.println("Output history: " + outputHistory);
    }


    public void saveHistory() {
        if (stateHistory.size() == 5) stateHistory.removeFirst();
        if (outputHistory.size() == 5) outputHistory.removeFirst();

        stateHistory.addLast(state);
        outputHistory.addLast(getOutput());
    }
}
