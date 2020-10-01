package kg.geektech.les8.players;

import java.util.Random;

//Создать героя Hacker, который будет через раунд забирать у Босса N-ое количество здоровья и переводить его одному из героев.

public class Hacker extends Hero {

    public Hacker(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int damageIncrease = r.nextInt(20);
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - damageIncrease);
                heroes[i].setHealth(heroes[i].getHealth() + damageIncrease);
            }
        }
    }
}
