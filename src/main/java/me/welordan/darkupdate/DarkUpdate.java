package me.welordan.darkupdate;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.bstats.bukkit.Metrics;
import me.mrCookieSlime.Slimefun.cscorelib2.config.Config;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

public class DarkUpdate extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            
        }

        NamespacedKey categoryID = new NamespacedKey(this, "dark_category");
        CustomItem categoryItem = new CustomItem(Material.NETHER_STAR, "&4Dark Magic", "", "&a> Click to open");

        Category category = new Category(categoryID, categoryItem);

        

    }

    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/Welordan/dark/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

}
