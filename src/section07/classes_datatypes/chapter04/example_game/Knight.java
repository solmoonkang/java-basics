package section07.classes_datatypes.chapter04.example_game;

public class Knight extends Swordman {

    private enum Weapon { SWORD, SPEAR }
    private Weapon weapon = Weapon.SWORD;

    public Knight(Side side) {
        super(side);
        hp += 40;
    }

    public void switchWeapon () {
        weapon = weapon == Weapon.SWORD ? Weapon.SPEAR : Weapon.SWORD;
    }

    private void spearAttack(Unit target) {
        target.hp -= 14;
    }

    @Override
    public void defaultAttack(Unit target) {
        if (weapon == Weapon.SWORD) {
            super.defaultAttack(target);
        } else {
            spearAttack(target);
        }
    }

    @Override
    public String toString() {
        return side.toString() + " 진영 기사";
    }
}
