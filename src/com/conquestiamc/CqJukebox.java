package com.conquestiamc;

import com.conquestiamc.commands.*;
import com.conquestiamc.config.Config;
import com.sk89q.worldguard.bukkit.WorldGuardPlugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class CqJukebox extends JavaPlugin {

    public static CqJukebox CQJ;
    public static JavaPlugin plugin;
    public static CqBaseCommand baseCommand;
    public static WorldGuardPlugin worldGuard;
    public static PlaylistManager playlistManager;

    public static Config config;
    public static String pluginName;

    public void onEnable() {

        CQJ = this;
        plugin = this;

        worldGuard = new WorldGuardConnection().getWorldGuard();

        config = new Config(this, "config");
        setupConfig();

        baseCommand = new BaseCommand("CqJukebox");
        CommandModule.registerBaseCommand(baseCommand);

        baseCommand.registerCommand(new Reload());
        baseCommand.registerCommand(new ListSongs());
        baseCommand.registerCommand(new ListRegions());
        baseCommand.registerCommand(new RegionInfo());

        playlistManager = new PlaylistManager();
    }

    public void onDisable() {

    }

    public void setupConfig() {
        if (!config.getConfigFile().exists()) {
            config.saveDefaultConfig();
        }
    }

}
