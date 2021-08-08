package au.com.skynetmc.skynetcore.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

// private HashMap<Player, Location> playerLocations = new HashMap<Player, Location()>

public class PlayerEvents implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GREEN + "Welcome to the best server ever!");

    }

    @EventHandler
    public static void OnPlayerWalk(PlayerMoveEvent event) {

        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        Material block = player.getWorld().getBlockAt(x, y-1, z).getType();
        if (block == Material.STONE) {
            player.sendMessage(ChatColor.GREEN + "You are standing on Stone!");
        }

    }

}
