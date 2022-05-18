import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {

    }

    public void push(T element) {
        
    }

    public T top() {
        if (list.size() == 0) {
            throw new StackException("Empty stack");
        }
        return list.getFirst();
    }

    public T pop() {
        if (list.size() == 0) {
            throw new StackException("Empty stack");
        }
        T output = list.pop();
        return output;
    }

    public int size() {
        return list.size();
    }
}
