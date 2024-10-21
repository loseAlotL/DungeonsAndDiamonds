package org.randomlima.dungeonsanddiamonds.Listener;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.randomlima.dungeonsanddiamonds.Managers.DungeoneerManager;
import org.randomlima.dungeonsanddiamonds.Objects.Dungeoneer;

import java.util.Arrays;

public class DungeoneerClickListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEntityEvent event) {
        if (event.getRightClicked() instanceof Player) {
            Player clickedPlayer = (Player) event.getRightClicked();
            Player clickingPlayer = event.getPlayer();

            Dungeoneer dungeoneer = getDungeoneer(clickedPlayer);

            if (dungeoneer != null) {
                openDungeoneerGUI(clickingPlayer, dungeoneer);
            }
        }
    }

    private Dungeoneer getDungeoneer(Player player) {
        return DungeoneerManager.getDungeoneer(player);
    }

    private void openDungeoneerGUI(Player player, Dungeoneer dungeoneer) {
        Inventory gui = Bukkit.createInventory(null, 27, dungeoneer.getName() + "'s Stats");

        gui.setItem(11, createStatItem(Material.IRON_SWORD, "Strength", dungeoneer.getStrength()));
        gui.setItem(12, createStatItem(Material.LEATHER_BOOTS, "Dexterity", dungeoneer.getDexterity()));
        gui.setItem(13, createStatItem(Material.ENCHANTED_BOOK, "Intelligence", dungeoneer.getIntelligence()));
        gui.setItem(14, createStatItem(Material.POTION, "Wisdom", dungeoneer.getWisdom()));
        gui.setItem(15, createStatItem(Material.ENDER_EYE, "Charisma", dungeoneer.getCharisma()));

        player.openInventory(gui);
    }

    private ItemStack createStatItem(Material material, String statName, int statValue) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(statName);
        meta.setLore(Arrays.asList("Value: " + statValue));
        item.setItemMeta(meta);
        return item;
    }
}
