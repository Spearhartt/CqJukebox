package com.conquestiamc;

import org.bukkit.Bukkit;
import org.bukkit.World;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.conquestiamc.CqJukebox.plugin;

public class PlaylistManager {

    public static HashMap playlists = new HashMap<World, Playlist>();
    public static File playlistFolder = new File(plugin.getDataFolder().getPath() + "/playlists");
    public static ArrayList<File> worldFolders = new ArrayList<File>();

    public PlaylistManager() {
        setupPlaylistsFolder();
    }

    public void loadPlaylists() {

        for (File worldFolder : worldFolders) {
            for (File playlist : worldFolder.listFiles()) {
                World world = Bukkit.getWorld(worldFolder.getName());
                playlists.put(world, new Playlist(world, playlist.getName()));
            }
        }

    }

    public void setupPlaylistsFolder() {
        if (!playlistFolder.exists()) {
            playlistFolder.mkdirs();
        }

        List<World> worlds = Bukkit.getWorlds();

        for (World world : worlds) {
            File worldFile = new File(playlistFolder.getPath() + "/" + world.getName());
            worldFolders.add(worldFile);
            if (!worldFile.exists()) {
                worldFile.mkdirs();
            }
        }
    }

}
