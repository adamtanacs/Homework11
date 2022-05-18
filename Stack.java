import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<T>();
    }

    public void push(T element) {
        list.addFirst(element);
    }

    public T top() {
        if (list.size() == 0) {
            throw new StackException("empty stack");
        }
        return list.getFirst();
    }

    public T pop() {
        if (list.size() == 0) {
            throw new StackException("empty stack");
        }
        T output = list.pop();
        return output;
    }

    public int size() {
        return list.size();
    }
}
