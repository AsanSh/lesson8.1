package kg.geektech.les8.players;

import java.util.Random;

//Warrior каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.

public class Warrior extends Hero {

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
