package section11.multitasking.chapter06.threadpool_future.ex01;

public class Cave {

    private int water = 40;

    public int getWater() {
        return water;
    }
    public void pump() {
        if (getWater() > 0) water--;
    }
}
