package stack;

public class ArrayStack<E> implements StackInterface<E> {
    public static final int CAPACITY = 1000;
    private E[] data;                           //Generic array used for storage
    private int t = -1;                         //index of the top element in the stack
    public ArrayStack() {}
    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];      //Constructs stack with given capacity
    }

    public int size() {
        return t + 1;
    }

    public boolean isEmpty() {
        return t == -1;
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }

    public E pop() {
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
 }
 //Simple an efficient implementation of a Stack
//However it has one drawback, the array has a fixed capacity