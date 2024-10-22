package org.randomlima.dungeonsanddiamonds.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.randomlima.dungeonsanddiamonds.DungeonsAndDiamonds;
import org.randomlima.dungeonsanddiamonds.Managers.CharacterBuilder;

public class CharacterCommand implements CommandExecutor {
    private final DungeonsAndDiamonds plugin;
    CharacterBuilder characterBuilder = new CharacterBuilder();
    public CharacterCommand(DungeonsAndDiamonds plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if(!(sender instanceof Player))return true;
        Player player = (Player) sender;
        player.openInventory(characterBuilder.classGui(player));
        return true;
    }
}
