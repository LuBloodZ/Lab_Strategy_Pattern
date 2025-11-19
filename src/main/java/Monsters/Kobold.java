package Monsters;

import Abilities.Attack;
import Abilities.RangedAttack;
import java.util.HashMap;
/**
 * Name: Lichen Cao
 * Date: 11/18/2025
 * Explanation: CST 338: Software Design
 */
public class Kobold extends Monster {

    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP, xp, items);

        Integer maxStr = 10, maxDef = 5, maxAgi = 12;

        strength = 3; defense = 1; agility = 5;
        attack = new RangedAttack(this);

        strength = Attack.getAttribute(strength, maxStr);
        defense  = Attack.getAttribute(defense,  maxDef);
        agility  = Attack.getAttribute(agility,  maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " + super.toString();
    }
}