package section08.collection_framework.chapter05.comparable_comparator.ex01;

import java.util.Comparator;

public class IntDescComp implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
