package com.conquestiamc.commands;

import com.conquestiamc.CqJukebox;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Reload extends CqSubCommand {
    public void execute(Player player, ArrayList<String> arrayList) {
        CqJukebox.config.reloadConfig();
        player.sendMessage(ChatColor.GREEN + "CQ Jukebox has been reloaded.");
    }

    public String getCommandLabel() {
        return "reload";
    }

    public String[] getAliases() {
        return new String[0];
    }

    public String[] getPermissions() {
        String[] perms = new String[]{"cq.jukebox"};
        return perms;
    }

    public String getDescription() {
        return "Reloads CQ Jukebox.";
    }

    public String getFormattedCommand() {
        return "/cqj reload";
    }

    public String getUsage() {
        return null;
    }
}
