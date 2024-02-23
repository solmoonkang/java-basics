package section11.multitasking.chapter05.wait_notify.ex01;

public class SoldierRun implements Runnable {

    String title;
    PhoneBooth phoneBooth;

    public SoldierRun(String title, PhoneBooth phoneBooth) {
        this.title = title;
        this.phoneBooth = phoneBooth;
    }
    @Override
    public void run() {
        while (true) {
            phoneBooth.phoneCall(this);
        }
    }
}
