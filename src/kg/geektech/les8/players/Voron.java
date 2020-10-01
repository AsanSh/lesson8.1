package kg.geektech.les8.players;


//Помощник "Ворон" увеличивает способность медика лечить героев на  n кол-во. При этом у босса проявляется агрессия (увеличивается урон на 50%), если его жизнь меньше 50%.

public class Voron extends Hero {
    private int healPoints;

    public Voron(int health, int damage, int healPoints) {
        super(health, damage, SuperAbility.HEAL);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i] && heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
                if (boss.getHealth() < boss.getHealth() / 2) {
                    heroes[i].setDamage(heroes[i].getHealth() - boss.getDamage() * 2);
                }
            }
        }
    }
}
