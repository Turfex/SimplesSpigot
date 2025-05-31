package de.philcraft.simplesspigot;

import de.philcraft.simplesspigot.classes.ServerLogger;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimplesSpigot extends JavaPlugin {

    @Override
    public void onEnable() {
        ServerLogger.info("SimplesSpigot getting enabled!");


    }

    @Override
    public void onDisable() {
        ServerLogger.info("SimplesSpigot getting disabled!");
    }
}
