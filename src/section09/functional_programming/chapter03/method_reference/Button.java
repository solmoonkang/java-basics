package section09.functional_programming.chapter03.method_reference;

public class Button {

    private String text;
    public Button(String text) { this.text = text; }
    public Button(String text, String sound) {
        this(text);
        onClickListener = () -> System.out.println(sound + " " + sound);
    }
    public String getText() { return text; }

    private Runnable onClickListener;
    public void setOnClickListener(Runnable onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void onClick () {
        onClickListener.run();
    }
}
