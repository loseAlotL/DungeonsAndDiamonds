package org.randomlima.dungeonsanddiamonds.Util;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.randomlima.dungeonsanddiamonds.DungeonsAndDiamonds;

import java.util.ArrayList;
import java.util.List;

public class DiceStuff {
    public DungeonsAndDiamonds plugin;
    public DiceStuff(DungeonsAndDiamonds dungeonsAndDiamonds){
        this.plugin = dungeonsAndDiamonds;
    }
    public ArrayList<Integer> rollDie(int sides, int rolls) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < rolls; i++) {
            int randInt = (int)(Math.random() * sides) + 1;
            numbers.add(randInt);
        }
        return numbers;
    }

    public void tellDieRolls(Player roller, int sides, int rolls){
        List<Integer> dieRolls = rollDie(sides, rolls);
        int maxDelay = 100;

        for (int i = 0; i < dieRolls.size(); i++) {
            int rollResult = dieRolls.get(i);

            int delay = (int) (Math.pow((double) i / rolls, 2) * maxDelay);

            Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
                @Override
                public void run() {
                    for (Player player : roller.getServer().getOnlinePlayers()) {
                        String color;
                        if(rollResult > (sides/2)){
                            color = "&a";
                        } else{
                            color = "&c";
                        }
                        if(rollResult == 1) color = "&4";
                        if(rollResult == sides) color = "&2";

                        player.sendTitle(Colorize.format(color+rollResult), roller.getName()+" rolled a d" + sides, 1, 60, 10);
                        player.playSound(player, Sound.ENTITY_EXPERIENCE_ORB_PICKUP,1,1);
                    }
                }
            }, delay);
        }
    }
}
