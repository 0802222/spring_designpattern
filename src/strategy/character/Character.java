package strategy.character;

import strategy.weapon.Weapon;

public interface Character {

    void attack(Character target);
    void takeDamage(int damage);
    boolean isDead();


}
