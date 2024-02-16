package section05.oop.chapter07.finalclass;

public class YalcoChicken {

    protected static final String CREED = "우리의 튀김옷은 얄팍하다.";

    private final int no;
    public String name;

    //  ⭐️ 필수 - no가 final이고 초기화되지 않았으므로
    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void changeFinalFields () {
        // ⚠️ 불가
        // this.no++;
    }

    // 해당 메소드에 final 키워드를 붙인 이유 -> 해당 클래스를 상속한 자식 클래스가 오버라이딩하지 못하도록 한 것이다.
    public final void fryChicken () {
        System.out.println("염지, 반죽입히기, 튀김");
    }
}
