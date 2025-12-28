package dev.ArselAdy.pluginRandom.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.World;
import org.bukkit.entity.EntityType;

public class seribuBayanganCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage(ChatColor.RED + "Hanya player yang bisa menggunakan command ini");
            return true;
        }

        if (!player.hasPermission("seribuBayangan.use")) {
            player.sendMessage(ChatColor.RED + "Kamu tidak diizinkan menggunakan command ini");
            return true;
        }

        World world = player.getWorld();

        player.sendMessage(ChatColor.YELLOW + "Kage Bunshin no Jutsu");
        for (int i = 0; i < 30; i++) {
            world.spawnEntity(player.getLocation(), EntityType.PIG);
        }

        return true;
    }
}
