package dajiao.session2;

import java.util.EmptyStackException;

public class StackIml implements Stack {
    private int[] stackElem;
    private int top;

    public StackIml(){
        stackElem = new int[8];
        top = 0;
    }

    public StackIml(int size){
        if(size < 0)
            throw new IllegalArgumentException("capacity must greater than 0");
        stackElem = new int[size];
        top = 0;
    }

    @Override
    public boolean push(int value) {
        ensureCapacity();
        stackElem[top++] = value;
        return true;
    }

    private void ensureCapacity(){
        if(top == stackElem.length){
            int[] newArray = new int[stackElem.length*2];
            System.arraycopy(stackElem,0,newArray,0,stackElem.length);
            stackElem = newArray;
        }
    }

    @Override
    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stackElem[--top];
    }

    @Override
    public int peak() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stackElem[top - 1];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
