package au.com.skynetmc.skynetcore.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public static ItemStack wand;

    public static void init() {
        createWand();

    }

    private static void createWand(){
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Rythm Stick");
        List<String> lore = new ArrayList<>();
        lore.add("§7Hit me slowly");
        lore.add("§7Hit me quick");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        wand = item;

        //shaped recipe
        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("rythmstick"), item);
        sr.shape("B  ",
                " S ",
                "  S");
        sr.setIngredient('B', Material.BLAZE_POWDER);
        sr.setIngredient('S', Material.STICK);
        Bukkit.getServer().addRecipe(sr);


    }

}
