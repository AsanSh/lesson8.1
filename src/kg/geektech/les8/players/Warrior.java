package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero{

    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int damageIncrease = r.nextInt(4) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (this == heroes[i] && heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - damageIncrease);
            }
        }
    }
}
