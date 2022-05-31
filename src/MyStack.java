import java.util.Arrays;

public class MyStack {
    private int size = 0;
    private int[] stack = new int[size];

    public void push(int item) {
        resizeForPush(size+1);
        stack[size - 1] = item;

    }

    public int pop(){

        int obj = stack[size-1];
        resizeForPop(size-1);
        return obj;
    }
    private void resizeForPop(int newLength) {
        int[] newStack = new int[newLength];
        System.arraycopy(stack, 0, newStack, 0, size-1);
        size = newLength;
        stack = newStack;
    }
    private void resizeForPush(int newLength) {
        int[] newStack = new int[newLength];
        System.arraycopy(stack, 0, newStack, 0, size);
        size = newLength;
        stack = newStack;
    }


    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
