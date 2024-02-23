package section11.multitasking.chapter09.threadsafe_classes;

public class Counter {

    private int count = 0;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void increase() {
        count++;
    }
}
