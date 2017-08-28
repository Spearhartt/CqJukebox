package com.conquestiamc.commands;

import com.conquestiamc.CqJukebox;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class RegionInfo extends CqSubCommand {
    public void execute(Player player, ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            player.sendMessage("Please enter a region -- /cqj info <region>");
            return;
        }

        List<String> regions = CqJukebox.config.getConfig().getStringList("regions");

        if (regions.contains(arrayList.get(0))) {
            player.sendMessage(ChatColor.GRAY + "--------------------[ " + ChatColor.BLUE + "[CQJ] " + ChatColor.YELLOW + arrayList.get(0) + ChatColor.GRAY + " ]--------------------");
            player.sendMessage("Spearhartt finish your stupid plugin you douchebag.");
            player.sendMessage(ChatColor.GRAY + "-----------------------------------------------" );
            return;
        }

        player.sendMessage("Region not found.");
    }

    public String getCommandLabel() {
        return "info";
    }

    public String[] getAliases() {
        return new String[0];
    }

    public String[] getPermissions() {
        String[] perms = new String[]{"cq.jukebox"};
        return perms;
    }

    public String getDescription() {
        return "Give info on selected region";
    }

    public String getFormattedCommand() {
        return "/cqj info <region>";
    }

    public String getUsage() {
        return "/cqj info <region>";
    }
}
