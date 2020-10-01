package kg.geektech.les8.players;


//Помощник "боса" bossHelper увеличивает способность Боса увеличить урон на 20% от здоровья героя. При этом у босса добавляется 20% на его жизньб в случае если у боса меньше здорове чем 100

public class BosHelper extends Hero {
    private int healPoints;

    public BosHelper(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this == heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() - heroes[i].getHealth()*heroes[i].getHealth()/5);
                if(boss.getHealth() < 100){
                    boss.setHealth(boss.getHealth() + heroes[i].getHealth()/5);
                }

                }
            }
        }
    }

