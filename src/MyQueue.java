import java.util.Arrays;

public class MyQueue {
    private int size = 0;
    private String[] queue = new String[size];

    public void add(String element) {
        resizeForAdd(size+1);
        queue[size-1] = element;

    }
    public String poll(){
        String obj = queue[0];
        resizeForPoll(size-1);
        return obj;
    }
    private void resizeForAdd(int newLength) {
        String[] newQueue = new String[newLength];
        System.arraycopy(queue, 0, newQueue, 0, size);
        size = newLength;
        queue = newQueue;
    }
    private void resizeForPoll(int newLength) {
        String[] newQueue = new String[newLength];
        System.arraycopy(queue, 1, newQueue, 0, size-1);
        size = newLength;
        queue = newQueue;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
