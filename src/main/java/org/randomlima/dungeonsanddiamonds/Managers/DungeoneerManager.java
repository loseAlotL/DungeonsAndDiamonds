package org.randomlima.dungeonsanddiamonds.Managers;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.entity.Player;
import org.randomlima.dungeonsanddiamonds.Objects.Dungeoneer;

public class DungeoneerManager {
    private static Map<Player, Dungeoneer> dungeoneers = new HashMap<>();

    public static void addDungeoneer(Player player, Dungeoneer dungeoneer) {
        dungeoneers.put(player, dungeoneer);
    }

    public static Dungeoneer getDungeoneer(Player player) {
        return dungeoneers.get(player);
    }

    public static boolean isDungeoneer(Player player) {
        return dungeoneers.containsKey(player);
    }
}

