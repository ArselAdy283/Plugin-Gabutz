package dev.ArselAdy.pluginRandom;

import dev.ArselAdy.pluginRandom.commands.nvCommand;
import dev.ArselAdy.pluginRandom.commands.seribuBayanganCommand;
import org.bukkit.plugin.java.JavaPlugin;


public final class PluginRandom extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin Aktif");

        // Register commands
        getCommand("nv").setExecutor(new nvCommand());
        getCommand("seribubayangan").setExecutor(new seribuBayanganCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Nonaktif");
    }
}
