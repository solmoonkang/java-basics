package section07.classes_datatypes.chapter03.generic.ex05;

public class HorseShop {

    public static void intoBestSellers (Horse<? extends Unit> horse) {
        System.out.println("베스트셀러 라인에 추가 - " + horse);
    }

    public static void intoPremiums (Horse<? extends Knight> horse) {
        System.out.println("프리미엄 라인에 추가 - " + horse);
    }

    public static void intoEntryLevels (Horse<? super Knight> horse) {
        System.out.println("보급형 라인에 추가 - " + horse);
    }
}
