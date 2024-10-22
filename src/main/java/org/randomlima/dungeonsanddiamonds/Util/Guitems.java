package org.randomlima.dungeonsanddiamonds.Util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Guitems {
    public ItemStack barbarian = quickItem(Material.IRON_AXE,1,true,"Barbarian", null);
    public ItemStack bard = quickItem(Material.GOAT_HORN,1,true,"Bard", null);
    public ItemStack cleric = quickItem(Material.POTION,1,true,"Cleric", null);
    public ItemStack druid = quickItem(Material.OAK_SAPLING,1,true,"Druid", null);
    public ItemStack fighter = quickItem(Material.DIAMOND_SWORD,1,true,"Fighter", null);
    public ItemStack monk = quickItem(Material.LEATHER_CHESTPLATE,1,true,"Monk", null);
    public ItemStack paladin = quickItem(Material.TRIDENT,1,true,"Paladin", null);
    public ItemStack ranger = quickItem(Material.BOW,1,true,"Ranger", null);
    public ItemStack rogue = quickItem(Material.IRON_SWORD,1,true,"Rogue", null);
    public ItemStack sorcerer = quickItem(Material.END_CRYSTAL,1,true,"Sorcerer", null);
    public ItemStack warlock = quickItem(Material.WRITTEN_BOOK,1,true,"Warlock", null);
    public ItemStack wizard = quickItem(Material.DEAD_BUSH,1,true,"Wizard", null);
    public ItemStack artificer = quickItem(Material.SPLASH_POTION,1,true,"Artificer", null);
    public ItemStack bloodhunter = quickItem(Material.REDSTONE,1,true,"Blood Hunter", null);

    public ItemStack quickItem(Material material, int count, boolean enchGlint, String name, List<String> lore){
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        if(enchGlint)meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        meta.addItemFlags(ItemFlag.HIDE_ITEM_SPECIFICS);
        item.setItemMeta(meta);
        return item;
    }
}
