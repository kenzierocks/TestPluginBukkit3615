package com.techshroom.bukkit.plugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin3615 extends JavaPlugin implements Listener {
    public void onEnable() {
        getLogger().info("Loading test plugin for Bukkit-3615...");
        getLogger().info("Resource pack is '" + Bukkit.getResourcePack() + "'");
        getLogger().info("Loaded.");
    }

    public void onDisable() {
        getLogger().info("Unloading test plugin for Bukkit-3615...");
        getLogger().info("Unloaded.");
    }
}
