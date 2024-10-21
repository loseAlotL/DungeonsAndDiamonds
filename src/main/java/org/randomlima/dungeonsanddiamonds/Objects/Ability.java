package org.randomlima.dungeonsanddiamonds.Objects;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Ability {
    private String name;
    private String description;
    private int cooldown;
    private int manaCost;
    private boolean isAvailable;

    public Ability(String name, String description, int cooldown, int manaCost) {
        this.name = name;
        this.description = description;
        this.cooldown = cooldown;
        this.manaCost = manaCost;
        this.isAvailable = true;
    }

    public void cast(Player player) {
        if (!isAvailable) {
            player.sendMessage("Ability is on cooldown!");
            return;
        }

        isAvailable = false;
        startCooldown(player);
    }

    private void applyEffect(Player player, PotionEffectType potionEffectType) {
        player.addPotionEffect(new PotionEffect(potionEffectType, 100, 1));
        player.sendMessage(name + " cast!");
    }

    private void startCooldown(Player player) {
        new Thread(() -> {
            try {
                Thread.sleep(cooldown * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isAvailable = true;
            player.sendMessage(name + " is ready to use again.");
        }).start();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getManaCost() {
        return manaCost;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}

