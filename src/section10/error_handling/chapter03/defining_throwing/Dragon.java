package section10.error_handling.chapter03.defining_throwing;

import section07.classes_datatypes.chapter04.example_game.Side;
import section07.classes_datatypes.chapter04.example_game.Unit;

class Dragon extends Unit {

    public Dragon(Side side) {
        super(side, 3000);
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 드래곤";
    }
}
