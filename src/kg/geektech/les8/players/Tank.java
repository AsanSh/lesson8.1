package kg.geektech.les8.players;

public class Tank extends Hero {
    private int healPoints;

    public Tank(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this == heroes[i] && heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
            }
        }
    }
}
