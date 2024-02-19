package section05.oop.chapter10.singleton.ex02;

public class Setting {

    private int volume = 5;

    public int getVolume() {
        return volume;
    }
    public void incVolume() { volume++; }
    public void decVolume() { volume--; }
}
