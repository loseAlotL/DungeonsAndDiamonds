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
        meta.getPersistentDataContainer().set(GuitemKeys.guiButton, PersistentDataType.STRING, name);
        meta.getPersistentDataContainer().set(GuitemKeys.classButton, PersistentDataType.STRING, name);
        if(enchGlint)meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        meta.addItemFlags(ItemFlag.HIDE_ITEM_SPECIFICS);
        item.setItemMeta(meta);
        return item;
    }
    public ItemStack dwarf = quickSpeciesItem(Material.COBBLESTONE, true, "Dwarf", Arrays.asList(
                    Colorize.format("&7Dwarves were raised from the"),
                    Colorize.format("&7earth in the elder days by a"),
                    Colorize.format("&7deity of the forge."),
                    Colorize.format(""),
                    Colorize.format("&f&lDwarf Traits"),
                    Colorize.format("&7Darkvision, &7Dwarven"),
                    Colorize.format("&7Resilience, &7Dwarven Toughness,"),
                    Colorize.format("&7Stonecunning")
            )

    );
    public ItemStack elf = quickSpeciesItem(Material.FEATHER, true, "Elf",Arrays.asList(
                    Colorize.format("&7The elves’ curiosity led many"),
                    Colorize.format("&7of them to explore other planes"),
                    Colorize.format("&7of existence."),
                    Colorize.format(""),
                    Colorize.format("&f&lElf Traits"),
                    Colorize.format("&7Darkvision, &7Elven Lineage,"),
                    Colorize.format("&7Fey Ancestry, &7Keen Senses,"),
                    Colorize.format("&7Trance")
            )

    );
    public ItemStack halfling = quickSpeciesItem(Material.LEATHER_LEGGINGS, true, "Halfling",Arrays.asList(
                    Colorize.format("&7Halflings possess a brave and"),
                    Colorize.format("&7adventurous spirit that leads"),
                    Colorize.format("&7them on journeys of discovery."),
                    Colorize.format(""),
                    Colorize.format("&f&lHalfling Traits"),
                    Colorize.format("&7Brave, &7Halfling Nimbleness,"),
                    Colorize.format("&7Luck, &7Naturally Stealthy")
            )

    );
    public ItemStack human = quickSpeciesItem(Material.PLAYER_HEAD, true, "Human",Arrays.asList(
                    Colorize.format("&7Found throughout the multiverse,"),
                    Colorize.format("&7humans are as varied as they are"),
                    Colorize.format("&7numerous."),
                    Colorize.format(""),
                    Colorize.format("&f&lHuman Traits"),
                    Colorize.format("&7Resourceful, &7Skillful,"),
                    Colorize.format("&7Versatile")
            )


    );
    public ItemStack aasimar = quickSpeciesItem(Material.REDSTONE_LAMP, true, "Aasimar",Arrays.asList(
                    Colorize.format("&7Aasimar are mortals who carry a"),
                    Colorize.format("&7spark of the Upper Plains within"),
                    Colorize.format("&7their souls."),
                    Colorize.format(""),
                    Colorize.format("&f&lAasimar Traits"),
                    Colorize.format("&7Celestial Resistance, &7Darkvision,"),
                    Colorize.format("&7Healing Hands, &7Light Bearer,"),
                    Colorize.format("&7Celestial Revelation")
            )

    );
    public ItemStack dragonborn = quickSpeciesItem(Material.ELYTRA, true, "Dragon Born",Arrays.asList(
                    Colorize.format("&7The ancestors of dragonborn"),
                    Colorize.format("&7hatched from the eggs of"),
                    Colorize.format("&7chromatic and metallic dragons."),
                    Colorize.format(""),
                    Colorize.format("&f&lDragonborn Traits"),
                    Colorize.format("&7Dragon Ancestry, &7Breath Weapon,"),
                    Colorize.format("&7Damage Resistance, &7Darkvision,"),
                    Colorize.format("&7Draconic Flight")
            )

    );
    public ItemStack gnome = quickSpeciesItem(Material.SMITHING_TABLE, true, "Gnome",Arrays.asList(
                    Colorize.format("&7Gnomes are magical folk created"),
                    Colorize.format("&7by gods of invention, illusions,") ,
                    Colorize.format("&7and life underground."),
                    Colorize.format(""),
                    Colorize.format("&f&lGnome Traits"),
                    Colorize.format("&7Darkvision, &7Gnomish Cunning,"),
                    Colorize.format("&7Gnomish Lineage")
            )
    );
    public ItemStack goliath = quickSpeciesItem(Material.ZOMBIE_HEAD, true, "Goliath",Arrays.asList(
                    Colorize.format("&7Goliaths are distant descendants"),
                    Colorize.format("&7of giants and seek heights above"),
                    Colorize.format("&7those reached by their ancestors."),
                    Colorize.format(""),
                    Colorize.format("&f&lGoliath Traits"),
                    Colorize.format("&7Giant Ancestry, &7Large Form,"),
                    Colorize.format("&7Powerful Build")
            )

    );
    public ItemStack orc = quickSpeciesItem(Material.GOLDEN_AXE, true, "Orc",Arrays.asList(
                    Colorize.format("&7Orc are equipped with gifts to help them"),
                    Colorize.format("&7wander the great plains, vast caverns,"),
                    Colorize.format("&7and churning seas."),
                    Colorize.format(""),
                    Colorize.format("&f&lOrc Traits"),
                    Colorize.format("&7Adrenaline Rush, Darkvision, Relentless"),
                    Colorize.format("&7Endurance")
            )
    );
    public ItemStack tiefling = quickSpeciesItem(Material.HONEY_BOTTLE, true, "Tiefling",Arrays.asList(
                    Colorize.format("&7Tieflings are either born in the"),
                    Colorize.format("&7Lower Planes or have fiendish ancestors"),
                    Colorize.format("&7who originated there."),
                    Colorize.format(""),
                    Colorize.format("&f&lTiefling Traits"),
                    Colorize.format("&7Darkvision, &7Fiendish Legacy,"),
                    Colorize.format("&7Otherworly Presence")
            )
    );
    public ItemStack aarakocra = quickSpeciesItem(Material.FEATHER, true, "Aarakocra",Arrays.asList(
                    Colorize.format("&7A winged people who"),
                    Colorize.format("&7originated on the Elemental"),
                    Colorize.format("&7Plane of Air, aarakocra soar"),
                    Colorize.format("&7through the sky wherever they"),
                    Colorize.format("&7wander."),
                    Colorize.format(""),
                    Colorize.format("&f&lRacial Traits"),
                    Colorize.format("&7Flight, Talons, Wind Caller")
            )


    );
    public ItemStack airgenasi = quickSpeciesItem(Material.PEARLESCENT_FROGLIGHT, true, "Air Genasi",Arrays.asList(
                    Colorize.format("&7Embodying many of the airy"),
                    Colorize.format("&7traits of their otherworldly"),
                    Colorize.format("&7ancestors, air genasi can draw"),
                    Colorize.format("&7upon their connection to the"),
                    Colorize.format("&7winds."),
                    Colorize.format(""),
                    Colorize.format("&f&lAir Genasi Traits"),
                    Colorize.format("&7Darkvision, Unending Breath,"),
                    Colorize.format("&7Lightning Resistance, Mingle"),
                    Colorize.format("&7with the Wind")
            )
    );
    public ItemStack bugbear = quickSpeciesItem(Material.LEATHER, true, "Bugbear",Arrays.asList(
                    Colorize.format("&7Despite their formidable"),
                    Colorize.format("&7build, bugbears are quiet"),
                    Colorize.format("&7skulkers, thanks to a fey"),
                    Colorize.format("&7magic that allows them to hide"),
                    Colorize.format("&7in spaces seemingly too small"),
                    Colorize.format("&7for them."),
                    Colorize.format(""),
                    Colorize.format("&f&lBugbear Traits"),
                    Colorize.format("&7Darkvision, Fey Ancestry,"),
                    Colorize.format("&7Long-Limbed, Powerful Build,"),
                    Colorize.format("&7Sneaky, Surprise Attack")
            )
    );
    public ItemStack centuar = quickSpeciesItem(Material.SADDLE, true, "Centuar",Arrays.asList(
                    Colorize.format("&7Centaurs gallop throughout the"),
                    Colorize.format("&7multiverse and trace their"),
                    Colorize.format("&7origins to many different realms."),
                    Colorize.format(""),
                    Colorize.format("&f&lCentaur Traits"),
                    Colorize.format("&7Fey, Charge, Equine Build,"),
                    Colorize.format("&7Hooves, Natural Affinity")
            )
    );
    public ItemStack changeling = quickSpeciesItem(Material.COD_SPAWN_EGG, true, "Changeling",Arrays.asList(
                    Colorize.format("&7For some changelings, a new"),
                    Colorize.format("&7face is only a disguise. For"),
                    Colorize.format("&7other changelings, a new face"),
                    Colorize.format("&7may reveal an aspect of their"),
                    Colorize.format("&7soul."),
                    Colorize.format(""),
                    Colorize.format("&f&lChangeling Traits"),
                    Colorize.format("&7Fey, Changeling Instincts,"),
                    Colorize.format("&7Shapechanger")
            )
    );
    public ItemStack deepgnome = quickSpeciesItem(Material.SMITHING_TABLE, true, "Deepgnome",Arrays.asList(
                    Colorize.format("&7Deep gnomes, or svirfneblin,"),
                    Colorize.format("&7are natives of the Underdark"),
                    Colorize.format("&7and are suffused with that"),
                    Colorize.format("&7subterranean realm’s magic."),
                    Colorize.format(""),
                    Colorize.format("&f&lDeep Gnome Traits"),
                    Colorize.format("&7Gnome, Darkvision, Gift of"),
                    Colorize.format("&7the Svirfneblin, Gnomish Magic"),
                    Colorize.format("&7Resistance, Svirfneblin Camouflage")
            )
    );
    public ItemStack duergar = quickSpeciesItem(Material.DEEPSLATE_BRICKS, true, "Duergar",Arrays.asList(
                    Colorize.format("&7Duergar are dwarves whose"),
                    Colorize.format("&7ancestors were transformed by"),
                    Colorize.format("&7centuries living in the deepest"),
                    Colorize.format("&7places of the Underdark."),
                    Colorize.format(""),
                    Colorize.format("&f&lDuergar Traits"),
                    Colorize.format("&7Dwarf, Darkvision, Duergar"),
                    Colorize.format("&7Magic, Dwarven Resilience,"),
                    Colorize.format("&7Psionic Fortitude")
            )
    );
    public ItemStack earthgenasi = quickSpeciesItem(Material.DIRT, true, "Earth Genasi",Arrays.asList(
                    Colorize.format("&7Tracing their ancestry to dao,"),
                    Colorize.format("&7the genies of the Elemental"),
                    Colorize.format("&7Plane of Earth, earth genasi"),
                    Colorize.format("&7inherit dao’s steadfast strength"),
                    Colorize.format("&7and control over earth."),
                    Colorize.format(""),
                    Colorize.format("&f&lEarth Genasi Traits"),
                    Colorize.format("&7Darkvision, Earth Walk,"),
                    Colorize.format("&7Merge with Stone")
            )
    );
    public ItemStack eladrin = quickSpeciesItem(Material.BOW, true, "Eladrin",Arrays.asList(
                    Colorize.format("&7Eladrin are elves of the"),
                    Colorize.format("&7Feywild, a realm of perilous"),
                    Colorize.format("&7beauty and boundless magic."),
                    Colorize.format(""),
                    Colorize.format("&f&lEladrin Traits"),
                    Colorize.format("&7Elf, Darkvision, Fey Ancestry,"),
                    Colorize.format("&7Fey Step, Keen Senses, Trance")
            )
    );
    public ItemStack fairy = quickSpeciesItem(Material.EXPERIENCE_BOTTLE, true, "Fairy",Arrays.asList(
                    Colorize.format("&7Infused with the magic of the"),
                    Colorize.format("&7Feywild, most fairies look like"),
                    Colorize.format("&7Small elves with insectile wings,"),
                    Colorize.format("&7but each fairy has a special"),
                    Colorize.format("&7physical characteristic that sets"),
                    Colorize.format("&7the fairy apart."),
                    Colorize.format(""),
                    Colorize.format("&f&lFairy Traits"),
                    Colorize.format("&7Fey, Fairy Magic, Flight")
            )
    );
    public ItemStack firbolg = quickSpeciesItem(Material.DARK_OAK_LEAVES, true, "Firbolg",Arrays.asList(
                    Colorize.format("&7Distant cousins of giants, the"),
                    Colorize.format("&7first firbolgs wandered the"),
                    Colorize.format("&7primeval forests of the multiverse,"),
                    Colorize.format("&7and the magic of those forests"),
                    Colorize.format("&7entwined itself with the firbolgs’"),
                    Colorize.format("&7souls."),
                    Colorize.format(""),
                    Colorize.format("&f&lFirbolg Traits"),
                    Colorize.format("&7Firbolg Magic, Hidden Step,"),
                    Colorize.format("&7Powerful Build, Speech of Beast"),
                    Colorize.format("&7and Leaf")
            )
    );
    public ItemStack genasi = quickSpeciesItem(Material.FLINT_AND_STEEL, true, "Genasi",Arrays.asList(
                    Colorize.format("&7Genasi carry the power of the"),
                    Colorize.format("&7elemental planes of air, earth,"),
                    Colorize.format("&7fire, and water in their blood."),
                    Colorize.format(""),
                    Colorize.format("&f&lGenasi Traits"),
                    Colorize.format("&7+2 Constitution, &7Air,"),
                    Colorize.format("&7Earth, &7Fire, &7Water Subraces")
            )
    );
    public ItemStack firegenasi = quickSpeciesItem(Material.FLINT_AND_STEEL, true, "Fire Genasi",Arrays.asList(
                    Colorize.format("&7Descended from efreet, the"),
                    Colorize.format("&7genies of the Elemental Plane of"),
                    Colorize.format("&7Fire, fire genasi channel the"),
                    Colorize.format("&7flamboyant and often destructive"),
                    Colorize.format("&7nature of flame."),
                    Colorize.format(""),
                    Colorize.format("&f&lFire Genasi Traits"),
                    Colorize.format("&7Darkvision, Fire Resistance,"),
                    Colorize.format("&7Reach to the Blaze")
            )
    );
    public ItemStack halfelf = quickSpeciesItem(Material.FLINT_AND_STEEL, true, "Half-Elf",Arrays.asList(
            Colorize.format("&7Half-elves combine what some say"),
            Colorize.format("&7are the best qualities of their elf"),
            Colorize.format("&7and human parents."),
            Colorize.format(""),
            Colorize.format("&f&lHalf-Elf Traits"),
            Colorize.format("&7+2 Charisma, +1 to Two Other"),
            Colorize.format("&7Ability Scores, &7Darkvision,"),
            Colorize.format("&7Fey Ancestry, &7Skill Versatility")
    ));
    public ItemStack halforc = quickSpeciesItem(Material.FLINT_AND_STEEL, true, "Half-Orc",Arrays.asList(
                    Colorize.format("&7Some half-orcs rise to become"),
                    Colorize.format("&7proud leaders of orc communities."),
                    Colorize.format("&7Some venture into the world to"),
                    Colorize.format("&7prove their worth. Many of these"),
                    Colorize.format("&7become adventurers, achieving"),
                    Colorize.format("&7greatness for their mighty deeds."),
                    Colorize.format(""),
                    Colorize.format("&f&lHalf-Orc Traits"),
                    Colorize.format("&7+2 Strength, +1 Constitution,"),
                    Colorize.format("&7Darkvision, &7Menacing,"),
                    Colorize.format("&7Relentless")
            )
    );
    public ItemStack strig = quickSpeciesItem(Material.FEATHER, true, "Strig",Arrays.asList(
                    Colorize.format("&7Resembling owls, their thick"),
                    Colorize.format("&7feathers, solid bodies, and broad"),
                    Colorize.format("&7wings have earned them a reputation"),
                    Colorize.format("&7as the most powerful of the birdfolk"),
                    Colorize.format("&7races."),
                    Colorize.format(""),
                    Colorize.format("&f&lStrig Traits"),
                    Colorize.format("&7+2 Strength, &7Glide,"),
                    Colorize.format("&7Talons, &7Darkvision,"),
                    Colorize.format("&7Patterned Feathers")
            )
    );
    public ItemStack githyanki = quickSpeciesItem(Material.IRON_SWORD, true, "Githyanki",Arrays.asList(
                    Colorize.format("&7Githyanki complement their"),
                    Colorize.format("&7physical prowess with psionic"),
                    Colorize.format("&7might, instilled in them by mind"),
                    Colorize.format("&7flayers and cultivated over eons"),
                    Colorize.format("&7in the Astral Plane."),
                    Colorize.format(""),
                    Colorize.format("&f&lGithyanki Traits"),
                    Colorize.format("&7Astral Knowledge, Githyanki"),
                    Colorize.format("&7Psionics, Psychic Resilience")
            )
    );
    public ItemStack githzerai = quickSpeciesItem(Material.END_CRYSTAL, true, "Githzerai",Arrays.asList(
                    Colorize.format("&7Eons of cultivating their mental"),
                    Colorize.format("&7powers within the endless chaos of"),
                    Colorize.format("&7Limbo have imbued githzerai with"),
                    Colorize.format("&7the ability to shape psionic energy"),
                    Colorize.format("&7to protect themselves and probe minds."),
                    Colorize.format(""),
                    Colorize.format("&f&lGithzerai Traits"),
                    Colorize.format("&7Githzerai Psionics, Mental"),
                    Colorize.format("&7Discipline, Psychic Resilience")
            )
    );
    public ItemStack goblin = quickSpeciesItem(Material.GOLD_BLOCK, true, "Goblin",Arrays.asList(
                    Colorize.format("&7Many goblins pursue their own"),
                    Colorize.format("&7destinies, escaping the plots of"),
                    Colorize.format("&7both archfey and gods."),
                    Colorize.format(""),
                    Colorize.format("&f&lGoblin Traits"),
                    Colorize.format("&7Goblinoid, Darkvision, Fey"),
                    Colorize.format("&7Ancestry, Fury of the Small,"),
                    Colorize.format("&7Nimble Escape")
            )
    );
    public ItemStack harengon = quickSpeciesItem(Material.RABBIT_FOOT, true, "Harengon",Arrays.asList(
                    Colorize.format("&7Harengons are blessed with a"),
                    Colorize.format("&7little fey luck, and they often find"),
                    Colorize.format("&7themselves a few fortunate feet away"),
                    Colorize.format("&7from dangers during adventures."),
                    Colorize.format(""),
                    Colorize.format("&f&lHarengon Traits"),
                    Colorize.format("&7Hare-Trigger, Leporine Senses,"),
                    Colorize.format("&7Lucky Footwork, Rabbit Hop")
            )
    );
    public ItemStack hobgoblin = quickSpeciesItem(Material.GOLD_NUGGET, true, "Hobgoblin",Arrays.asList(
                    Colorize.format("&7Hobgoblins trace their origins to"),
                    Colorize.format("&7the ancient courts of the Feywild,"),
                    Colorize.format("&7where they first appeared with their"),
                    Colorize.format("&7goblin and bugbear kin."),
                    Colorize.format(""),
                    Colorize.format("&f&lHobgoblin Traits"),
                    Colorize.format("&7Goblinoid, Darkvision, Fey"),
                    Colorize.format("&7Ancestry, Fey Gift, Fortune"),
                    Colorize.format("&7from the Many")
            )
    );
    public ItemStack kenku = quickSpeciesItem(Material.BLACK_DYE, true, "Kenku",Arrays.asList(
                    Colorize.format("&7Whatever their true origin,"),
                    Colorize.format("&7kenku are most often found in the"),
                    Colorize.format("&7Shadowfell and the Material Plane,"),
                    Colorize.format("&7and they tend to have the"),
                    Colorize.format("&7coloration typical of ravens."),
                    Colorize.format(""),
                    Colorize.format("&f&lKenku Traits"),
                    Colorize.format("&7Expert Duplication, Kenku"),
                    Colorize.format("&7Recall, Mimicry")
            )
    );
    public ItemStack kobold = quickSpeciesItem(Material.ELYTRA, true, "Kobold",Arrays.asList(
                    Colorize.format("&7Some of the smallest draconic"),
                    Colorize.format("&7creatures in the multiverse, kobolds"),
                    Colorize.format("&7display their draconic ancestry in"),
                    Colorize.format("&7the glint of their scales and in"),
                    Colorize.format("&7their roars."),
                    Colorize.format(""),
                    Colorize.format("&f&lKobold Traits"),
                    Colorize.format("&7Darkvision, Draconic Cry,"),
                    Colorize.format("&7Kobold Legacy")
            )
    );
    public ItemStack lizardfolk = quickSpeciesItem(Material.SCUTE, true, "Lizardfolk",Arrays.asList(
                    Colorize.format("&7Gifted by the gods with"),
                    Colorize.format("&7remarkable physical defenses and"),
                    Colorize.format("&7a mystical connection to the"),
                    Colorize.format("&7natural world, lizardfolk can"),
                    Colorize.format("&7survive with just their wits in"),
                    Colorize.format("&7situations that would be deadly"),
                    Colorize.format("&7for other folk."),
                    Colorize.format(""),
                    Colorize.format("&f&lLizardfolk Traits"),
                    Colorize.format("&7Bite, Hold Breath,"),
                    Colorize.format("&7Hungry Jaws, Natural Armor,"),
                    Colorize.format("&7Nature’s Intuition")
            )
    );
    public ItemStack minotaur = quickSpeciesItem(Material.GOAT_HORN, true, "Minotaur",Arrays.asList(
                    Colorize.format("&7Minotaurs are barrel-chested"),
                    Colorize.format("&7humanoids with heads resembling"),
                    Colorize.format("&7those of bulls. Blessed with a"),
                    Colorize.format("&7supernaturally strong sense of"),
                    Colorize.format("&7direction, minotaurs make great"),
                    Colorize.format("&7navigators."),
                    Colorize.format(""),
                    Colorize.format("&f&lMinotaur Traits"),
                    Colorize.format("&7Horns, Goring Rush,"),
                    Colorize.format("&7Hammering Horns, Labyrinthine"),
                    Colorize.format("&7Recall")
            )
    );
    public ItemStack satyr = quickSpeciesItem(Material.GOAT_HORN, true, "Satyr",Arrays.asList(
                    Colorize.format("&7Originating in the Feywild—"),
                    Colorize.format("&7a realm of pure emotion—"),
                    Colorize.format("&7satyrs thrive on the energy"),
                    Colorize.format("&7of merriment."),
                    Colorize.format(""),
                    Colorize.format("&f&lSatyr Traits"),
                    Colorize.format("&7Fey, Ram, Magic Resistance,"),
                    Colorize.format("&7Mirthful Leaps, Reveler")
            )
    );
    public ItemStack seaelf = quickSpeciesItem(Material.HEART_OF_THE_SEA, true, "Sea Elf",Arrays.asList(
                    Colorize.format("&7Sea elves fell in love with"),
                    Colorize.format("&7the wild beauty of the ocean"),
                    Colorize.format("&7in the earliest days of the"),
                    Colorize.format("&7multiverse."),
                    Colorize.format(""),
                    Colorize.format("&f&lSea Elf Traits"),
                    Colorize.format("&7Elf, Child of the Sea,"),
                    Colorize.format("&7Darkvision, Fey Ancestry,"),
                    Colorize.format("&7Friend of the Sea, Keen Senses,"),
                    Colorize.format("&7Trance")
            )
    );
    public ItemStack shadarkai = quickSpeciesItem(Material.BLACK_CANDLE, true, "Shadar-kai",Arrays.asList(
                    Colorize.format("&7Once shadar-kai were Fey"),
                    Colorize.format("&7like the rest of their elven"),
                    Colorize.format("&7kin; now they exist in a state"),
                    Colorize.format("&7between life and death, thanks"),
                    Colorize.format("&7to being transformed by the"),
                    Colorize.format("&7Shadowfell."),
                    Colorize.format(""),
                    Colorize.format("&f&lShadar-kai Traits"),
                    Colorize.format("&7Elf, Blessing of the Raven"),
                    Colorize.format("&7Queen, Darkvision, Fey Ancestry,"),
                    Colorize.format("&7Keen Senses, Necrotic"),
                    Colorize.format("&7Resistance, Trance")
            )
    );
    public ItemStack shifter = quickSpeciesItem(Material.COBBLESTONE, true, "Shifter",Arrays.asList(
                    Colorize.format("&7Humanoids with a bestial"),
                    Colorize.format("&7aspect, shifters can’t fully"),
                    Colorize.format("&7change shape, but they can"),
                    Colorize.format("&7temporarily enhance their"),
                    Colorize.format("&7animalistic features by entering"),
                    Colorize.format("&7a state they call shifting."),
                    Colorize.format(""),
                    Colorize.format("&f&lShifter Traits"),
                    Colorize.format("&7Bestial Instincts, Darkvision,"),
                    Colorize.format("&7Shifting")
            )
    );
    public ItemStack tabaxi = quickSpeciesItem(Material.OCELOT_SPAWN_EGG, true, "Tabaxi",Arrays.asList(
                    Colorize.format("&7Created by the Cat Lord—"),
                    Colorize.format("&7a divine being of the Upper"),
                    Colorize.format("&7Planes—to blend the qualities"),
                    Colorize.format("&7of humanoids and cats, tabaxi"),
                    Colorize.format("&7are a varied people in both"),
                    Colorize.format("&7attitude and appearance."),
                    Colorize.format(""),
                    Colorize.format("&f&lTabaxi Traits"),
                    Colorize.format("&7Cat’s Claws, Cat’s Talents,"),
                    Colorize.format("&7Darkvision, Feline Agility")
            )
    );
    public ItemStack tortle = quickSpeciesItem(Material.TURTLE_HELMET, true, "Tortle",Arrays.asList(
                    Colorize.format("&7Carrying their shelter on"),
                    Colorize.format("&7their backs gives tortles a"),
                    Colorize.format("&7special feeling of security"),
                    Colorize.format("&7wherever they go, for even if"),
                    Colorize.format("&7they visit a far, unknown"),
                    Colorize.format("&7country, they have a place to"),
                    Colorize.format("&7lay their heads."),
                    Colorize.format(""),
                    Colorize.format("&f&lTortle Traits"),
                    Colorize.format("&7Claws, Hold Breath, Natural"),
                    Colorize.format("&7Armor, Nature’s Intuition,"),
                    Colorize.format("&7Shell Defense")
            )
    );
    public ItemStack triton = quickSpeciesItem(Material.TRIDENT, true, "Triton",Arrays.asList(
                    Colorize.format("&7Over time, triton have"),
                    Colorize.format("&7extended their stewardship over"),
                    Colorize.format("&7the sea floor to the ocean’s"),
                    Colorize.format("&7surface."),
                    Colorize.format(""),
                    Colorize.format("&f&lTriton Traits"),
                    Colorize.format("&7Amphibious, Control Air and"),
                    Colorize.format("&7Water, Darkvision, Emissary"),
                    Colorize.format("&7of the Sea, Guardian of the"),
                    Colorize.format("&7Depths")
            )
    );
    public ItemStack watergenasi = quickSpeciesItem(Material.WATER_BUCKET, true, "Water Genasi",Arrays.asList(
                    Colorize.format("&7Water genasi are perfectly"),
                    Colorize.format("&7suited to life underwater and"),
                    Colorize.format("&7carry the power of the waves"),
                    Colorize.format("&7inside themselves."),
                    Colorize.format(""),
                    Colorize.format("&f&lWater Genasi Traits"),
                    Colorize.format("&7Acid Resistance, Amphibious,"),
                    Colorize.format("&7Call to the Wave, Darkvision")
            )
    );
    public ItemStack yuanti = quickSpeciesItem(Material.LINGERING_POTION, true, "Yuan-ti",Arrays.asList(
                    Colorize.format("&7Blessed with resistance to"),
                    Colorize.format("&7magical and poisonous effects"),
                    Colorize.format("&7by the rituals that created"),
                    Colorize.format("&7them, each of these yuan-ti"),
                    Colorize.format("&7manifests their serpentine"),
                    Colorize.format("&7heritage in a variety of ways."),
                    Colorize.format(""),
                    Colorize.format("&f&lYuan-ti Traits"),
                    Colorize.format("&7Darkvision, Magic Resistance,"),
                    Colorize.format("&7Poison Resilience, Serpentine"),
                    Colorize.format("&7Spellcasting")
            )
    );
    public ItemStack kender = quickSpeciesItem(Material.SPYGLASS, true, "Kender",Arrays.asList(
                    Colorize.format("&7Kender have a supernatural"),
                    Colorize.format("&7curiosity that drives them to"),
                    Colorize.format("&7adventure."),
                    Colorize.format(""),
                    Colorize.format("&f&lKender Traits"),
                    Colorize.format("&7Fearless, Kender Aptitude, Taunt")
            )
    );
    public ItemStack astralelf = quickSpeciesItem(Material.GLASS_BOTTLE, true, "Astral Elf",Arrays.asList(
                    Colorize.format("&7Groups of elves ventured"),
                    Colorize.format("&7from the Feywild to the"),
                    Colorize.format("&7Astral Plane to be closer"),
                    Colorize.format("&7to their gods. Life in the"),
                    Colorize.format("&7Silver Void has imbued their"),
                    Colorize.format("&7souls with a spark of divine"),
                    Colorize.format("&7light."),
                    Colorize.format(""),
                    Colorize.format("&f&lAstral Elf Traits"),
                    Colorize.format("&7Elf, Astral Fire, Darkvision,"),
                    Colorize.format("&7Fey Ancestry, Keen Senses,"),
                    Colorize.format("&7Starlight Step, Astral Trance")
            )
    );
    public ItemStack autognome = quickSpeciesItem(Material.LEVER, true, "Autognome",Arrays.asList(
                    Colorize.format("&7Sometimes, because of a"),
                    Colorize.format("&7malfunction or a unique"),
                    Colorize.format("&7circumstance, an autognome"),
                    Colorize.format("&7becomes separated from its"),
                    Colorize.format("&7creator and strikes out on"),
                    Colorize.format("&7its own."),
                    Colorize.format(""),
                    Colorize.format("&f&lAutognome Traits"),
                    Colorize.format("&7Construct, Armored Casing,"),
                    Colorize.format("&7Built for Success, Healing"),
                    Colorize.format("&7Machine, Mechanical Nature,"),
                    Colorize.format("&7Sentry’s Rest, Specialized"),
                    Colorize.format("&7Design")
            )
    );
    public ItemStack giff = quickSpeciesItem(Material.COW_SPAWN_EGG, true, "Giff",Arrays.asList(
                    Colorize.format("&7As beings of impressive"),
                    Colorize.format("&7size and unforgettable"),
                    Colorize.format("&7appearance, giff are noticed"),
                    Colorize.format("&7wherever they go."),
                    Colorize.format(""),
                    Colorize.format("&f&lGiff Traits"),
                    Colorize.format("&7Astral Spark, Firearms"),
                    Colorize.format("&7Mastery, Hippo Build")
            )
    );
    public ItemStack hadozee = quickSpeciesItem(Material.RABBIT_FOOT, true, "Hadozee",Arrays.asList(
                    Colorize.format("&7Hadozees are sapient,"),
                    Colorize.format("&7bipedal beings eager to leave"),
                    Colorize.format("&7behind the fearsome predators"),
                    Colorize.format("&7of their homeworld and explore"),
                    Colorize.format("&7other worlds."),
                    Colorize.format(""),
                    Colorize.format("&f&lHadozee Traits"),
                    Colorize.format("&7Dexterous Feet, Glide,"),
                    Colorize.format("&7Hadozee Dodge")
            )
    );
    public ItemStack plasmoid = quickSpeciesItem(Material.END_GATEWAY, true, "plasmoid",Arrays.asList(
                    Colorize.format("&7Plasmoids are amorphous beings"),
                    Colorize.format("&7with no typical shape. In the"),
                    Colorize.format("&7presence of other folk, they often"),
                    Colorize.format("&7adopt a similar shape, but there’s"),
                    Colorize.format("&7little chance of mistaking a plasmoid"),
                    Colorize.format("&7for anything else."),
                    Colorize.format(""),
                    Colorize.format("&f&lPlasmoid Traits"),
                    Colorize.format("&7Ooze, Amorphous, Darkvision,"),
                    Colorize.format("&7Hold Breath, Natural Resilience,"),
                    Colorize.format("&7Shape Self")
            )
    );
    public ItemStack thrikreen = quickSpeciesItem(Material.BEE_NEST, true, "Thri-kreen",Arrays.asList(
                    Colorize.format("&7Thri-kreen speak by clacking"),
                    Colorize.format("&7their mandibles and waving their"),
                    Colorize.format("&7antennae, indicating what they are"),
                    Colorize.format("&7thinking and feeling."),
                    Colorize.format(""),
                    Colorize.format("&f&lThri-kreen Traits"),
                    Colorize.format("&7Monstrosity, Chameleon Carapace,"),
                    Colorize.format("&7Darkvision, Secondary Arms,"),
                    Colorize.format("&7Sleepless, Thri-kreen Telepathy")
            )
    );
    public ItemStack owlin = quickSpeciesItem(Material.FEATHER, true, "Owlin",Arrays.asList(
                    Colorize.format("&7Like owls, owlin are graced"),
                    Colorize.format("&7with feathers that make no sound"),
                    Colorize.format("&7when they move or fly, making it"),
                    Colorize.format("&7easy for them to sneak up on you"),
                    Colorize.format("&7in the library."),
                    Colorize.format(""),
                    Colorize.format("&f&lOwlin Traits"),
                    Colorize.format("&7Darkvision, Flight, Silent Feathers")
            )
    );
    public ItemStack leonin = quickSpeciesItem(Material.IRON_NUGGET, true, "Leonin",Arrays.asList(
                    Colorize.format("&7Nomadic, lion-like humanoids who"),
                    Colorize.format("&7rarely interact with other peoples,"),
                    Colorize.format("&7having all they need in their"),
                    Colorize.format("&7shimmering homeland."),
                    Colorize.format(""),
                    Colorize.format("&f&lLeonin Traits"),
                    Colorize.format("&7+2 Constitution, &7+1 Strength,"),
                    Colorize.format("&7Darkvision, Claws, Hunter's Instincts,"),
                    Colorize.format("&7Daunting Roar.")
            )
    );
    public ItemStack kalashtar = quickSpeciesItem(Material.WHITE_DYE, true, "Kalashtar",Arrays.asList(
                    Colorize.format("&7The kalashtar are a compound people"),
                    Colorize.format("&7created from the union of humanity"),
                    Colorize.format("&7and renegade spirits from the plane of dreams."),
                    Colorize.format(""),
                    Colorize.format("&f&lKalashtar Traits"),
                    Colorize.format("&7+2 Wisdom, &7+1 Charisma,"),
                    Colorize.format("&7Dual Mind, Mental Discipline,"),
                    Colorize.format("&7Mind Link, Severed from Dreams.")
            )
    );
    public ItemStack warforged = quickSpeciesItem(Material.IRON_BLOCK, true, "Warforged",Arrays.asList(
                    Colorize.format("&7Warforged are made from wood and metal,"),
                    Colorize.format("&7but they can feel pain and emotion."),
                    Colorize.format("&7Built as weapons, they must now find"),
                    Colorize.format("&7a purpose beyond war."),
                    Colorize.format(""),
                    Colorize.format("&f&lWarforged Traits"),
                    Colorize.format("&7+2 Constitution, +1 to One Other Ability Score,"),
                    Colorize.format("&7Constructed Resilience, Sentry's Rest,"),
                    Colorize.format("&7Integrated Protection, Specialized Design.")
            )
    );
    public ItemStack verdan = quickSpeciesItem(Material.GOLD_INGOT, true, "Verdan",Arrays.asList(
                    Colorize.format("&7The verdan owe their existence to chaos -"),
                    Colorize.format("&7doing their best to find their way"),
                    Colorize.format("&7in an unfamiliar world."),
                    Colorize.format(""),
                    Colorize.format("&f&lVerdan Traits"),
                    Colorize.format("&7+1 Constitution, +2 Charisma,"),
                    Colorize.format("&7Black Blood Healing, Limited Telepathy,"),
                    Colorize.format("&7Persuasive, Telepathic Insight.")
            )
    );
    public ItemStack loxodon = quickSpeciesItem(Material.ELDER_GUARDIAN_SPAWN_EGG, true, "Loxodon",Arrays.asList(
                    Colorize.format("&7Humanoid elephants, loxodons are strong,"),
                    Colorize.format("&7calm, and wise."),
                    Colorize.format(""),
                    Colorize.format("&f&lLoxodon Traits"),
                    Colorize.format("&7+2 Constitution, +1 Wisdom,"),
                    Colorize.format("&7Powerful Build, Loxodon Serenity,"),
                    Colorize.format("&7Natural Armor, Trunk, Keen Smell.")
            )
    );
    public ItemStack simichybrid = quickSpeciesItem(Material.END_CRYSTAL, true, "Simic Hybrid",Arrays.asList(
                    Colorize.format("&7The Simic Combine uses magic to transfer"),
                    Colorize.format("&7the traits of animals into humans, elves,"),
                    Colorize.format("&7and vedalken."),
                    Colorize.format(""),
                    Colorize.format("&f&lSimic Hybrid Traits"),
                    Colorize.format("&7+2 Constitution, +1 One Other Ability Score,"),
                    Colorize.format("&7Darkvision, Animal Enhancement.")
            )
    );
    public ItemStack vedalken = quickSpeciesItem(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS, true, "Vedalken",Arrays.asList(
                    Colorize.format("&7The blue-skinned vedalken strive for"),
                    Colorize.format("&7perfection above all else."),
                    Colorize.format(""),
                    Colorize.format("&f&lVedalken Traits"),
                    Colorize.format("&7+2 Intelligence, +1 Wisdom,"),
                    Colorize.format("&7Vedalken Dispassion, Tireless Precision,"),
                    Colorize.format("&7Partially Amphibious.")
            )
    );
    public ItemStack feraltiefling = quickSpeciesItem(Material.LAVA_BUCKET, true, "Feral Tiefling",Arrays.asList(
                    Colorize.format("&7To be greeted with stares and whispers,"),
                    Colorize.format("&7to suffer violence and insult on the street,"),
                    Colorize.format("&7to see mistrust and fear in every eye:"),
                    Colorize.format("&7this is the lot of the tiefling."),
                    Colorize.format(""),
                    Colorize.format("&f&lFeral Tiefling Traits"),
                    Colorize.format("&7+2 Dexterity, +1 Intelligence,"),
                    Colorize.format("&7Darkvision, Hellish Resistance, Infernal Legacy.")
            )
    );
    public ItemStack locathah = quickSpeciesItem(Material.COD, true, "Locathah",Arrays.asList(
                    Colorize.format("&7These resilient and proud fish-folk"),
                    Colorize.format("&7have endured war, slavery, and mistreatment"),
                    Colorize.format("&7at the hands of other aquatic creatures."),
                    Colorize.format(""),
                    Colorize.format("&f&lLocathah Traits"),
                    Colorize.format("&7+2 Strength, +1 Dexterity,"),
                    Colorize.format("&7Natural Armor, Observant & Athletic,"),
                    Colorize.format("&7Leviathan Will, Limited Amphibiousness.")
            )
    );
    public ItemStack grung = quickSpeciesItem(Material.FROGSPAWN, true, "Grung",Arrays.asList(
                    Colorize.format("&7Your grung character has an assortment of"),
                    Colorize.format("&7inborn abilities, part and parcel of grung nature."),
                    Colorize.format(""),
                    Colorize.format("&f&lGrung Traits"),
                    Colorize.format("&7+2 Dexterity, +1 Constitution,"),
                    Colorize.format("&7Arboreal Alertness, Amphibious,"),
                    Colorize.format("&7Poison Immunity, Poisonous Skin,"),
                    Colorize.format("&7Standing Leap, Water Dependency.")
            )
    );
    public ItemStack gith = quickSpeciesItem(Material.IRON_AXE, true, "Gith",Arrays.asList(
                    Colorize.format("&7Long ago, the gith rose up to"),
                    Colorize.format("&7overthrow the mind flayers that held them"),
                    Colorize.format("&7in servitude, but two factions arose that"),
                    Colorize.format("&7remain bitter enemies today."),
                    Colorize.format(""),
                    Colorize.format("&f&lGith Traits"),
                    Colorize.format("&7+1 Intelligence, &7Githyanki or Githzerai Traits")
            )
    );
    public ItemStack yuantipureblood = quickSpeciesItem(Material.LINGERING_POTION, true, "Yuan-ti Pureblood",Arrays.asList(
                    Colorize.format("&7The serpent creatures known as yuan-ti"),
                    Colorize.format("&7are all that remains of an ancient,"),
                    Colorize.format("&7decadent human empire."),
                    Colorize.format(""),
                    Colorize.format("&f&lYuan-ti Pureblood Traits"),
                    Colorize.format("&7+2 Charisma, +1 Intelligence, &7Darkvision, &7Innate Spellcasting,"),
                    Colorize.format("&7Magic Resistance, &7Poison Immunity")
            )
    );
    public ItemStack erina = quickSpeciesItem(Material.PRISMARINE_SHARD, true, "Erina",Arrays.asList(
                    Colorize.format("&7The erina are a small-statured"),
                    Colorize.format("&7species of creatures resembling"),
                    Colorize.format("&7bipedal hedgehogs."),
                    Colorize.format(""),
                    Colorize.format("&f&lErina Traits"),
                    Colorize.format("&7+2 Dexterity, +1 Wisdom or Charisma, &7Darkvision,"),
                    Colorize.format("&7Hardy, &7Spines, &7Keen Senses, &7Digger")
            )
    );
    public ItemStack bearfolk = quickSpeciesItem(Material.IRON_INGOT, true, "Bearfolk",Arrays.asList(
                    Colorize.format("&7All bearfolk share an inherent iron resolve."),
                    Colorize.format("&7Only by banding together in tight-knit"),
                    Colorize.format("&7communities dedicated to fulfilling their"),
                    Colorize.format("&7noble purpose have the bearfolk miraculously"),
                    Colorize.format("&7continued to thrive."),
                    Colorize.format(""),
                    Colorize.format("&f&lBearfolk Traits"),
                    Colorize.format("&7+2 Strength, &7Bite, &7Natural Armor,"),
                    Colorize.format("&7Powerful Build, &7Ursine Talent")
            )
    );
    public ItemStack darakhul = quickSpeciesItem(Material.BLACK_CONCRETE_POWDER, true, "Darakhul",Arrays.asList(
                    Colorize.format("&7The darakhul are no strangers to darkness,"),
                    Colorize.format("&7and over the years, they deftly adapted to"),
                    Colorize.format("&7their new home and carved out a thriving"),
                    Colorize.format("&7civilization in the Shadow Realm."),
                    Colorize.format(""),
                    Colorize.format("&f&lDarakhul Traits"),
                    Colorize.format("&7+1 Constitution, &7Darkvision, &7Hunger for Flesh,"),
                    Colorize.format("&7Imperfect Undeath, &7Powerful Jaw, &7Undead Vitality")
            )
    );
    public ItemStack quickstep = quickSpeciesItem(Material.END_ROD, true, "Quickstep",Arrays.asList(
                    Colorize.format("&7Quicksteps have a fondness for finery and"),
                    Colorize.format("&7feel right at home amid the riches of court life."),
                    Colorize.format("&7As their name implies, they possess a natural"),
                    Colorize.format("&7affinity for speed, which makes them exquisitely"),
                    Colorize.format("&7qualified for sabotage and dueling."),
                    Colorize.format(""),
                    Colorize.format("&f&lQuickstep Traits"),
                    Colorize.format("&7+2 Dexterity, +1 Charisma, &7Darkvision,"),
                    Colorize.format("&7Fey Ancestry, &7Nimble, &7Startling Speed")
            )
    );
    public ItemStack ravenfolk = quickSpeciesItem(Material.FEATHER, true, "Ravenfolk",Arrays.asList(
                    Colorize.format("&7Few races in Midgard live amid so much rumor,"),
                    Colorize.format("&7suspicion, and outright falsehood as the ravenfolk."),
                    Colorize.format(""),
                    Colorize.format("&f&lRavenfolk Traits"),
                    Colorize.format("&7+2 Dexterity, +1 Charisma, &7Sudden Attack,"),
                    Colorize.format("&7Mimicry, &7Trickster")
            )
    );
    public ItemStack ratatosk = quickSpeciesItem(Material.FOX_SPAWN_EGG, true, "Ratatosk",Arrays.asList(
                    Colorize.format("&7In recent decades, the squirrel-like beings called"),
                    Colorize.format("&7ratatosk have grown bored with simply safeguarding"),
                    Colorize.format("&7the World Tree and have decided to more actively"),
                    Colorize.format("&7battle corruption in the Shadow Realm."),
                    Colorize.format(""),
                    Colorize.format("&f&lRatatosk Traits"),
                    Colorize.format("&7+2 Dexterity, -2 Strength, &7Darkvision,"),
                    Colorize.format("&7Grounded Celestial, &7Sharp Tusks, &7Telepathic")
            )
    );
    public ItemStack satarre = quickSpeciesItem(Material.LINGERING_POTION, true, "Satarre",Arrays.asList(
                    Colorize.format("&7The satarre are powerful and wise creatures"),
                    Colorize.format("&7often found serving dark cults or (less often)"),
                    Colorize.format("&7warning other races of the plans of such cults."),
                    Colorize.format(""),
                    Colorize.format("&f&lSatarre Traits"),
                    Colorize.format("&7+2 Constitution, +1 Intelligence, &7Darkvision,"),
                    Colorize.format("&7A Friend to Death, &7Keeper of Secrets, &7Carrier of Rot")
            )
    );
    public ItemStack shade = quickSpeciesItem(Material.DIAMOND_SHOVEL, true, "Shade",Arrays.asList(
                    Colorize.format("&7Life leaves echoes in its wake,"),
                    Colorize.format("&7whether crumbled remnants of a bygone civilization"),
                    Colorize.format("&7or even the echo of an individual soul left behind"),
                    Colorize.format("&7to haunt the living world."),
                    Colorize.format(""),
                    Colorize.format("&f&lShade Traits"),
                    Colorize.format("&7+1 Charisma, +1 Another Ability Score,"),
                    Colorize.format("&7Ghostly Flesh, &7Imperfect Undeath,"),
                    Colorize.format("&7Life Drain, &7Spectral Resilience, &7Living Origin")
            )
    );
    public ItemStack shadowgoblin = quickSpeciesItem(Material.GOLDEN_PICKAXE, true, "Shadow Goblin",Arrays.asList(
                    Colorize.format("&7These goblins are closer to fey"),
                    Colorize.format("&7than to their monstrous cousins in"),
                    Colorize.format("&7the mortal lands, and their cunning"),
                    Colorize.format("&7dispositions allow them to integrate"),
                    Colorize.format("&7into the shadow courts."),
                    Colorize.format(""),
                    Colorize.format("&f&lShadow Goblin Traits"),
                    Colorize.format("&7+2 Dexterity, +1 Charisma,"),
                    Colorize.format("&7Darkvision, &7Quick Wit,"),
                    Colorize.format("&7Shadow Camouflage, &7Stink Eye,"),
                    Colorize.format("&7Sunlight Sensitivity, &7Unseelie"),
                    Colorize.format("&7Blessing")
            )



    );
    public ItemStack umbralhuman = quickSpeciesItem(Material.BLACK_SHULKER_BOX, true, "Umbral Human",Arrays.asList(
                    Colorize.format("&7The Shadow Realm twists beings"),
                    Colorize.format("&7with its magic, and in the case"),
                    Colorize.format("&7of the umbral humans, this influence"),
                    Colorize.format("&7can have radical effects."),
                    Colorize.format(""),
                    Colorize.format("&f&lUmbral Human Traits"),
                    Colorize.format("&7+2 to One Ability Score, +1 to"),
                    Colorize.format("&7One Other Ability Score,"),
                    Colorize.format("&7Darkvision, &7Dark Infusion,"),
                    Colorize.format("&7Fade Away")
            )
    );
    public ItemStack thedisembodied = quickSpeciesItem(Material.END_PORTAL, true, "The Disembodied",Arrays.asList(
                    Colorize.format("&7The Disembodied are the survivors"),
                    Colorize.format("&7of the Ethereal Rift, trapped"),
                    Colorize.format("&7between worlds with a tenuous"),
                    Colorize.format("&7grasp on the Material Plane."),
                    Colorize.format(""),
                    Colorize.format("&f&lThe Disembodied Traits"),
                    Colorize.format("&7+2 Intelligence, +1 Dexterity,"),
                    Colorize.format("&7Fade Away, &7Planar Outcast,"),
                    Colorize.format("&7Arcane Origins")
            )
    );
    public ItemStack wechselkind = quickSpeciesItem(Material.OAK_WOOD, true, "Wechselkind",Arrays.asList(
                    Colorize.format("&7A wechselkind is a construct"),
                    Colorize.format("&7crafted of wood, clay, and"),
                    Colorize.format("&7ceramic in the form of a small"),
                    Colorize.format("&7child."),
                    Colorize.format(""),
                    Colorize.format("&f&lWechselkind Traits"),
                    Colorize.format("&7+2 Constitution, +1 Charisma,"),
                    Colorize.format("&7Artificial Form, &7Faerie Glamour,"),
                    Colorize.format("&7Childish Agility")
            )
    );
    public ItemStack cervan = quickSpeciesItem(Material.LEATHER, true, "Cervan",Arrays.asList(
                    Colorize.format("&7A wechselkind is a construct"),
                    Colorize.format("&7crafted of wood, clay, and"),
                    Colorize.format("&7ceramic in the form of a small"),
                    Colorize.format("&7child."),
                    Colorize.format(""),
                    Colorize.format("&f&lWechselkind Traits"),
                    Colorize.format("&7+2 Constitution, +1 Charisma,"),
                    Colorize.format("&7Artificial Form, &7Faerie Glamour,"),
                    Colorize.format("&7Childish Agility")
            )
    );
    public ItemStack corvum = quickSpeciesItem(Material.FEATHER, true, "Corvum",Arrays.asList(
                    Colorize.format("&7Corvums are a crow-like race"),
                    Colorize.format("&7with dark feathers and sharp minds."),
                    Colorize.format("&7Crafty, they tend to get what"),
                    Colorize.format("&7they want, one way or another."),
                    Colorize.format(""),
                    Colorize.format("&f&lCorvum Traits"),
                    Colorize.format("&7+2 Intelligence, &7Glide,"),
                    Colorize.format("&7Talons, &7Learned, &7Appraising Eye")
            )
    );
    public ItemStack gallus = quickSpeciesItem(Material.FEATHER, true, "Gallus",Arrays.asList(
                    Colorize.format("&7Gallus have a deep respect"),
                    Colorize.format("&7for nature and a love of"),
                    Colorize.format("&7gardening unmatched by other"),
                    Colorize.format("&7birdfolk. They value their"),
                    Colorize.format("&7social bonds above all else,"),
                    Colorize.format("&7and are always ready to help"),
                    Colorize.format("&7their neighbors."),
                    Colorize.format(""),
                    Colorize.format("&f&lGallus Traits"),
                    Colorize.format("&7+2 Wisdom, &7Glide,"),
                    Colorize.format("&7Wing Flap, &7Communal,"),
                    Colorize.format("&7Militia Training, &7Of the People")
            )
    );
    public ItemStack hedge = quickSpeciesItem(Material.PRISMARINE_SHARD, true, "Hedge",Arrays.asList(
                    Colorize.format("&7The most diplomatic and"),
                    Colorize.format("&7good natured of all the"),
                    Colorize.format("&7humblefolk, hedges like to"),
                    Colorize.format("&7live quiet lives in villages"),
                    Colorize.format("&7throughout the Wood, or within"),
                    Colorize.format("&7the safety of birdfolk perches."),
                    Colorize.format(""),
                    Colorize.format("&f&lHedge Traits"),
                    Colorize.format("&7+2 Charisma, +1 Wisdom,"),
                    Colorize.format("&7Natural Burrowers, &7Spiny Quills,"),
                    Colorize.format("&7Curl Up, &7Forest Magic, &7Speak") ,
                    Colorize.format("&7With Bugs")
            )
    );
    public ItemStack jerbeen = quickSpeciesItem(Material.RABBIT_HIDE, true, "Jerbeen",Arrays.asList(
                    Colorize.format("&7Jerbeens are small mouse-like"),
                    Colorize.format("&7folk with long, furred tails that"),
                    Colorize.format("&7help them balance."),
                    Colorize.format(""),
                    Colorize.format("&f&lJerbeen Traits"),
                    Colorize.format("&7+1 Charisma, +2 Dexterity,"),
                    Colorize.format("&7Standing Leap, &7Nimbleness,"),
                    Colorize.format("&7Take Heart, &7Team Tactics")
            )
    );
    public ItemStack luma = quickSpeciesItem(Material.FEATHER, true, "Luma",Arrays.asList(
                    Colorize.format("&7Lumas are smaller than most"),
                    Colorize.format("&7birdfolk, and resemble either"),
                    Colorize.format("&7doves or pigeons."),
                    Colorize.format("&7They are as often shunned for"),
                    Colorize.format("&7their eccentricities as they are"),
                    Colorize.format("&7celebrated for them."),
                    Colorize.format(""),
                    Colorize.format("&f&lLuma Traits"),
                    Colorize.format("&7+2 Charisma, &7Glide,"),
                    Colorize.format("&7Wing Flap, &7Touched, &7Fated")
            )
    );
    public ItemStack mapach = quickSpeciesItem(Material.RABBIT_FOOT, true, "Mapach",Arrays.asList(
                    Colorize.format("&7Naturally curious, mapachs are a"),
                    Colorize.format("&7medium-sized racoon-like race."),
                    Colorize.format(""),
                    Colorize.format("&f&lMapach Traits"),
                    Colorize.format("&7+2 Wisdom, +1 Constitution,"),
                    Colorize.format("&7Darkvision, &7Expert Climbers,"),
                    Colorize.format("&7Resilience, &7Scroungecraft,"),
                    Colorize.format("&7Skulker")
            )
    );
    public ItemStack raptor = quickSpeciesItem(Material.FEATHER, true, "Raptor",Arrays.asList(
                    Colorize.format("&7Resembling small hawks, eagles,"),
                    Colorize.format("&7and other birds of prey, they have"),
                    Colorize.format("&7sharp talons and agile builds that"),
                    Colorize.format("&7help them effortlessly glide through"),
                    Colorize.format("&7the canopy."),
                    Colorize.format(""),
                    Colorize.format("&f&lRaptor Traits"),
                    Colorize.format("&7+2 Dexterity, &7Glide,"),
                    Colorize.format("&7Talons, &7Keen Senses,"),
                    Colorize.format("&7Woodland Hunter, &7Hunter’s Training")
            )
    );
    public ItemStack stig = quickSpeciesItem(Material.FEATHER, true, "Stig",Arrays.asList(
                    Colorize.format("&7Resembling owls, their thick"),
                    Colorize.format("&7feathers, solid bodies, and broad"),
                    Colorize.format("&7wings have earned them a reputation") ,
                    Colorize.format("&7as the most powerful of the birdfolk"),
                    Colorize.format("&7races."),
                    Colorize.format(""),
                    Colorize.format("&f&lStrig Traits"),
                    Colorize.format("&7+2 Strength, &7Glide,"),
                    Colorize.format("&7Talons, &7Darkvision,"),
                    Colorize.format("&7Patterned Feathers")
            )
    );
    public ItemStack vulpin = quickSpeciesItem(Material.FOX_SPAWN_EGG, true, "Vulpin",Arrays.asList(
                    Colorize.format("&7One of the least understood"),
                    Colorize.format("&7and most often vilified humblefolk"),
                    Colorize.format("&7in the Wood, vulpins have earned a") ,
                    Colorize.format("&7bad reputation that isn’t entirely"),
                    Colorize.format("&7deserved."),
                    Colorize.format(""),
                    Colorize.format("&f&lVulpin Traits"),
                    Colorize.format("&7+2 Intelligence, +1 Charisma,"),
                    Colorize.format("&7Darkvision, &7Bite,"),
                    Colorize.format("&7Evasive, &7Bewitching Guile")
            )
    );



    public ItemStack quickSpeciesItem(Material material, boolean enchGlint, String name, List<String> lore){
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        meta.getPersistentDataContainer().set(GuitemKeys.guiButton, PersistentDataType.STRING, name);
        meta.getPersistentDataContainer().set(GuitemKeys.classButton, PersistentDataType.STRING, name);
        if(enchGlint)meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        meta.addItemFlags(ItemFlag.HIDE_ITEM_SPECIFICS);
        item.setItemMeta(meta);
        return item;
    }
    public ItemStack back = quickButtonItem(Material.ARROW, true, "Previous Page",null);
    public ItemStack exit = quickButtonItem(Material.BARRIER, true, "Exit",null);
    public ItemStack next = quickButtonItem(Material.ARROW, true, "Next Page",null);
    public ItemStack page1 = quickButtonItem(Material.ARROW, true, "Page 1",null);
    public ItemStack page2 = quickButtonItem(Material.ARROW, true, "Page 2",null);
    public ItemStack page3 = quickButtonItem(Material.ARROW, true, "Page 3",null);
    public ItemStack page4 = quickButtonItem(Material.ARROW, true, "Page 4",null);

    public ItemStack blank = quickButtonItem(Material.GRAY_STAINED_GLASS_PANE, true, "",null);
    public ItemStack quickButtonItem(Material material, boolean enchGlint, String name, List<String> lore){
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        meta.getPersistentDataContainer().set(GuitemKeys.guiButton, PersistentDataType.STRING, name);
        meta.getPersistentDataContainer().set(GuitemKeys.navButton, PersistentDataType.STRING, name);
        if(enchGlint)meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        meta.addItemFlags(ItemFlag.HIDE_ITEM_SPECIFICS);
        item.setItemMeta(meta);
        return item;
    }
}
