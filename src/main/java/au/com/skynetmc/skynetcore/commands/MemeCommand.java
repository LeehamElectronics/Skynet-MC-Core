package au.com.skynetmc.skynetcore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public class MemeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("meme")) {
            player.sendMessage("Good Meme!");
            if (args.length >= 2) {
                // do stuff
                try {
                    EntityType entity = EntityType.valueOf(args[0].toUpperCase(Locale.ROOT));
                    int amount  = Integer.parseInt(args[1]);
                    for (int i = 0; i < amount; i++){
                        player.getWorld().spawnEntity(player.getLocation(), entity);
                    }
                } catch (IllegalArgumentException e){
                    player.sendMessage("M8 that aint a valid entity, can u pls get gud?");
                }
                }
            else {
                // if player did not provide enough args
                player.sendMessage("usage: /meme arg1 arg2");
            }
        }

        return true;
    }


}