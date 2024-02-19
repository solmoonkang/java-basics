package section07.classes_datatypes.chapter03.generic.ex04;

public class HyperLink implements Clickable {

    @Override
    public void onClick() {
        System.out.println("링크로 이동");
    }
}
