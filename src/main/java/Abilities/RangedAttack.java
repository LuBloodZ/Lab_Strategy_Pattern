package Abilities;

import Monsters.Monster;
/**
 * Name: Lichen Cao
 * Date: 11/18/2025
 * Explanation: CST 338: Software Design
 */
public class RangedAttack implements Attack {

    Monster attacker;

    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        System.out.println(attacker + " uses a ranged attack on " + target);
        return attacker.getAgility() - target.getAgility();
    }
}