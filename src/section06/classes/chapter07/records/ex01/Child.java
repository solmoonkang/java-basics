package section06.classes.chapter07.records.ex01;

// ⭐️  레코드로 작성
public record Child(    // 기본적으로 private final 로 선언되고, getter 또한 생성된다.

        String name,
        int birthYear,
        Gender gender
) {}
