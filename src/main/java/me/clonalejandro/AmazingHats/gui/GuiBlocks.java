package me.clonalejandro.AmazingHats.gui;

import me.clonalejandro.AmazingHats.Main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alejandrorioscalera
 * On 24/4/17
 *
 * -- SOCIAL NETWORKS --
 *
 * GitHub: https://github.com/clonalejandro or @clonalejandro
 * Website: https://clonalejandro.me/
 * Twitter: https://twitter.com/clonalejandro11/ or @clonalejandro11
 * Keybase: https://keybase.io/clonalejandro/
 *
 * -- LICENSE --
 *
 * All rights reserved for clonalejandro ©AmazingHats 2017 / 2018
 */

public class GuiBlocks implements BlocksInter{


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public GuiBlocks(Main instance){
        plugin = instance;
    }


    /** REST **/

    @Override
    public ItemStack Grass() {

        ItemStack grass = new ItemStack(Material.GRASS, 1);

        String description = plugin.getConfig().getString("Grass.Description");
        String name = plugin.getConfig().getString("Grass.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta grassMeta = grass.getItemMeta();

        lore.add(translator(description));

        grassMeta.setDisplayName(translator(name));
        grassMeta.setLore(lore);


       grass.setItemMeta(grassMeta);

       return grass;
    }


    @Override
    public ItemStack Stone() {

        ItemStack stone = new ItemStack(Material.STONE, 1);

        String description = plugin.getConfig().getString("Stone.Description");
        String name = plugin.getConfig().getString("Stone.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta stoneMeta = stone.getItemMeta();

        lore.add(translator(description));

        stoneMeta.setDisplayName(translator(name));
        stoneMeta.setLore(lore);


        stone.setItemMeta(stoneMeta);

        return stone;
    }


    @Override
    public ItemStack Diamond_Block() {

        ItemStack diamondblock = new ItemStack(Material.DIAMOND_BLOCK, 1);

        String description = plugin.getConfig().getString("Diamond_Block.Description");
        String name = plugin.getConfig().getString("Diamond_Block.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta diamondblockMeta = diamondblock.getItemMeta();

        lore.add(translator(description));

        diamondblockMeta.setDisplayName(translator(name));
        diamondblockMeta.setLore(lore);


        diamondblock.setItemMeta(diamondblockMeta);

        return diamondblock;
    }


    @Override
    public ItemStack Gold_Block() {

        ItemStack goldblock = new ItemStack(Material.GOLD_BLOCK, 1);

        String description = plugin.getConfig().getString("Gold_Block.Description");
        String name = plugin.getConfig().getString("Gold_Block.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta goldblockMeta = goldblock.getItemMeta();

        lore.add(translator(description));

        goldblockMeta.setDisplayName(translator(name));
        goldblockMeta.setLore(lore);

        goldblock.setItemMeta(goldblockMeta);

        return goldblock;
    }


    @Override
    public ItemStack Iron_Block() {

        ItemStack ironblock = new ItemStack(Material.IRON_BLOCK, 1);

        String description = plugin.getConfig().getString("Iron_Block.Description");
        String name = plugin.getConfig().getString("Iron_Block.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta ironblockMeta = ironblock.getItemMeta();

        lore.add(translator(description));

        ironblockMeta.setDisplayName(translator(name));
        ironblockMeta.setLore(lore);

        ironblock.setItemMeta(ironblockMeta);

        return ironblock;
    }


    @Override
    public ItemStack Emerald_Block() {

        ItemStack emeraldblock = new ItemStack(Material.EMERALD_BLOCK, 1);

        String description = plugin.getConfig().getString("Emerald_Block.Description");
        String name = plugin.getConfig().getString("Emerald_Block.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta emeralblockMeta = emeraldblock.getItemMeta();

        lore.add(translator(description));

        emeralblockMeta.setDisplayName(translator(name));
        emeralblockMeta.setLore(lore);

        emeraldblock.setItemMeta(emeralblockMeta);

        return emeraldblock;
    }


    @Override
    public ItemStack Beacon() {

        ItemStack beacon = new ItemStack(Material.BEACON, 1);

        String description = plugin.getConfig().getString("Beacon.Description");
        String name = plugin.getConfig().getString("Beacon.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta beaconMeta = beacon.getItemMeta();

        lore.add(translator(description));

        beaconMeta.setDisplayName(translator(name));
        beaconMeta.setLore(lore);

        beacon.setItemMeta(beaconMeta);

        return beacon;
    }


    @Override
    public ItemStack Diamond_Ore() {

        ItemStack diamondore = new ItemStack(Material.DIAMOND_ORE, 1);

        String description = plugin.getConfig().getString("Diamond_Ore.Description");
        String name = plugin.getConfig().getString("Diamond_Ore.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta diamondoreMeta = diamondore.getItemMeta();

        lore.add(translator(description));

        diamondoreMeta.setDisplayName(translator(name));
        diamondoreMeta.setLore(lore);

        diamondore.setItemMeta(diamondoreMeta);

        return diamondore;
    }


    @Override
    public ItemStack Gold_Ore() {

        ItemStack goldore = new ItemStack(Material.GOLD_ORE, 1);

        String description = plugin.getConfig().getString("Gold_Ore.Description");
        String name = plugin.getConfig().getString("Gold_Ore.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta goldoreMeta = goldore.getItemMeta();

        lore.add(translator(description));

        goldoreMeta.setDisplayName(translator(name));
        goldoreMeta.setLore(lore);

        goldore.setItemMeta(goldoreMeta);

        return goldore;
    }


    @Override
    public ItemStack Iron_Ore() {

        ItemStack ironore = new ItemStack(Material.IRON_ORE, 1);

        String description = plugin.getConfig().getString("Iron_Ore.Description");
        String name = plugin.getConfig().getString("Iron_Ore.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta ironoreMeta = ironore.getItemMeta();

        lore.add(translator(description));

        ironoreMeta.setDisplayName(translator(name));
        ironoreMeta.setLore(lore);

        ironore.setItemMeta(ironoreMeta);

        return ironore;
    }


    @Override
    public ItemStack Emerald_Ore() {

        ItemStack emeraldore = new ItemStack(Material.EMERALD_ORE, 1);

        String description = plugin.getConfig().getString("Emerald_Ore.Description");
        String name = plugin.getConfig().getString("Emerald_Ore.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta emeraldoreMeta = emeraldore.getItemMeta();

        lore.add(translator(description));

        emeraldoreMeta.setDisplayName(translator(name));
        emeraldoreMeta.setLore(lore);

        emeraldore.setItemMeta(emeraldoreMeta);

        return emeraldore;
    }


    @Override
    public ItemStack Redstone_Block() {

        ItemStack redstoneblock = new ItemStack(Material.REDSTONE_BLOCK, 1);

        String description = plugin.getConfig().getString("Redstone_Block.Description");
        String name = plugin.getConfig().getString("Redstone_Block.Name");

        ItemMeta redstoneblockMeta = redstoneblock.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        redstoneblockMeta.setDisplayName(translator(name));
        redstoneblockMeta.setLore(lore);

        redstoneblock.setItemMeta(redstoneblockMeta);

        return redstoneblock;
    }


    @Override
    public ItemStack Lapis_Block() {

        ItemStack lapisblock = new ItemStack(Material.LAPIS_BLOCK, 1);

        String description = plugin.getConfig().getString("Lapis_Block.Description");
        String name = plugin.getConfig().getString("Lapis_Block.Name");

        ItemMeta lapisblockMeta = lapisblock.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        lapisblockMeta.setDisplayName(translator(name));
        lapisblockMeta.setLore(lore);

        lapisblock.setItemMeta(lapisblockMeta);

        return lapisblock;
    }


    @Override
    public ItemStack Lapis_Ore() {

        ItemStack lapisore = new ItemStack(Material.LAPIS_ORE, 1);

        String description = plugin.getConfig().getString("Lapis_Ore.Description");
        String name = plugin.getConfig().getString("Lapis_Ore.Name");

        ItemMeta lapisoreMeta = lapisore.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        lapisoreMeta.setDisplayName(translator(name));
        lapisoreMeta.setLore(lore);

        lapisore.setItemMeta(lapisoreMeta);

        return lapisore;
    }


    @Override
    public ItemStack Redstone_Ore() {

        ItemStack redstoneore = new ItemStack(Material.REDSTONE_ORE, 1);

        String description = plugin.getConfig().getString("Redstone_Ore.Description");
        String name = plugin.getConfig().getString("Redstone_Ore.Name");

        ItemMeta redstoneoreMeta = redstoneore.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        redstoneoreMeta.setDisplayName(translator(name));
        redstoneoreMeta.setLore(lore);

        redstoneore.setItemMeta(redstoneoreMeta);

        return redstoneore;
    }


    @Override
    public ItemStack Command_Block() {

        ItemStack commandblock = new ItemStack(Material.COMMAND, 1);

        String description = plugin.getConfig().getString("Command_Block.Description");
        String name = plugin.getConfig().getString("Command_Block.Name");

        ItemMeta commandblockMeta = commandblock.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        commandblockMeta.setDisplayName(translator(name));
        commandblockMeta.setLore(lore);

        commandblock.setItemMeta(commandblockMeta);

        return commandblock;
    }


    @Override
    public ItemStack Glass() {

        ItemStack glass = new ItemStack(Material.GLASS, 1);

        String description = plugin.getConfig().getString("Glass.Description");
        String name = plugin.getConfig().getString("Glass.Name");

        ItemMeta glassMeta = glass.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        glassMeta.setDisplayName(translator(name));
        glassMeta.setLore(lore);

        glass.setItemMeta(glassMeta);

        return glass;
    }


    @Override
    public ItemStack Spawner() {

        ItemStack spawner = new ItemStack(Material.MOB_SPAWNER, 1);

        String description = plugin.getConfig().getString("Spawner.Description");
        String name = plugin.getConfig().getString("Spawner.Name");

        ItemMeta spawnerMeta = spawner.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        spawnerMeta.setDisplayName(translator(name));
        spawnerMeta.setLore(lore);

        spawner.setItemMeta(spawnerMeta);

        return spawner;
    }


    @Override
    public ItemStack Anvil() {

        ItemStack anvil = new ItemStack(Material.ANVIL, 1);

        String description = plugin.getConfig().getString("Anvil.Description");
        String name = plugin.getConfig().getString("Anvil.Name");

        ItemMeta anvilMeta = anvil.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        anvilMeta.setDisplayName(translator(name));
        anvilMeta.setLore(lore);

        anvil.setItemMeta(anvilMeta);

        return anvil;
    }


    @Override
    public ItemStack Obsidian() {

        ItemStack obsidian = new ItemStack(Material.OBSIDIAN, 1);

        String description = plugin.getConfig().getString("Obsidian.Description");
        String name = plugin.getConfig().getString("Obsidian.Name");

        ItemMeta obsidianMeta = obsidian.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        obsidianMeta.setDisplayName(translator(name));
        obsidianMeta.setLore(lore);

        obsidian.setItemMeta(obsidianMeta);

        return obsidian;
    }


    @Override
    public ItemStack Piston() {

        ItemStack piston = new ItemStack(Material.PISTON_STICKY_BASE, 1);

        String description = plugin.getConfig().getString("Piston.Description");
        String name = plugin.getConfig().getString("Piston.Name");

        ItemMeta pistonMeta = piston.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        pistonMeta.setDisplayName(translator(name));
        pistonMeta.setLore(lore);

        piston.setItemMeta(pistonMeta);

        return piston;
    }


    @Override
    public ItemStack TNT() {

        ItemStack tnt = new ItemStack(Material.TNT, 1);

        String description = plugin.getConfig().getString("TNT.Description");
        String name = plugin.getConfig().getString("TNT.Name");

        ItemMeta tntMeta = tnt.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        tntMeta.setDisplayName(translator(name));
        tntMeta.setLore(lore);

        tnt.setItemMeta(tntMeta);

        return tnt;
    }


    @Override
    public ItemStack Wool() {

        ItemStack wool = new ItemStack(Material.WOOL, 1);

        String description = plugin.getConfig().getString("Wool.Description");
        String name = plugin.getConfig().getString("Wool.Name");

        ItemMeta woolMeta = wool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        woolMeta.setDisplayName(translator(name));
        woolMeta.setLore(lore);

        wool.setItemMeta(woolMeta);

        return wool;
    }

    
    @Override
    public ItemStack Red_Wool() {

        ItemStack redwool = new ItemStack(Material.WOOL, 1, (short) 6);

        String description = plugin.getConfig().getString("Red_Wool.Description");
        String name = plugin.getConfig().getString("Red_Wool.Name");

        ItemMeta redwoolMeta = redwool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        redwoolMeta.setDisplayName(translator(name));
        redwoolMeta.setLore(lore);

        redwool.setItemMeta(redwoolMeta);

        return redwool;
    }


    @Override
    public ItemStack Blue_Wool() {

        ItemStack bluewool = new ItemStack(Material.WOOL, 1, (short) 3);

        String description = plugin.getConfig().getString("Blue_Wool.Description");
        String name = plugin.getConfig().getString("Blue_Wool.Name");

        ItemMeta bluewoolMeta = bluewool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        bluewoolMeta.setDisplayName(translator(name));
        bluewoolMeta.setLore(lore);

        bluewool.setItemMeta(bluewoolMeta);

        return bluewool;
    }


    @Override
    public ItemStack Cyan_Wool() {

        ItemStack cyanwool = new ItemStack(Material.WOOL, 1, (short) 9);

        String description = plugin.getConfig().getString("Cyan_Wool.Description");
        String name = plugin.getConfig().getString("Cyan_Wool.Name");

        ItemMeta cyanwoolMeta = cyanwool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        cyanwoolMeta.setDisplayName(translator(name));
        cyanwoolMeta.setLore(lore);

        cyanwool.setItemMeta(cyanwoolMeta);

        return cyanwool;
    }


    @Override
    public ItemStack Purple_Wool() {

        ItemStack purplewool = new ItemStack(Material.WOOL, 1, (short) 2);

        String description = plugin.getConfig().getString("Purple_Wool.Description");
        String name = plugin.getConfig().getString("Purple_Wool.Name");

        ItemMeta purplewoolMeta = purplewool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        purplewoolMeta.setDisplayName(translator(name));
        purplewoolMeta.setLore(lore);

        purplewool.setItemMeta(purplewoolMeta);

        return purplewool;
    }


    @Override
    public ItemStack Green_Wool() {

        ItemStack greenwool = new ItemStack(Material.WOOL, 1, (short) 5);

        String description = plugin.getConfig().getString("Green_Wool.Description");
        String name = plugin.getConfig().getString("Green_Wool.Name");

        ItemMeta greenwoolMeta = greenwool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        greenwoolMeta.setDisplayName(translator(name));
        greenwoolMeta.setLore(lore);

        greenwool.setItemMeta(greenwoolMeta);

        return greenwool;
    }


    @Override
    public ItemStack Orange_Wool() {

        ItemStack orangewool = new ItemStack(Material.WOOL, 1, (short) 1);

        String description = plugin.getConfig().getString("Orange_Wool.Description");
        String name = plugin.getConfig().getString("Orange_Wool.Name");

        ItemMeta orangewoolMeta = orangewool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        orangewoolMeta.setDisplayName(translator(name));
        orangewoolMeta.setLore(lore);

        orangewool.setItemMeta(orangewoolMeta);

        return orangewool;
    }


    @Override
    public ItemStack Yellow_Wool() {

        ItemStack yellowwool = new ItemStack(Material.WOOL, 1, (short) 4);

        String description = plugin.getConfig().getString("Yellow_Wool.Description");
        String name = plugin.getConfig().getString("Yellow_Wool.Name");

        ItemMeta yellowwoolMeta = yellowwool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        yellowwoolMeta.setDisplayName(translator(name));
        yellowwoolMeta.setLore(lore);

        yellowwool.setItemMeta(yellowwoolMeta);

        return yellowwool;
    }


    @Override
    public ItemStack Gray_Wool() {

        ItemStack graywool = new ItemStack(Material.WOOL, 1, (short) 8);

        String description = plugin.getConfig().getString("Gray_Wool.Description");
        String name = plugin.getConfig().getString("Gray_Wool.Name");

        ItemMeta graywoolMeta = graywool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        graywoolMeta.setDisplayName(translator(name));
        graywoolMeta.setLore(lore);

        graywool.setItemMeta(graywoolMeta);

        return graywool;
    }


    @Override
    public ItemStack DarkRed_Wool() {

        ItemStack darkredwool = new ItemStack(Material.WOOL, 1, (short) 14);

        String description = plugin.getConfig().getString("DarkRed_Wool.Description");
        String name = plugin.getConfig().getString("DarkRed_Wool.Name");

        ItemMeta darkredwoolMeta = darkredwool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        darkredwoolMeta.setDisplayName(translator(name));
        darkredwoolMeta.setLore(lore);

        darkredwool.setItemMeta(darkredwoolMeta);

        return darkredwool;
    }


    @Override
    public ItemStack DarkBlue_Wool() {

        ItemStack darkbluewool = new ItemStack(Material.WOOL, 1, (short) 11);

        String description = plugin.getConfig().getString("DarkBlue_Wool.Description");
        String name = plugin.getConfig().getString("DarkBlue_Wool.Name");

        ItemMeta darkbluewoolMeta = darkbluewool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        darkbluewoolMeta.setDisplayName(translator(name));
        darkbluewoolMeta.setLore(lore);

        darkbluewool.setItemMeta(darkbluewoolMeta);

        return darkbluewool;
    }


    @Override
    public ItemStack DarkPurple_Wool() {

        ItemStack darkpurplewool = new ItemStack(Material.WOOL, 1, (short) 10);

        String description = plugin.getConfig().getString("DarkPurple_Wool.Description");
        String name = plugin.getConfig().getString("DarkPurple_Wool.Name");

        ItemMeta darkpurpleMeta = darkpurplewool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        darkpurpleMeta.setDisplayName(translator(name));
        darkpurpleMeta.setLore(lore);

        darkpurplewool.setItemMeta(darkpurpleMeta);

        return darkpurplewool;
    }


    @Override
    public ItemStack DarkGreen_Wool() {

        ItemStack darkgreenwool = new ItemStack(Material.WOOL, 1, (short) 13);

        String description = plugin.getConfig().getString("DarkGreen_Wool.Description");
        String name = plugin.getConfig().getString("DarkGreen_Wool.Name");

        ItemMeta darkgreenwoolMeta = darkgreenwool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        darkgreenwoolMeta.setDisplayName(translator(name));
        darkgreenwoolMeta.setLore(lore);

        darkgreenwool.setItemMeta(darkgreenwoolMeta);

        return darkgreenwool;
    }


    @Override
    public ItemStack DarkGray_Wool() {

        ItemStack darkgraywool = new ItemStack(Material.WOOL, 1, (short) 7);

        String description = plugin.getConfig().getString("DarkGray_Wool.Description");
        String name = plugin.getConfig().getString("DarkGray_Wool.Name");

        ItemMeta darkgraywoolMeta = darkgraywool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        darkgraywoolMeta.setDisplayName(translator(name));
        darkgraywoolMeta.setLore(lore);

        darkgraywool.setItemMeta(darkgraywoolMeta);

        return darkgraywool;
    }


    @Override
    public ItemStack Black_Wool() {

        ItemStack blackwool = new ItemStack(Material.WOOL, 1, (short) 15);

        String description = plugin.getConfig().getString("Black_Wool.Description");
        String name = plugin.getConfig().getString("Black_Wool.Name");

        ItemMeta blackwoolMeta = blackwool.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        blackwoolMeta.setDisplayName(translator(name));
        blackwoolMeta.setLore(lore);

        blackwool.setItemMeta(blackwoolMeta);

        return blackwool;
    }


    @Override
    public ItemStack Cactus() {

        ItemStack cactus = new ItemStack(Material.CACTUS, 1);

        String description = plugin.getConfig().getString("Cactus.Description");
        String name = plugin.getConfig().getString("Cactus.Name");

        ItemMeta cactusMeta = cactus.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        cactusMeta.setDisplayName(translator(name));
        cactusMeta.setLore(lore);

        cactus.setItemMeta(cactusMeta);

        return cactus;
    }


    @Override
    public ItemStack Sand() {

        ItemStack sand = new ItemStack(Material.SAND, 1);

        String description = plugin.getConfig().getString("Sand.Description");
        String name = plugin.getConfig().getString("Sand.Name");

        ItemMeta sandMeta = sand.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        sandMeta.setDisplayName(translator(name));
        sandMeta.setLore(lore);

        sand.setItemMeta(sandMeta);

        return sand;
    }


    @Override
    public ItemStack Crafting_Table() {

        ItemStack craftingtable = new ItemStack(Material.WORKBENCH, 1);

        String description = plugin.getConfig().getString("Crafting_table.Description");
        String name = plugin.getConfig().getString("Crafting_table.Name");

        ItemMeta craftingtableMeta = craftingtable.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        craftingtableMeta.setDisplayName(translator(name));
        craftingtableMeta.setLore(lore);

        craftingtable.setItemMeta(craftingtableMeta);

        return craftingtable;
    }


    @Override
    public ItemStack Enchanting_Table() {

        ItemStack enchantingtable = new ItemStack(Material.ENCHANTMENT_TABLE, 1);

        String description = plugin.getConfig().getString("Enchanting_table.Description");
        String name = plugin.getConfig().getString("Enchanting_table.Name");

        ItemMeta enchantingtableMeta = enchantingtable.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        enchantingtableMeta.setDisplayName(translator(name));
        enchantingtableMeta.setLore(lore);

        enchantingtable.setItemMeta(enchantingtableMeta);

        return enchantingtable;
    }


    @Override
    public ItemStack Chest() {

        ItemStack chest = new ItemStack(Material.CHEST, 1);

        String description = plugin.getConfig().getString("Chest.Description");
        String name = plugin.getConfig().getString("Chest.Name");

        ItemMeta chestMeta = chest.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        chestMeta.setDisplayName(translator(name));
        chestMeta.setLore(lore);

        chest.setItemMeta(chestMeta);

        return chest;
    }


    @Override
    public ItemStack Enderchest() {

        ItemStack enderchest = new ItemStack(Material.ENDER_CHEST, 1);

        String description = plugin.getConfig().getString("Enderchest.Description");
        String name = plugin.getConfig().getString("Enderchest.Name");

        ItemMeta enderchestMeta = enderchest.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        enderchestMeta.setDisplayName(translator(name));
        enderchestMeta.setLore(lore);

        enderchest.setItemMeta(enderchestMeta);

        return enderchest;
    }


    @Override
    public ItemStack Arrow(){

        ItemStack arrow = new ItemStack(Material.ARROW, 1);

        String description = "&fNext &epage";
        String name = "&6Next page";

        ItemMeta arrowMeta = arrow.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        arrowMeta.setDisplayName(translator(name));
        arrowMeta.setLore(lore);

        arrow.setItemMeta(arrowMeta);

        return arrow;
    }

    /** OTHERS **/

    /**
     *
     * @param text
     * @return
     */

    private String translator(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }


}