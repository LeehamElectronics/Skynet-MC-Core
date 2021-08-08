package au.com.skynetmc.skynetcore;

import au.com.skynetmc.skynetcore.commands.FeedCommand;
import au.com.skynetmc.skynetcore.commands.GetStick;
import au.com.skynetmc.skynetcore.commands.HealthCommand;
import au.com.skynetmc.skynetcore.commands.MemeCommand;
import au.com.skynetmc.skynetcore.events.PlayerEvents;
import au.com.skynetmc.skynetcore.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkynetCore extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerEvents(), this);
        getCommand("helth").setExecutor(new HealthCommand());
        getCommand("hungy").setExecutor(new FeedCommand());
        getCommand("meme").setExecutor(new MemeCommand());
        getCommand("stick").setExecutor(new GetStick());

        ItemManager.init();

        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Skynet MC Core Plugin Starting");
        getLogger().info("Skynet MC Core Plugin Now Starting");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
