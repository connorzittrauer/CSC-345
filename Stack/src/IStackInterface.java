import java.util.EmptyStackException;

public interface IStackInterface<T>  {
    public void push(T element) throws StackOverflowError;

    public void pop() throws EmptyStackException;

    public T top() throws EmptyStackException;

    public boolean isEmpty();

    public boolean isFull();
}