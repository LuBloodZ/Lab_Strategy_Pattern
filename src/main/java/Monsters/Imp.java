package Monsters;

import Abilities.Attack;
import Abilities.MeleeAttack;
import java.util.HashMap;
/**
 * Name: Lichen Cao
 * Date: 11/18/2025
 * Explanation: CST 338: Software Design
 */
public class Imp extends Monster {

    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP, xp, items);

        Integer maxStr = 15, maxDef = 6, maxAgi = 3;

        strength = 5; defense = 1; agility = 1;
        attack = new MeleeAttack(this);

        strength = Attack.getAttribute(strength, maxStr);
        defense  = Attack.getAttribute(defense,  maxDef);
        agility  = Attack.getAttribute(agility,  maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Imp has : " + super.toString();
    }
}