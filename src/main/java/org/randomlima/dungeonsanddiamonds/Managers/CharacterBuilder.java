package org.randomlima.dungeonsanddiamonds.Managers;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.randomlima.dungeonsanddiamonds.Objects.Keys.GuitemKeys;
import org.randomlima.dungeonsanddiamonds.Util.Colorize;
import org.randomlima.dungeonsanddiamonds.Util.Guitems;

import java.util.ArrayList;
import java.util.Arrays;


public class CharacterBuilder implements Listener {
    ArrayList<Inventory> classGuis = new ArrayList<>();
    Guitems guitems = new Guitems();
    String selected = "";

    public boolean sameContents(Inventory inventory1, Inventory inventory2){
        return(Arrays.equals(inventory1.getContents(), inventory2.getContents()));
    }
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        Inventory clicked = event.getInventory();
        ItemStack item = event.getCurrentItem();
        if(item == null)return;
        if(!item.getItemMeta().getPersistentDataContainer().has(GuitemKeys.classButton))return;
        if(sameContents(clicked, classGui(player))){
            if(item.getItemMeta().getDisplayName().equals(selected)){
                player.sendMessage("Selected: "+item.getItemMeta().getDisplayName());
                player.closeInventory();
            }else{
                player.sendMessage("Click again to confirm selecting: "+item.getItemMeta().getDisplayName());
                selected = item.getItemMeta().getDisplayName();
            }
            event.setCancelled(true);
        }
    }
    public Inventory classGui(Player player){
        Inventory inventory = Bukkit.createInventory(player, 18, Colorize.format("&6Choose your class"));
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
        return inventory;
    }
}
