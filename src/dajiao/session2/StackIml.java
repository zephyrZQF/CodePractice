package dajiao.session2;

public class StackIml implements Stack {
    private int[] stackElem;
    private int top;

    public StackIml(){
        stackElem = new int[8];
        top = 0;
    }

    public StackIml(int size){
        stackElem = new int[size];
        top = 0;
    }

    @Override
    public boolean push(int value) {
        if(stackElem.length == top){
            int[] newArray = new int[stackElem.length*2];
            System.arraycopy(stackElem,0,newArray,0,stackElem.length);
            stackElem = newArray;
            push(value);
            return true;
        }else {
            stackElem[top++] = value;
            return true;
        }
    }

    @Override
    public int pop() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty when pop");
        }
        return stackElem[--top];
    }

    @Override
    public int peak() {
        if(isEmpty()){
            throw new RuntimeException("Stack is empty when peak!");
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
