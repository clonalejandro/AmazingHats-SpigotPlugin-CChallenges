package me.clonalejandro.AmazingHats.hats.blocks;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

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

public enum BlockHat {

    /** ENUM **/

    Grass(new ItemStack(Material.GRASS, 1)),
    Stone(new ItemStack(Material.STONE, 1)),
    Diamond_Block(new ItemStack(Material.DIAMOND_BLOCK, 1)),
    Gold_Block(new ItemStack(Material.GOLD_BLOCK, 1)),
    Iron_Block(new ItemStack(Material.GOLD_BLOCK, 1)),
    Emerald_Block(new ItemStack(Material.EMERALD_BLOCK, 1)),
    Beacon(new ItemStack(Material.EMERALD_BLOCK, 1)),
    Diamond_Ore(new ItemStack(Material.DIAMOND_ORE, 1)),
    Gold_Ore(new ItemStack(Material.GOLD_ORE, 1)),
    Iron_Ore(new ItemStack(Material.GOLD_ORE, 1)),
    Emerald_Ore(new ItemStack(Material.EMERALD_ORE, 1)),
    Redstone_Block(new ItemStack(Material.REDSTONE_BLOCK, 1)),
    Lapis_Block(new ItemStack(Material.LAPIS_BLOCK, 1)),
    Lapis_Ore(new ItemStack(Material.LAPIS_ORE, 1)),
    Redstone_Ore(new ItemStack(Material.REDSTONE_ORE, 1)),
    Command_Block(new ItemStack(Material.COMMAND, 1)),
    Glass(new ItemStack(Material.GLASS, 1)),
    Spawner(new ItemStack(Material.MOB_SPAWNER, 1)),
    Anvil(new ItemStack(Material.ANVIL, 1)),
    Obsidian(new ItemStack(Material.OBSIDIAN, 1)),
    Piston(new ItemStack(Material.PISTON_BASE, 1)),
    TNT(new ItemStack(Material.TNT, 1)),
    Wool(new ItemStack(Material.WOOL, 1)),
    Red_Wool(new ItemStack(Material.WOOL, 1, (short) 6)),
    Blue_Wool(new ItemStack(Material.WOOL, 1, (short) 3)),
    Cyan_Wool(new ItemStack(Material.WOOL, 1, (short) 9)),
    Purple_Wool(new ItemStack(Material.WOOL, 1, (short) 2)),
    Green_Wool(new ItemStack(Material.WOOL, 1, (short) 5)),
    Orange_Wool(new ItemStack(Material.WOOL, 1, (short) 1)),
    Yellow_Wool(new ItemStack(Material.WOOL, 1, (short) 4)),
    Gray_Wool(new ItemStack(Material.WOOL, 1, (short) 8)),
    DarkRed_Wool(new ItemStack(Material.WOOL, 1, (short) 14)),
    DarkBlue_Wool(new ItemStack(Material.WOOL, 1, (short) 11)),
    DarkPurple_Wool(new ItemStack(Material.WOOL, 1, (short) 10)),
    DarkGreen_Wool(new ItemStack(Material.WOOL, 1, (short) 13)),
    DarkGray_Wool(new ItemStack(Material.WOOL, 1, (short) 7)),
    Black_Wool(new ItemStack(Material.WOOL, 1, (short) 15)),
    Cactus(new ItemStack(Material.CACTUS, 1)),
    Sand(new ItemStack(Material.SAND, 1)),
    Crafting_Table(new ItemStack(Material.WORKBENCH, 1)),
    Enchanting_Table(new ItemStack(Material.ENCHANTMENT_TABLE, 1)),
    Chest(new ItemStack(Material.CHEST, 1)),
    Enderchest(new ItemStack(Material.ENDER_CHEST, 1));


    /** SMALL CONSTRUCTORS **/

    private ItemStack item;

    BlockHat(ItemStack stack) {
        this.item = stack;
    }

    public ItemStack getHat(){
        return this.item;
    }
}
