package au.com.skynetmc.skynetcore.commands;

import au.com.skynetmc.skynetcore.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class GetStick implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("stick")) {
            player.sendMessage("Hit me slowly hit me quick!");

            player.getInventory().setItemInMainHand(ItemManager.wand);

        }

        return true;
    }


}