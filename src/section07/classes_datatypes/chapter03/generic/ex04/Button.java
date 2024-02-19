package section07.classes_datatypes.chapter03.generic.ex04;

public class Button extends FormElement implements Clickable {

    @Override
    public void onClick() { func(); }

    @Override
    void func() { System.out.println("버튼 클릭");}
}
