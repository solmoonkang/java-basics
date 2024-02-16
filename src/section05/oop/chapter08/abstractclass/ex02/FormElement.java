package section05.oop.chapter08.abstractclass.ex02;

public abstract class FormElement {

    protected int space;

    public FormElement(int space) {
        this.space = space;
    }

    abstract void func();
}
