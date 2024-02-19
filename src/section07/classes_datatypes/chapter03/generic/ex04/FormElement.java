package section07.classes_datatypes.chapter03.generic.ex04;

public abstract class FormElement {

    public enum MODE { LIGHT, DARK }

    private static MODE mode = MODE.LIGHT;

    public void printMode () {
        System.out.println(mode);
    }

    abstract void func ();
}
