package org.randomlima.dungeonsanddiamonds.Commands.Dice;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.randomlima.dungeonsanddiamonds.DungeonsAndDiamonds;
import org.randomlima.dungeonsanddiamonds.Util.DiceStuff;

public class D10Command implements CommandExecutor {
    private final DungeonsAndDiamonds plugin;
    DiceStuff diceStuff;
    public D10Command(DungeonsAndDiamonds plugin){
        this.plugin = plugin;
        diceStuff = new DiceStuff(plugin);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if(sender instanceof Player) diceStuff.tellDieRolls((Player) sender,10,20);
        return true;
    }
}