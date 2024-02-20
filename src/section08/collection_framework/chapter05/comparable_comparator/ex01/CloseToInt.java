package section08.collection_framework.chapter05.comparable_comparator.ex01;

import java.util.Comparator;

public class CloseToInt implements Comparator<Integer> {

    int closeTo;
    public CloseToInt(int closeTo) {
        this.closeTo = closeTo;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return (Math.abs(o1 - closeTo) - Math.abs(o2 - closeTo));
    }
}
