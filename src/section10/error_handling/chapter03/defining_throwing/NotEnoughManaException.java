package section10.error_handling.chapter03.defining_throwing;

import section07.classes_datatypes.chapter04.example_game.MagicKnight;

public class NotEnoughManaException extends RuntimeException {

    public NotEnoughManaException(MagicKnight mk, int neededMana) {
        super(
                "마나가 %d 부족합니다."
                        .formatted(neededMana - mk.mana)
        );
    }
}
