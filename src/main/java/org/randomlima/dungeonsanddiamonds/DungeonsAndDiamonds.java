package org.randomlima.dungeonsanddiamonds;

import org.bukkit.plugin.java.JavaPlugin;
import org.randomlima.dungeonsanddiamonds.Commands.Dice.*;
import org.randomlima.dungeonsanddiamonds.Commands.DungeoneerCommand;
import org.randomlima.dungeonsanddiamonds.Managers.CharacterBuilder;

public final class DungeonsAndDiamonds extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("d4").setExecutor(new D4Command(this));
        this.getCommand("d6").setExecutor(new D6Command(this));
        this.getCommand("d8").setExecutor(new D8Command(this));
        this.getCommand("d10").setExecutor(new D10Command(this));
        this.getCommand("d12").setExecutor(new D12Command(this));
        this.getCommand("d16").setExecutor(new D16Command(this));
        this.getCommand("d20").setExecutor(new D20Command(this));

        this.getCommand("character").setExecutor(new DungeoneerCommand(this));

        getServer().getPluginManager().registerEvents(new CharacterBuilder(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
