package dajiao.session2;

public class StackWithLogImpl extends StackIml {
    public StackWithLogImpl(int maxSize){
        super(maxSize);
    }
    public StackWithLogImpl(){
        super();
    }

    public int size(){
        logBefore("size");
        int size = super.size();
        logAfter(" size");
        return size;
    }

    @Override
    public boolean push(int value) {
        logBefore("push " + value);
        boolean push = super.push(value);
        logAfter("push " + value);
        return push;
    }

    @Override
    public int pop() {
        logBefore("pop");
        int pop = super.pop();
        logAfter("pop " + pop);
        return pop;
    }

    @Override
    public int peak() {
        logBefore("peak");
        int peak = super.peak();
        logAfter("peak");
        return peak;
    }

    @Override
    public boolean isEmpty() {
        logBefore("isEmpty");
        boolean isEmpty =  super.isEmpty();
        logAfter("isEmpty");
        return isEmpty;
    }

    private void logBefore( String  method) {
        System.out.println("start "+ method);
    }

    private void logAfter( String  method) {
        System.out.println("after "+ method);
    }
}
