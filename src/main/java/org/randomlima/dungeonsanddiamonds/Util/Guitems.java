package org.randomlima.dungeonsanddiamonds.Util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.randomlima.dungeonsanddiamonds.Objects.Keys.GuitemKeys;

import java.util.Arrays;
import java.util.List;

public class Guitems {
    public ItemStack barbarian = quickClassItem(Material.IRON_AXE,true,"Barbarian", Arrays.asList("A Fierce Warrior of Primal Rage",
            "Barbarians are mighty warriors who are",
            "powered by primal forces of the multiverse",
            "that manifest as a Rage"));
    public ItemStack bard = quickClassItem(Material.GOAT_HORN,true,"Bard", Arrays.asList("An Inspiring Performer of Music, Dance, and Magic",
            "Bards are expert at inspiring others,",
            "soothing hurts, disheartening foes, and",
            "creating illusions"));
    public ItemStack cleric = quickClassItem(Material.POTION,true,"Cleric", Arrays.asList("A miraculous Priest of Divine Power",
            "Clerics can reach out to the divine magic",
            "of the Outer Planes and channel it to",
            "bolster people and battle foes."));
    public ItemStack druid = quickClassItem(Material.OAK_SAPLING,true,"Druid", Arrays.asList("A Nature Priest of Primal Power",
            "Druids call on the forces of nature,",
            "harnessing magic to heal, transform",
            "into animals, and wield elemental",
            "destruction."));
    public ItemStack fighter = quickClassItem(Material.DIAMOND_SWORD,true,"Fighter", Arrays.asList("A Master of All Arms and Armor",
            "Fighters all share an unparalleled",
            "prowess with weapons and armor, and",
            "are well acquainted with death, both",
            "meting it out and defying it."));
    public ItemStack monk = quickClassItem(Material.LEATHER_CHESTPLATE,true,"Monk", Arrays.asList("A Martial Artist of Supernatural Focus",
            "Fighters all share an unparalleled prowess",
            "with weapons and armor, and are well",
            "acquainted with death, both meting it out",
            "and defying it."));
    public ItemStack paladin = quickClassItem(Material.TRIDENT,true,"Paladin", Arrays.asList("A Devout Warrior of Sacred Oaths",
            "Paladins live on the front lines of the",
            "cosmic struggle, united by their oaths",
            "against the forces of annihilation."));
    public ItemStack ranger = quickClassItem(Material.BOW,true,"Ranger", Arrays.asList("A Wandering Warrior Imbued with Primal Magic",
            "Rangers are honed with deadly focus and",
            "harness primal powers to protect the world",
            "from the ravages of monsters and tyrants."));
    public ItemStack rogue = quickClassItem(Material.IRON_SWORD,true,"Rogue", Arrays.asList("A Dexterous Expert in Stealth and Subterfuge",
            "Rogues have a knack for finding the solution",
            "to just about any problem, prioritizing subtle",
            "strikes over brute strength."));
    public ItemStack sorcerer = quickClassItem(Material.END_CRYSTAL,true,"Sorcerer", Arrays.asList("A Dazzling Mage Filled with Innate Magic",
            "Sorcerers harness and channel the raw, roiling",
            "power of innate magic that is stamped into",
            "their very being."));
    public ItemStack warlock = quickClassItem(Material.WRITTEN_BOOK,true,"Warlock", Arrays.asList("An Occultist Empowered by Otherworldly Pacts",
            "Warlocks quest for knowledge that lies hidden",
            "in the fabric of the multiverse, piecing",
            "together arcane secrets to bolster their",
            "own power."));
    public ItemStack wizard = quickClassItem(Material.DEAD_BUSH,true,"Wizard", Arrays.asList("A Scholarly Magic-User of Arcane Power",
            "Wizards cast spells of explosive fire, arcing",
            "lightning, subtle deception, and spectacular",
            "transformations."));
    public ItemStack artificer = quickClassItem(Material.SPLASH_POTION,true,"Artificer", Arrays.asList("xyz",
            "Masters of invention, artificers use",
            "ingenuity and magic to unlock extraordinary",
            "capabilities in objects."));
    public ItemStack bloodhunter = quickClassItem(Material.REDSTONE,true,"Blood Hunter", Arrays.asList("xyz",
            "Willing to suffer whatever it takes to achieve",
            "victory, these adept warriors have forged",
            "themselves into a potent force dedicated to",
            "protecting the innocent."));

    public ItemStack quickClassItem(Material material, boolean enchGlint, String name, List<String> lore){
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        meta.getPersistentDataContainer().set(GuitemKeys.classButton, PersistentDataType.STRING, name);
        if(enchGlint)meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        meta.addItemFlags(ItemFlag.HIDE_ITEM_SPECIFICS);
        item.setItemMeta(meta);
        return item;
    }
    public ItemStack dwarf = quickSpeciesItem(Material.COBBLESTONE, true, "Dwarf", Arrays.asList("xyz", "abc"));
    public ItemStack elf = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack halfling = quickSpeciesItem(Material.LEATHER_LEGGINGS, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack human = quickSpeciesItem(Material.PLAYER_HEAD, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack aasimar = quickSpeciesItem(Material.REDSTONE_LAMP, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack dragonborn = quickSpeciesItem(Material.ELYTRA, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack gnome = quickSpeciesItem(Material.SMITHING_TABLE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack goliath = quickSpeciesItem(Material.ZOMBIE_HEAD, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack orc = quickSpeciesItem(Material.GOLDEN_AXE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack tiefling = quickSpeciesItem(Material.HONEY_BOTTLE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack aarakocra = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack airgenasi = quickSpeciesItem(Material.PEARLESCENT_FROGLIGHT, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack bugbear = quickSpeciesItem(Material.LEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack centuar = quickSpeciesItem(Material.SADDLE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack changeling = quickSpeciesItem(Material.COD_SPAWN_EGG, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack deepgnome = quickSpeciesItem(Material.SMITHING_TABLE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack duergar = quickSpeciesItem(Material.DEEPSLATE_BRICKS, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack earthgenasi = quickSpeciesItem(Material.DIRT, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack eladrin = quickSpeciesItem(Material.BOW, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack fairy = quickSpeciesItem(Material.EXPERIENCE_BOTTLE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack firbolg = quickSpeciesItem(Material.DARK_OAK_LEAVES, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack firegenasi = quickSpeciesItem(Material.FLINT_AND_STEEL, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack githyanki = quickSpeciesItem(Material.IRON_SWORD, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack githzerai = quickSpeciesItem(Material.END_CRYSTAL, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack goblin = quickSpeciesItem(Material.GOLD_BLOCK, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack harengon = quickSpeciesItem(Material.RABBIT_FOOT, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack hobgoblin = quickSpeciesItem(Material.GOLD_NUGGET, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack kenku = quickSpeciesItem(Material.BLACK_DYE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack kobold = quickSpeciesItem(Material.ELYTRA, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack lizardfolk = quickSpeciesItem(Material.SCUTE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack minotaur = quickSpeciesItem(Material.GOAT_HORN, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack satyr = quickSpeciesItem(Material.GOAT_HORN, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack seaelf = quickSpeciesItem(Material.HEART_OF_THE_SEA, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack shadarkai = quickSpeciesItem(Material.BLACK_CANDLE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack shifter = quickSpeciesItem(Material.COBBLESTONE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack tabaxi = quickSpeciesItem(Material.OCELOT_SPAWN_EGG, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack tortle = quickSpeciesItem(Material.TURTLE_HELMET, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack triton = quickSpeciesItem(Material.TRIDENT, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack watergenasi = quickSpeciesItem(Material.WATER_BUCKET, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack yuanti = quickSpeciesItem(Material.LINGERING_POTION, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack kender = quickSpeciesItem(Material.SPYGLASS, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack astralelf = quickSpeciesItem(Material.GLASS_BOTTLE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack autognome = quickSpeciesItem(Material.LEVER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack giff = quickSpeciesItem(Material.COW_SPAWN_EGG, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack hadozee = quickSpeciesItem(Material.RABBIT_FOOT, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack plasmoid = quickSpeciesItem(Material.END_GATEWAY, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack thrikreen = quickSpeciesItem(Material.BEE_NEST, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack owlin = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack leonin = quickSpeciesItem(Material.IRON_NUGGET, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack kalashtar = quickSpeciesItem(Material.WHITE_DYE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack warforged = quickSpeciesItem(Material.IRON_BLOCK, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack verdan = quickSpeciesItem(Material.GOLD_INGOT, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack loxodon = quickSpeciesItem(Material.ELDER_GUARDIAN_SPAWN_EGG, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack simichybrid = quickSpeciesItem(Material.END_CRYSTAL, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack vedalken = quickSpeciesItem(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack feraltiefling = quickSpeciesItem(Material.LAVA_BUCKET, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack locathah = quickSpeciesItem(Material.COD, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack grung = quickSpeciesItem(Material.FROGSPAWN, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack gith = quickSpeciesItem(Material.IRON_AXE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack yuantipureblood = quickSpeciesItem(Material.LINGERING_POTION, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack erina = quickSpeciesItem(Material.PRISMARINE_SHARD, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack bearfolk = quickSpeciesItem(Material.IRON_INGOT, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack darakhul = quickSpeciesItem(Material.BLACK_CONCRETE_POWDER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack quickstep = quickSpeciesItem(Material.END_ROD, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack ravenfolk = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack ratatosk = quickSpeciesItem(Material.FOX_SPAWN_EGG, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack satarre = quickSpeciesItem(Material.LINGERING_POTION, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack shade = quickSpeciesItem(Material.DIAMOND_SHOVEL, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack shadowgoblin = quickSpeciesItem(Material.GOLDEN_PICKAXE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack umbralhuman = quickSpeciesItem(Material.BLACK_SHULKER_BOX, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack thedisembodied = quickSpeciesItem(Material.END_PORTAL, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack wechselkind = quickSpeciesItem(Material.OAK_WOOD, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack cervan = quickSpeciesItem(Material.LEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack corvum = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack gallus = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack hedge = quickSpeciesItem(Material.PRISMARINE_SHARD, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack jerbeen = quickSpeciesItem(Material.RABBIT_HIDE, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack luma = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack mapach = quickSpeciesItem(Material.RABBIT_FOOT, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack raptor = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack stig = quickSpeciesItem(Material.FEATHER, true, "Dwarf",Arrays.asList("xyz", "abc"));
    public ItemStack vulpin = quickSpeciesItem(Material.FOX_SPAWN_EGG, true, "Dwarf",Arrays.asList("xyz", "abc"));



    public ItemStack quickSpeciesItem(Material material, boolean enchGlint, String name, List<String> lore){
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        meta.getPersistentDataContainer().set(GuitemKeys.classButton, PersistentDataType.STRING, name);
        if(enchGlint)meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        meta.addItemFlags(ItemFlag.HIDE_ITEM_SPECIFICS);
        item.setItemMeta(meta);
        return item;
    }
}
