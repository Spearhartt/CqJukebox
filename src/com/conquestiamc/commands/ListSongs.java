package com.conquestiamc.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.ArrayList;

import static com.conquestiamc.CqJukebox.plugin;

public class ListSongs extends CqSubCommand {
    public void execute(Player player, ArrayList<String> arrayList) {
        File folder = plugin.getDataFolder();
        File[] listOfFiles = folder.listFiles();

        for(File file : listOfFiles) {
            if (file.getName().contains("nbs")) {
                player.sendMessage(ChatColor.GRAY + "[" + ChatColor.BLUE + "CQJ" + ChatColor.YELLOW + "] " + ChatColor.GRAY + file.getName().matches(".*(?=.nbs)"));
            }
        }
    }

    public String getCommandLabel() {
        return "list songs";
    }

    public String[] getAliases() {
        return new String[0];
    }

    public String[] getPermissions() {
        String[] perms = new String[]{"cq.jukebox"};
        return perms;
    }

    public String getDescription() {
        return "Gives a list of all songs currently loaded.";
    }

    public String getFormattedCommand() {
        return "/cqj list songs";
    }

    public String getUsage() {
        return "/cqj list songs";
    }
}
