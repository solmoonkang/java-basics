package section05.oop.chapter09.interfacebasic.ex01;

public class GlidingLizard extends Reptile implements Hunter, Swimmer, Flyer {

    @Override
    public void fly() {
        System.out.println("날개막으로 활강");
    }

    @Override
    public void hunt() {
        System.out.println(position + ": 벌레 사냥");
    }

    @Override
    public void swim() {
        System.out.println("꼬리로 수영");
    }
}
