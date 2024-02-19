package section06.classes.chapter07.records.ex01;

public enum Gender {

    MALE("👦🏻"), FEMALE("👧🏼");

    private String emoji;
    Gender(String emoji) { this.emoji = emoji; }
    public String getEmoji() { return emoji; }
}
