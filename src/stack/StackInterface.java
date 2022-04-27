package stack;

public interface StackInterface <E> {
    //Returns the number of elements in the stack
    int size();

    //Tests whether the stack is empty
    boolean isEmpty();

    //Adds an element to the top of the stack
    void push(E e);

    //Returns but does not remove the top element of the stack
    E top();

    //Removes and returns the top element from the stack
    E pop();
}
