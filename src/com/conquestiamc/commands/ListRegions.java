package com.conquestiamc.commands;

import com.conquestiamc.config.Config;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

import static com.conquestiamc.CqJukebox.CQJ;

public class ListRegions extends CqSubCommand {

    @Override
    public void execute(Player player, ArrayList<String> arrayList) {

        Config config = CQJ.config;
        List<String> regions = config.getConfig().getStringList("regions.");

        player.sendMessage(config.getConfig().getString("regions."));

        if (regions.size() == 0) {
            player.sendMessage(ChatColor.RED + "There are no regions configured.");
            return;
        }

        for (String region : regions) {
            player.sendMessage(ChatColor.GRAY + "[" + ChatColor.BLUE + "CQJ" + ChatColor.YELLOW + "] " + ChatColor.GRAY + " - " + region);
        }
    }

    public String getCommandLabel() {
        return "regions";
    }

    public String[] getAliases() {
        return new String[0];
    }

    public String[] getPermissions() {
        String[] perms = new String[]{"cq.jukebox"};
        return perms;
    }

    public String getDescription() {
        return "List all regions in Jukebox config.";
    }

    public String getFormattedCommand() {
        return "/cqj list regions";
    }

    public String getUsage() {
        return "/cqj list regions";
    }
}
