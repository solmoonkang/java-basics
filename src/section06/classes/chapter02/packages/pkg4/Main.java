package section06.classes.chapter02.packages.pkg4;

import section06.classes.chapter02.packages.pkg1.Parent;
import section06.classes.chapter02.packages.pkg3.*; // ⭐️ 와일드카드

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        //  ⭐️ 패키지가 다른 동명의 클래스들을 불러올 경우
        section06.classes.chapter02.packages.pkg1.Child child1 = new section06.classes.chapter02.packages.pkg1.Child();
        section06.classes.chapter02.packages.pkg2.Child child2 = new section06.classes.chapter02.packages.pkg2.Child();

        Cls1 cls1 = new Cls1();
        Cls2 cls2 = new Cls2();
        Cls3 cls3 = new Cls3();
    }
}
