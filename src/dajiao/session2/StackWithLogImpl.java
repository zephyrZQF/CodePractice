package dajiao.session2;

public class StackWithLogImpl extends StackIml {
    public StackWithLogImpl(int maxSize){
        super(maxSize);
    }
    public StackWithLogImpl(){
        super();
    }

    public int size(){
        System.out.println("start size");
        int size = super.size();
        System.out.println("end size");
        return size;
    }

    @Override
    public boolean push(int value) {
        System.out.println("Statrt push " + value);
        boolean push = super.push(value);
        System.out.println("end push " + value);
        return push;
    }

    @Override
    public int pop() {
        System.out.println("start pop");
        int pop = super.pop();
        System.out.println("end pop " + pop);
        return pop;
    }

    @Override
    public int peak() {
        System.out.println("start peak");
        int peak = super.peak();
        System.out.println("end peak " + peak);
        return peak;
    }

    @Override
    public boolean isEmpty() {
        System.out.println("start isEmpty");
        boolean isEmpty =  super.isEmpty();
        System.out.println("start isEmpty");
        return isEmpty;
    }
}
