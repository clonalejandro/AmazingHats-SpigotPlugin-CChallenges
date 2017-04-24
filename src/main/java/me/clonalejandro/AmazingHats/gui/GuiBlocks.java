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
    public void Grass() {

        ItemStack grass = new ItemStack(Material.GRASS, 1);

        String description = plugin.getConfig().getString("Grass.Description");
        String name = plugin.getConfig().getString("Grass.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta grassMeta = grass.getItemMeta();

        lore.add(translator(description));

        grassMeta.setDisplayName(translator(name));
        grassMeta.setLore(lore);


        grass.setItemMeta(grassMeta);

        //TODO: action
    }


    @Override
    public void Stone() {

        ItemStack stone = new ItemStack(Material.STONE, 1);

        String description = plugin.getConfig().getString("Stone.Description");
        String name = plugin.getConfig().getString("Stone.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta stoneMeta = stone.getItemMeta();

        lore.add(translator(description));

        stoneMeta.setDisplayName(translator(name));
        stoneMeta.setLore(lore);


        stone.setItemMeta(stoneMeta);

        //TODO: action
    }


    @Override
    public void Diamond_Block() {

        ItemStack diamondblock = new ItemStack(Material.DIAMOND_BLOCK, 1);

        String description = plugin.getConfig().getString("Diamond_Block.Description");
        String name = plugin.getConfig().getString("Diamond_Block.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta diamondblockMeta = diamondblock.getItemMeta();

        lore.add(translator(description));

        diamondblockMeta.setDisplayName(translator(name));
        diamondblockMeta.setLore(lore);


        diamondblock.setItemMeta(diamondblockMeta);

        //TODO: action
    }


    @Override
    public void Gold_Block() {

        ItemStack goldblock = new ItemStack(Material.GOLD_BLOCK, 1);

        String description = plugin.getConfig().getString("Gold_Block.Description");
        String name = plugin.getConfig().getString("Gold_Block.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta goldblockMeta = goldblock.getItemMeta();

        lore.add(translator(description));

        goldblockMeta.setDisplayName(translator(name));
        goldblockMeta.setLore(lore);

        goldblock.setItemMeta(goldblockMeta);

        //TODO: action
    }


    @Override
    public void Iron_Block() {

        ItemStack ironblock = new ItemStack(Material.IRON_BLOCK, 1);

        String description = plugin.getConfig().getString("Iron_Block.Description");
        String name = plugin.getConfig().getString("Iron_Block.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta ironblockMeta = ironblock.getItemMeta();

        lore.add(translator(description));

        ironblockMeta.setDisplayName(translator(name));
        ironblockMeta.setLore(lore);

        ironblock.setItemMeta(ironblockMeta);

        //TODO: action
    }


    @Override
    public void Emerald_Block() {

        ItemStack emeraldblock = new ItemStack(Material.EMERALD_BLOCK, 1);

        String description = plugin.getConfig().getString("Emerald_Block.Description");
        String name = plugin.getConfig().getString("Emerald_Block.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta emeralblockMeta = emeraldblock.getItemMeta();

        lore.add(translator(description));

        emeralblockMeta.setDisplayName(translator(name));
        emeralblockMeta.setLore(lore);

        emeraldblock.setItemMeta(emeralblockMeta);

        //TODO: action
    }


    @Override
    public void Beacon() {

        ItemStack beacon = new ItemStack(Material.BEACON, 1);

        String description = plugin.getConfig().getString("Beacon.Description");
        String name = plugin.getConfig().getString("Beacon.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta beaconMeta = beacon.getItemMeta();

        lore.add(translator(description));

        beaconMeta.setDisplayName(translator(name));
        beaconMeta.setLore(lore);

        beacon.setItemMeta(beaconMeta);

        //TODO: action
    }

    @Override
    public void Diamond_Ore() {

        ItemStack diamondore = new ItemStack(Material.DIAMOND_ORE, 1);

        String description = plugin.getConfig().getString("Diamond_Ore.Description");
        String name = plugin.getConfig().getString("Diamond_Ore.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta diamondoreMeta = diamondore.getItemMeta();

        lore.add(translator(description));

        diamondoreMeta.setDisplayName(translator(name));
        diamondoreMeta.setLore(lore);

        diamondore.setItemMeta(diamondoreMeta);

        //TODO: action
    }

    @Override
    public void Gold_Ore() {

        ItemStack goldore = new ItemStack(Material.GOLD_ORE, 1);

        String description = plugin.getConfig().getString("Gold_Ore.Description");
        String name = plugin.getConfig().getString("Gold_Ore.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta goldoreMeta = goldore.getItemMeta();

        lore.add(translator(description));

        goldoreMeta.setDisplayName(translator(name));
        goldoreMeta.setLore(lore);

        goldore.setItemMeta(goldoreMeta);

        //TODO: action
    }


    @Override
    public void Iron_Ore() {

        ItemStack ironore = new ItemStack(Material.IRON_ORE, 1);

        String description = plugin.getConfig().getString("Iron_Ore.Description");
        String name = plugin.getConfig().getString("Iron_Ore.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta ironoreMeta = ironore.getItemMeta();

        lore.add(translator(description));

        ironoreMeta.setDisplayName(translator(name));
        ironoreMeta.setLore(lore);

        ironore.setItemMeta(ironoreMeta);

        //TODO: action
    }


    @Override
    public void Emerald_Ore() {

        ItemStack emeraldore = new ItemStack(Material.EMERALD_ORE, 1);

        String description = plugin.getConfig().getString("Emerald_Ore.Description");
        String name = plugin.getConfig().getString("Emerald_Ore.Name");

        List<String> lore = new ArrayList<>();

        ItemMeta emeraldoreMeta = emeraldore.getItemMeta();

        lore.add(translator(description));

        emeraldoreMeta.setDisplayName(translator(name));
        emeraldoreMeta.setLore(lore);

        emeraldore.setItemMeta(emeraldoreMeta);

        //TODO: action
    }


    @Override
    public void Redstone_Block() {

        ItemStack redstoneblock = new ItemStack(Material.REDSTONE_BLOCK, 1);

        String description = plugin.getConfig().getString("Redstone_Block.Description");
        String name = plugin.getConfig().getString("Redstone_Block.Name");

        ItemMeta redstoneblockMeta = redstoneblock.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        redstoneblockMeta.setDisplayName(translator(name));
        redstoneblockMeta.setLore(lore);

        redstoneblock.setItemMeta(redstoneblockMeta);

        //TODO: action
    }


    @Override
    public void Lapis_Block() {

        ItemStack lapisblock = new ItemStack(Material.LAPIS_BLOCK, 1);

        String description = plugin.getConfig().getString("Lapis_Block.Description");
        String name = plugin.getConfig().getString("Lapis_Block.Name");

        ItemMeta lapisblockMeta = lapisblock.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        lapisblockMeta.setDisplayName(translator(name));
        lapisblockMeta.setLore(lore);

        lapisblock.setItemMeta(lapisblockMeta);

        //TODO: action
    }


    @Override
    public void Lapis_Ore() {

        ItemStack lapisore = new ItemStack(Material.LAPIS_ORE, 1);

        String description = plugin.getConfig().getString("Lapis_Ore.Description");
        String name = plugin.getConfig().getString("Lapis_Ore.Name");

        ItemMeta lapisoreMeta = lapisore.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        lapisoreMeta.setDisplayName(translator(name));
        lapisoreMeta.setLore(lore);

        lapisore.setItemMeta(lapisoreMeta);

        //TODO: action
    }


    @Override
    public void Redstone_Ore() {

        ItemStack redstoneore = new ItemStack(Material.REDSTONE_ORE, 1);

        String description = plugin.getConfig().getString("Redstone_Ore.Description");
        String name = plugin.getConfig().getString("Redstone_Ore.Name");

        ItemMeta redstoneoreMeta = redstoneore.getItemMeta();

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        redstoneoreMeta.setDisplayName(translator(name));
        redstoneoreMeta.setLore(lore);

        redstoneore.setItemMeta(redstoneoreMeta);

        //TODO: action
    }


    @Override
    public void Command_Block() {

    }

    @Override
    public void Glass() {

    }

    @Override
    public void Spawner() {

    }

    @Override
    public void Anvil() {

    }

    @Override
    public void Obsidian() {

    }

    @Override
    public void Piston() {

    }

    @Override
    public void TNT() {

    }

    @Override
    public void Wool() {

    }

    @Override
    public void Red_Wool() {

    }

    @Override
    public void Blue_Wool() {

    }

    @Override
    public void Cyan_Wool() {

    }

    @Override
    public void Purple_Wool() {

    }

    @Override
    public void Green_Wool() {

    }

    @Override
    public void Orange_Wool() {

    }

    @Override
    public void Yellow_Wool() {

    }

    @Override
    public void Gray_Wool() {

    }

    @Override
    public void DarkRed_Wool() {

    }

    @Override
    public void DarkBlue_Wool() {

    }

    @Override
    public void DarkPurple_Wool() {

    }

    @Override
    public void DarkGreen_Wool() {

    }

    @Override
    public void DarkGray_Wool() {

    }

    @Override
    public void Black_Wool() {

    }

    @Override
    public void Cactus() {

    }

    @Override
    public void Sand() {

    }

    @Override
    public void Crafting_Table() {

    }

    @Override
    public void Enchanting_Table() {

    }

    @Override
    public void Chest() {

    }

    @Override
    public void Enderchest() {

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