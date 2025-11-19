package Abilities;

import Monsters.Monster;
import java.util.Random;

/**
 * Name: Lichen Cao
 * Date: 11/18/2025
 * Explanation: CST 338: Software Design
 */
public interface Attack extends Ability {


    Integer attack(Monster target);


    static Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if (min == null || max == null) throw new IllegalArgumentException("min/max cannot be null");
        if (min > max) { Integer t = min; min = max; max = t; }
        return rand.nextInt(max - min + 1) + min;
    }
}