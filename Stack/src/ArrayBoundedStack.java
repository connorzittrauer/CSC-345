import java.util.EmptyStackException;


public class ArrayBoundedStack<T> implements IStackInterface<T> {
    protected final int DEF_CAP = 100; //default capacity
    protected T[] elements;
    protected int topIndex = -1;

    public ArrayBoundedStack() {
        elements = ((T[]) new Object[DEF_CAP]);
    }

    public ArrayBoundedStack(int maxSize) {
        elements = (T[]) new Object[maxSize];
    }

    @Override
    public void push(T element)
    // Throws StackOverflowException if this stack is full,
    // otherwise places element at the top of this stack.
    {
        if (isFull())
            throw new StackOverflowError("Push attempted on a full stack.");
        else
        {
            topIndex++;
            // inserts the element at the top index, beginning at index 0
            elements[topIndex] = element;
        }
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            elements[topIndex] = null;
            topIndex --;
        }
    }

    public T top() {
        T topOfStack = null;
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            topOfStack = elements[topIndex];
            return topOfStack;
        }
    }
    public boolean isEmpty(){
        // if equal to -1 its empty
        return topIndex == -1;
    }
    public boolean isFull() {
        return  topIndex == (elements.length -1);
    }


}
