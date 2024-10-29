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
import java.util.HashMap;
import java.util.Map;


public class CharacterBuilder implements Listener {
    ArrayList<Inventory> classGuis = new ArrayList<>();
    Guitems guitems = new Guitems();
    String selected = "";
    private final Map<Player, Integer> playerPages = new HashMap<>();

    public boolean sameContents(Inventory inventory1, Inventory inventory2){
        return(Arrays.equals(inventory1.getContents(), inventory2.getContents()));
    }
    public void nextPage(Player player, int pageChange) {
        int currentPage = playerPages.getOrDefault(player, 1); // Default to page 1
        int newPage = currentPage + pageChange;

        // Ensure the new page number is within valid bounds
        if (newPage < 1 || newPage > 5) { // Adjust the max page number as needed
            return;
        }

        // Update the player's current page
        playerPages.put(player, newPage);

        // Open the appropriate inventory page
        switch (newPage) {
            case 1 -> player.openInventory(speciesPage1(player));
            case 2 -> player.openInventory(speciesPage2(player));
            case 3 -> player.openInventory(speciesPage3(player));
        }
    }
    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        Inventory clicked = event.getInventory();
        ItemStack item = event.getCurrentItem();
        if(item == null)return;
        if(!item.getItemMeta().getPersistentDataContainer().has(GuitemKeys.guiButton))return;
        if(sameContents(clicked, classGui(player))){
            if(item.getItemMeta().getDisplayName().equals(selected)){
                player.sendMessage("Selected: "+item.getItemMeta().getDisplayName());
                player.openInventory(speciesPage1(player));
            }else{
                player.sendMessage("Click again to confirm selecting: "+item.getItemMeta().getDisplayName());
                selected = item.getItemMeta().getDisplayName();
            }
            event.setCancelled(true);
        }


        if(sameContents(clicked, speciesPage1(player)) || sameContents(clicked, speciesPage2(player)) || sameContents(clicked, speciesPage3(player))){
            System.out.println("hi");
            if(item.getItemMeta().getPersistentDataContainer().has(GuitemKeys.navButton)){
                System.out.println("nav button click");
                switch (item.getItemMeta().getDisplayName()){
                    case "Page 1":
                        System.out.println("Page 1");
                        player.openInventory(speciesPage1(player));
                        break;
                    case "Page 2":
                        System.out.println("Page 2");
                        player.openInventory(speciesPage2(player));
                        break;
                    case "Page 3":
                        System.out.println("Page 3");
                        player.openInventory(speciesPage3(player));
                        break;
                }
            }
            if(!item.getItemMeta().getPersistentDataContainer().has(GuitemKeys.navButton)){
                if(item.getItemMeta().getDisplayName().equals(selected)){
                    player.sendMessage("Selected: "+item.getItemMeta().getDisplayName());
                    player.closeInventory();
                }else{
                    player.sendMessage("Click again to confirm selecting: "+item.getItemMeta().getDisplayName());
                    selected = item.getItemMeta().getDisplayName();
                }
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
    public Inventory speciesPage1(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Colorize.format("&6Choose your race"));
        inventory.setItem(0, guitems.dwarf);
        inventory.setItem(1, guitems.elf);
        inventory.setItem(2, guitems.halfling);
        inventory.setItem(3, guitems.human);
        inventory.setItem(4, guitems.aasimar);
        inventory.setItem(5, guitems.dragonborn);
        inventory.setItem(6, guitems.gnome);
        inventory.setItem(7, guitems.goliath);
        inventory.setItem(8, guitems.orc);
        inventory.setItem(9, guitems.tiefling);
        inventory.setItem(10, guitems.aarakocra);
        inventory.setItem(11, guitems.airgenasi);
        inventory.setItem(12, guitems.bugbear);
        inventory.setItem(13, guitems.centuar);
        inventory.setItem(14, guitems.changeling);
        inventory.setItem(15, guitems.deepgnome);
        inventory.setItem(16, guitems.duergar);
        inventory.setItem(17, guitems.earthgenasi);
        inventory.setItem(18, guitems.eladrin);
        inventory.setItem(19, guitems.fairy);
        inventory.setItem(20, guitems.firbolg);
        inventory.setItem(21, guitems.firegenasi);
        inventory.setItem(22, guitems.githyanki);
        inventory.setItem(23, guitems.githzerai);
        inventory.setItem(24, guitems.goblin);
        inventory.setItem(25, guitems.harengon);
        inventory.setItem(26, guitems.hobgoblin);
        inventory.setItem(27, guitems.kenku);
        inventory.setItem(28, guitems.kobold);
        inventory.setItem(29, guitems.lizardfolk);
        inventory.setItem(30, guitems.minotaur);
        inventory.setItem(31, guitems.satyr);
        inventory.setItem(32, guitems.seaelf);
        inventory.setItem(33, guitems.shadarkai);
        inventory.setItem(34, guitems.shifter);
        inventory.setItem(35, guitems.tabaxi);
        inventory.setItem(36, guitems.tortle);
        inventory.setItem(37, guitems.triton);
        inventory.setItem(38, guitems.watergenasi);
        inventory.setItem(39, guitems.yuanti);
        inventory.setItem(40, guitems.kender);
        inventory.setItem(41, guitems.astralelf);
        inventory.setItem(42, guitems.autognome);
        inventory.setItem(43, guitems.giff);
        inventory.setItem(44, guitems.hadozee);

        inventory.setItem(48, guitems.page1);
        inventory.setItem(49, guitems.page2);
        inventory.setItem(50, guitems.page3);
        return inventory;
    }

    public Inventory speciesPage2(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Colorize.format("&6Choose your race"));
        inventory.setItem(0, guitems.plasmoid);
        inventory.setItem(1, guitems.thrikreen);
        inventory.setItem(2, guitems.owlin);
        inventory.setItem(3, guitems.leonin);
        inventory.setItem(4, guitems.kalashtar);
        inventory.setItem(5, guitems.verdan);
        inventory.setItem(6, guitems.loxodon);
        inventory.setItem(7, guitems.simichybrid);
        inventory.setItem(8, guitems.vedalken);
        inventory.setItem(9, guitems.feraltiefling);
        inventory.setItem(10, guitems.locathah);
        inventory.setItem(11, guitems.grung);
        inventory.setItem(12, guitems.gith);
        inventory.setItem(13, guitems.aasimar);
        inventory.setItem(14, guitems.bugbear);
        inventory.setItem(15, guitems.firbolg);
        inventory.setItem(16, guitems.goblin);
        inventory.setItem(17, guitems.hobgoblin);
        inventory.setItem(18, guitems.kenku);
        inventory.setItem(19, guitems.kobold);
        inventory.setItem(20, guitems.lizardfolk);
        inventory.setItem(21, guitems.orc);
        inventory.setItem(22, guitems.tabaxi);
        inventory.setItem(23, guitems.triton);
        inventory.setItem(24, guitems.yuantipureblood);
        inventory.setItem(25, guitems.aarakocra);
        inventory.setItem(26, guitems.genasi);
        inventory.setItem(27, guitems.goliath);
        inventory.setItem(28, guitems.dragonborn);
        inventory.setItem(29, guitems.dwarf);
        inventory.setItem(30, guitems.elf);
        inventory.setItem(31, guitems.gnome);
        inventory.setItem(32, guitems.halfelf);
        inventory.setItem(33, guitems.halfling);
        inventory.setItem(34, guitems.halforc);
        inventory.setItem(35, guitems.human);
        inventory.setItem(36, guitems.tiefling);
        inventory.setItem(37, guitems.bearfolk);
        inventory.setItem(38, guitems.darakhul);
        inventory.setItem(39, guitems.erina);
        inventory.setItem(40, guitems.quickstep);
        inventory.setItem(41, guitems.ratatosk);
        inventory.setItem(42, guitems.ravenfolk);
        inventory.setItem(43, guitems.satarre);
        inventory.setItem(44, guitems.shade);

        inventory.setItem(48, guitems.page1);
        inventory.setItem(49, guitems.page2);
        inventory.setItem(50, guitems.page3);
        return inventory;
    }

    public Inventory speciesPage3(Player player) {
        Inventory inventory = Bukkit.createInventory(player, 54, Colorize.format("&6Choose your race"));
        inventory.setItem(0, guitems.shadowgoblin);
        inventory.setItem(1, guitems.umbralhuman);
        inventory.setItem(2, guitems.thedisembodied);
        inventory.setItem(3, guitems.wechselkind);
        inventory.setItem(4, guitems.cervan);
        inventory.setItem(5, guitems.corvum);
        inventory.setItem(6, guitems.gallus);
        inventory.setItem(7, guitems.hedge);
        inventory.setItem(8, guitems.jerbeen);
        inventory.setItem(9, guitems.luma);
        inventory.setItem(10, guitems.mapach);
        inventory.setItem(11, guitems.raptor);
        inventory.setItem(12, guitems.strig);
        inventory.setItem(13, guitems.vulpin);
        inventory.setItem(14, guitems.stig);

        inventory.setItem(48, guitems.page1);
        inventory.setItem(49, guitems.page2);
        inventory.setItem(50, guitems.page3);
        // Additional items as needed up to slot 44
        return inventory;
    }
}
