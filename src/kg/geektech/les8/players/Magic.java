package kg.geektech.les8.players;

import java.util.Random;
// Magic должен увеличивать атаку каждого героя после каждого раунда на n-ное количество

public class Magic extends Hero {

    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random r = new Random();
        int boostHealth = r.nextInt(15) + 6;
        for (int i = 0; i < heroes.length; i++) {
            {
                heroes[i].setHealth(heroes[i].getHealth() + boostHealth);

            }
            System.out.println("magic boosted for " + boostHealth);
        }
    }
}
