import java.util.EmptyStackException;

public interface IStapel<E> {
    E top() throws EmptyStackException;

    E pop() throws EmptyStackException;

    void push(E e);

    E equals() throws EmptyStackException;
}
