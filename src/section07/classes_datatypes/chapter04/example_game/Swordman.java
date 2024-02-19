package section07.classes_datatypes.chapter04.example_game;

public class Swordman extends Unit implements Attacker {

    public Swordman(Side side) {
        super(side, 80);
    }

    private void swordAttack(Unit target) {
        target.hp -= 10;
    }

    @Override
    public void defaultAttack(Unit target) {
        swordAttack(target);
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 검사";
    }
}
