package org.randomlima.dungeonsanddiamonds.Managers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.randomlima.dungeonsanddiamonds.Util.Guitems;

import java.util.ArrayList;


public class CharacterBuilder implements Listener {
    ArrayList<Inventory> classGuis = new ArrayList<>();
    Guitems guitems = new Guitems();
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Inventory currentInventory = event.getClickedInventory();
        if(classGuis.contains(currentInventory)){
            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();

        }
    }
    public Inventory classGui(Player player){
        Inventory inventory = Bukkit.createInventory(player, 18, "Choose your class");
        inventory.setItem(1, guitems.barbarian);
        inventory.setItem(2, guitems.bard);
        inventory.setItem(3, guitems.cleric);
        inventory.setItem(4, guitems.druid);
        inventory.setItem(5, guitems.fighter);
        inventory.setItem(6, guitems.monk);
        inventory.setItem(7, guitems.paladin);
        inventory.setItem(10, guitems.ranger);
        inventory.setItem(11, guitems.rogue);
        inventory.setItem(12, guitems.sorcerer);
        inventory.setItem(13, guitems.warlock);
        inventory.setItem(14, guitems.wizard);
        inventory.setItem(15, guitems.artificer);
        inventory.setItem(16, guitems.bloodhunter);
        classGuis.add(inventory);
        return inventory;
    }
}
