import Monsters.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * Name: Lichen Cao
 * Date: 11/18/2025
 * Explanation: CST 338: Software Design
 */;
public class Driver {

    public static void main(String[] args) {

        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);

        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(10, 10, items));

        for (Monster m : monsters) {
            m.setHp(m.getHp());
            m.setMaxHP(m.getMaxHP());
            m.setXp(m.getXp());
            m.setItems(m.getItems());
        }

        for (Monster m : monsters) {
            System.out.println(m);
        }

        System.out.println("\nCombat Begins:\n");

        Monster a = monsters.get(0);
        Monster b = monsters.get(1);

        while (a.getHp() > 0 && b.getHp() > 0) {
            Integer dmgA = a.attackTarget(b);
            System.out.println("Damage dealt by A: " + dmgA);
            if (b.getHp() <= 0) break;

            Integer dmgB = b.attackTarget(a);
            System.out.println("Damage dealt by B: " + dmgB);
        }

        if (args.length == 0) {
            System.out.println("Program ran with no args.");
        }
    }
}