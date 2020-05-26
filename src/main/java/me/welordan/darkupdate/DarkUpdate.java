package me.welordan.darkupdate;

import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.api.Slimefun;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
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
        // Creating the category
        NamespacedKey categoryID = new NamespacedKey(this, "dark_category");
        CustomItem categoryItem = new CustomItem(Material.NETHER_STAR, "&4Dark Magic", "", "&a> Click to open");

        Category category = new Category(categoryID, categoryItem);

        // Creating the dark essence item.
        SlimefunItemStack darkEssenceItemStack = new SlimefunItemStack("DARK_ESSENCE", Material.BLAZE_POWDER, "&6Dark Essence", "", "&cThe severed intelligence of a corrupted being. Dissolves when touched. Used for crafting recipes...");
        SlimefunItem darkEssenceItem = new SlimefunItem(category, darkEssenceItemStack, RecipeType.MOB_DROP, null);

        darkEssenceItem.register(this);

        // Creating the dense essence item.
        SlimefunItemStack denseEssenceItemStack = new SlimefunItemStack("DENSE_ESSENCE", Material.BLAZE_ROD, "&6Dense Essence", "", "&cDark Essence compressed into a solid ingot. Used in much better crafting recipes.");
        ItemStack[] denseEssenceRecipe = {null, null, null, null, null, null, null, darkEssenceItemStack, darkEssenceItemStack};
        SlimefunItem denseEssenceItem = new SlimefunItem(category, denseEssenceItemStack, RecipeType.PRESSURE_CHAMBER, denseEssenceRecipe);

        denseEssenceItem.register(this);

        // Creating the element item.
        SlimefunItemStack elementItemStack = new SlimefunItemStack("ELEMENT_PIECE", Material.PRISMARINE_SHARD, "&1Element", "", "&9A malleable metal humming with energy. It is cold to the touch regardless of its actual temperature.");
        SlimefunItem elementItem = new SlimefunItem(category, elementItemStack, RecipeType.MOB_DROP, null);

        elementItem.register(this);

        // Creating the essence infused iron helmet.
        SlimefunItemStack essenceInfusedIronHelmetItemStack = new SlimefunItemStack("ESSENCE_INFUSED_IRON_HELMET", Material.IRON_HELMET, "&4&lEssence Infused Iron Helmet", "", "&cIron helmet infused with the severed intelligence of a corrupted being. Slowly heals its wearer.");
        ItemStack[] essenceInfusedIronHelmetRecipe = {darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, new ItemStack(Material.IRON_HELMET), darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack};
        SlimefunItem essenceInfusedIronHelmetItem = new SlimefunItem(category, essenceInfusedIronHelmetItemStack, RecipeType.MAGIC_WORKBENCH, essenceInfusedIronHelmetRecipe);

        essenceInfusedIronHelmetItem.register(this);

        // Creating the essence infused iron chestplate.
        SlimefunItemStack essenceInfusedIronChestplateItemStack = new SlimefunItemStack("ESSENCE_INFUSED_IRON_CHESTPLATE", Material.IRON_CHESTPLATE, "&4&lEssence Infused Iron Chestplate", "", "&cIron chestplate infused with the severed intelligence of a corrupted being. Slowly heals its wearer.");
        ItemStack[] essenceInfusedIronChestplateRecipe = {darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, new ItemStack(Material.IRON_CHESTPLATE), darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack};
        SlimefunItem essenceInfusedIronChestplateItem = new SlimefunItem(category, essenceInfusedIronChestplateItemStack, RecipeType.MAGIC_WORKBENCH, essenceInfusedIronChestplateRecipe);

        essenceInfusedIronChestplateItem.register(this);

        // Creating the essence infused iron leggings.
        SlimefunItemStack essenceInfusedIronLeggingsItemStack = new SlimefunItemStack("ESSENCE_INFUSED_IRON_LEGGINGS", Material.IRON_LEGGINGS, "&4&lEssence Infused Iron Leggings", "", "&cIron leggings infused with the severed intelligence of a corrupted being. Slowly heals its wearer.");
        ItemStack[] essenceInfusedIronLeggingsRecipe = {darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, new ItemStack(Material.IRON_LEGGINGS), darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack};
        SlimefunItem essenceInfusedIronLeggingsItem = new SlimefunItem(category, essenceInfusedIronLeggingsItemStack, RecipeType.MAGIC_WORKBENCH, essenceInfusedIronLeggingsRecipe);

        essenceInfusedIronLeggingsItem.register(this);

        // Creating the essence infused iron boots.
        SlimefunItemStack essenceInfusedIronBootsItemStack = new SlimefunItemStack("ESSENCE_INFUSED_IRON_BOOTS", Material.IRON_BOOTS, "&4&lEssence Infused Iron Boots", "", "&Iron boots infused with the severed intelligence of a corrupted being. Slowly heals its wearer.c");
        ItemStack[] essenceInfusedIronBootsRecipe = {darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, new ItemStack(Material.IRON_BOOTS), darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack, darkEssenceItemStack};
        SlimefunItem essenceInfusedIronBootsItem = new SlimefunItem(category, essenceInfusedIronBootsItemStack, RecipeType.MAGIC_WORKBENCH, essenceInfusedIronBootsRecipe);

        essenceInfusedIronBootsItem.register(this);

        // Creating the essence infused diamond helmet.
        SlimefunItemStack essenceInfusedDiamondHelmetItemStack = new SlimefunItemStack("ESSENCE_INFUSED_DIAMOND_HELMET", Material.DIAMOND_HELMET, "&4&lEssence Infused Diamond Helmet", "", "&cDiamond helmet infused with the compressed souls of corrupted beings. Slowly heals its wearer.");
        ItemStack[] essenceInfusedDiamondHelmetRecipe = {denseEssenceItemStack, denseEssenceItemStack, denseEssenceItemStack, null,  new ItemStack(Material.DIAMOND_HELMET), null, denseEssenceItemStack, denseEssenceItemStack, denseEssenceItemStack};
        SlimefunItem essenceInfusedDiamondHelmetItem = new SlimefunItem(category, essenceInfusedDiamondHelmetItemStack, RecipeType.MAGIC_WORKBENCH, essenceInfusedDiamondHelmetRecipe);

        essenceInfusedDiamondHelmetItem.register(this);

        // Creating the essence infused diamond chestplate.
        SlimefunItemStack essenceInfusedDiamondChestplateItemStack = new SlimefunItemStack("ESSENCE_INFUSED_DIAMOND_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "&4&lEssence Infused Diamond Chestplate", "", "&cDiamond chestplate infused with the compressed souls of corrupted beings. Slowly heals its wearer.");
        ItemStack[] essenceInfusedDiamondChestplateRecipe = {denseEssenceItemStack, denseEssenceItemStack, denseEssenceItemStack, null, new ItemStack(Material.DIAMOND_CHESTPLATE), null, denseEssenceItemStack, denseEssenceItemStack, denseEssenceItemStack};
        SlimefunItem essenceInfusedDiamondChestplateItem = new SlimefunItem(category, essenceInfusedDiamondChestplateItemStack, RecipeType.MAGIC_WORKBENCH, essenceInfusedDiamondChestplateRecipe);

        essenceInfusedDiamondChestplateItem.register(this);

        // Creating the essence infused diamond leggings.
        SlimefunItemStack essenceInfusedDiamondLeggingsItemStack = new SlimefunItemStack("ESSENCE_INFUSED_DIAMOND_LEGGINGS", Material.DIAMOND_LEGGINGS, "&4&lEssence Infused Diamond Leggings", "", "&cDiamond leggings infused with the compressed souls of corrupted beings. Slowly heals its wearer.");
        ItemStack[] essenceInfusedDiamondLeggingsRecipe = {denseEssenceItemStack, denseEssenceItemStack, denseEssenceItemStack, null, new ItemStack(Material.DIAMOND_LEGGINGS), null, denseEssenceItemStack, denseEssenceItemStack, denseEssenceItemStack};
        SlimefunItem essenceInfusedDiamondLeggingsItem = new SlimefunItem(category, essenceInfusedDiamondLeggingsItemStack, RecipeType.MAGIC_WORKBENCH, essenceInfusedDiamondLeggingsRecipe);

        essenceInfusedDiamondLeggingsItem.register(this);

        // Creating the essence infused diamond boots.
        SlimefunItemStack essenceInfusedDiamondBootsItemStack = new SlimefunItemStack("ESSENCE_INFUSED_DIAMOND_BOOTS", Material.DIAMOND_BOOTS, "&4&lEssence Infused Diamond Boots", "", "&cDiamond boots infused with the compressed souls of corrupted beings. Slowly heals its wearer.");
        ItemStack[] essenceInfusedDiamondBootsRecipe = {denseEssenceItemStack, denseEssenceItemStack, denseEssenceItemStack, null, new ItemStack(Material.DIAMOND_BOOTS), null, denseEssenceItemStack, denseEssenceItemStack, denseEssenceItemStack};
        SlimefunItem essenceInfusedDiamondBootsItem = new SlimefunItem(category, essenceInfusedDiamondBootsItemStack, RecipeType.MAGIC_WORKBENCH, essenceInfusedDiamondBootsRecipe);

        essenceInfusedDiamondBootsItem.register(this);

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
