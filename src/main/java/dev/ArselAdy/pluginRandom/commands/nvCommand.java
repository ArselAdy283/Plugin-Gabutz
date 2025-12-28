package dev.ArselAdy.pluginRandom.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class nvCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage(ChatColor.RED + "Hanya player yang bisa menggunakan command ini");
            return true;
        }

        if (!player.hasPermission("nv.use")) {
            player.sendMessage(ChatColor.RED + "Kamu tidak diizinkan menggunakan command ini");
            return true;
        }

        if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
            player.sendMessage(ChatColor.RED + "Night Vision dimatikan");
        } else {
            PotionEffect nv = new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 0, false, false, true);

            player.addPotionEffect(nv);
            player.sendMessage(ChatColor.GREEN + "Night Vision dinyalakan");
        }

        return true;
    }
}
