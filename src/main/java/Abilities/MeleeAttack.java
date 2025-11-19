package Abilities;

import Monsters.Monster;
/**
 * Name: Lichen Cao
 * Date: 11/18/2025
 * Explanation: CST 338: Software Design
 */
public class MeleeAttack implements Attack {

    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }

    @Override
    public Integer attack(Monster target) {
        System.out.println(attacker + " uses a melee attack on " + target);
        return attacker.getStrength() - target.getDefense();
    }
}