package section07.classes_datatypes.chapter01.object.ex01;

public class Main {
    public static void main(String[] args) {

        Button button1 = new Button("엔터", Button.Mode.DARK, 3);

        // 💡 메소드를 ctrl/command + 클릭하여 Object 클래스 사양 살펴보기
        System.out.println(button1); // ⭐ toString() 을 붙인 것과 같음
    }
}
