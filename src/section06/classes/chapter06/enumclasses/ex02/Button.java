package section06.classes.chapter06.enumclasses.ex02;

public class Button {

    enum Mode { LIGHT, DARK }
    enum Space { SINGLE, DOUBLE, TRIPLE }

    private Mode mode = Mode.LIGHT;
    private Space space = Space.SINGLE;

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
}
