package com.conquestiamc;

import org.bukkit.World;

public class Playlist {

    public String regionName;
    public World world;

    public Playlist(World world, String regionName) {
        this.regionName = regionName;
        this.world = world;
    }

}
