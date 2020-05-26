package me.welordan.darkupdate;

import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
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

        // Creating the category
        NamespacedKey categoryID = new NamespacedKey(this, "dark_category");
        CustomItem categoryItem = new CustomItem(Material.NETHER_STAR, "&4Dark Magic", "", "&a> Click to open");

        Category category = new Category(categoryID, categoryItem);

        // Creating the dark essence item.
        SlimefunItemStack darkEssenceItemStack = new SlimefunItemStack("DARK_ESSENCE", Material.BLAZE_POWDER, "&6Dark Essence", "", "&cThe severed intelligence of a corrupted being. Dissolves when touched. Used for crafting recipes...");
        SlimefunItem darkEssenceItem = new SlimefunItem(category, darkEssenceItemStack, RecipeType.MOB_DROP, null);

        darkEssenceItem.register(this);

        // Creating the dense essence item.
        SlimefunItemStack denseEssenceItemStack = new SlimefunItemStack("DENSE_ESSENCE", Material.BLAZE_ROD, "&6Dense Essence", "", "&cDense Essence...");
        ItemStack[] denseEssenceRecipe = {null, null, null, null, null, null, null, darkEssenceItemStack, darkEssenceItemStack};
        SlimefunItem denseEssenceItem = new SlimefunItem(category, denseEssenceItemStack, RecipeType.COMPRESSOR, denseEssenceRecipe);

        denseEssenceItem.register(this);
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
