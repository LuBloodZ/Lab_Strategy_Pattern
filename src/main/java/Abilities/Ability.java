package Abilities;

/**
 * Name: Lichen Cao
 * Date: 11/18/2025
 * Explanation: CST 338: Software Design
 */
public interface Ability {
    default String name() { return getClass().getSimpleName(); }
}