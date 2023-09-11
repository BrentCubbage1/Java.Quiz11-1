package rocks.zipcode.io.quiz4.generics;


import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{
    Stack<SomeType> stack;

    public MyStack() {
        this.stack = new Stack<>();
    }

    public Boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void push(SomeType i) {
            this.stack.push(i);
    }
    public SomeType peek() {
        try{
        return this.stack.peek();
        }
        catch (EmptyStackException empty) {
            return null;
        }
    }

    public SomeType pop() {
        return this.stack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return this.stack.iterator();
    }
}
