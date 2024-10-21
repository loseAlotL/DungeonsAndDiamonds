package org.randomlima.dungeonsanddiamonds.Util;

import org.bukkit.ChatColor;

public class Colorize {
    public static String format(String str){
        return ChatColor.translateAlternateColorCodes('&', str);
    }
}
