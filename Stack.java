import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void push(T element) {
        list.addFirst(element);
    }

    public T pop() {
        if (list.size() == 0) {
            throw new StackException("empty stack");
        }
        T output = list.removeFirst();
        return output;
    }

    public T top() {
        if (list.size() == 0) {
            throw new StackException("empty stack");
        }
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }
}
