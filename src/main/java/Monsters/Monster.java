package Monsters;

import Abilities.Attack;
import java.util.HashMap;
import java.util.Objects;

/**
 * Name: Lichen Cao
 * Date: 11/18/2025
 * Explanation: CST 338: Software Design
 */
public abstract class Monster {

    private Integer hp;
    private Integer maxHP;
    private Integer xp; // default handled in constructors per spec (10)
    private HashMap<String, Integer> items;

    Integer agility  = 10;
    Integer defense  = 10;
    Integer strength = 10;
    Attack attack;

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.xp = (xp == null) ? 10 : xp; // default xp = 10
        this.items = (items == null) ? new HashMap<>() : new HashMap<>(items);
    }


    public Integer getHp() { return hp; }
    public void setHp(Integer hp) { this.hp = hp; }

    public Integer getMaxHP() { return maxHP; }
    public void setMaxHP(Integer maxHP) { this.maxHP = maxHP; }

    public Integer getXp() { return xp; }
    public void setXp(Integer xp) { this.xp = xp; }

    public HashMap<String, Integer> getItems() { return items; }
    public void setItems(HashMap<String, Integer> items) { this.items = items; }

    public Integer getAgility() { return agility; }
    public Integer getDefense() { return defense; }
    public Integer getStrength() { return strength; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster other)) return false;
        return Objects.equals(hp, other.hp)
                && Objects.equals(maxHP, other.maxHP)
                && Objects.equals(xp, other.xp)
                && Objects.equals(items, other.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, maxHP, xp, items);
    }

    public void takeDamage(Integer damage) {
        if (damage != null && damage > 0) {
            System.out.println("The creature was hit for " + damage + " damage");
            hp -= damage;
        }
        if (hp <= 0) {
            System.out.println("Oh no! the creature has perished");
            System.out.println(this);
        }
    }

    public Integer attackTarget(Monster target) {
        Integer dmg = (attack == null) ? null : attack.attack(target);
        target.takeDamage(dmg);
        return dmg;
    }

    @Override
    public String toString() {
        return "(" + hp + "/" + maxHP + ") xp:" + xp +
                " STR:" + strength +
                " DEF:" + defense +
                " AGI:" + agility +
                " items:" + items;
    }
}
