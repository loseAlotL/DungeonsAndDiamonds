package org.randomlima.dungeonsanddiamonds.Objects;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Dungeoneer {
    private Player player;
    private String name;
    private PlayClass playClass;
    private int level;
    private int experience;

    // D&D Attributes
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;

    private List<ItemStack> inventory;
    private Map<String, Integer> skills;
    private List<String> proficiencies;

    public Dungeoneer(Player player, PlayClass playClass, int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        this.player = player;
        this.name = player.getName();
        this.playClass = playClass;
        this.level = 1;
        this.experience = 0;

        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;

        this.inventory = new ArrayList<>();
        this.skills = new HashMap<>();
        this.proficiencies = new ArrayList<>();

        initializeSkills();
    }
    private void initializeSkills() {
        skills.put("Acrobatics", dexterity);
        skills.put("Arcana", intelligence);
        skills.put("Athletics", strength);
        skills.put("Insight", wisdom);
        skills.put("Investigation", intelligence);
        skills.put("Perception", wisdom);
        skills.put("Persuasion", charisma);

    }

    public String getName(){
        return name;
    }

    public void gainExperience(int xp) {
        experience += xp;
        if (experience >= xpNeededForNextLevel()) {
            levelUp();
        }
    }

    private void levelUp() {
        level++;
        player.sendMessage("Congratulations! You've reached level " + level);
    }

    private int xpNeededForNextLevel() {
        return level * 100;
    }


    public void applyPotionEffect(PotionEffect effect) {
        player.addPotionEffect(effect);
    }

    public void improveSkill(String skillName, int improvement) {
        if (skills.containsKey(skillName)) {
            skills.put(skillName, skills.get(skillName) + improvement);
        } else {
            throw new IllegalArgumentException("Skill " + skillName + " not found.");
        }
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getSkill(String skillName) {
        return skills.getOrDefault(skillName, 0);
    }

    public List<ItemStack> getInventory() {
        return inventory;
    }

    public void addItemToInventory(ItemStack item) {
        inventory.add(item);
    }

    public String saveCharacterState() {
        // save stuff and stuff
        return "Saved successfully!";
    }

    public static Dungeoneer loadCharacterState(Player player) {
        return new Dungeoneer(player, PlayClass.FIGHTER, 10, 10, 10, 10, 10); // Example placeholder
    }
}
