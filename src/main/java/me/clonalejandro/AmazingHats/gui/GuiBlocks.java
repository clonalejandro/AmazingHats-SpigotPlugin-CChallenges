package me.clonalejandro.AmazingHats.gui;

import me.clonalejandro.AmazingHats.Main;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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
        ItemMeta grassMeta = grass.getItemMeta();

        grassMeta.setDisplayName(translator("&eGrass &aHat"));
    }

    @Override
    public void Stone() {

    }

    @Override
    public void Diamond_Block() {

    }

    @Override
    public void Gold_Block() {

    }

    @Override
    public void Iron_Block() {

    }

    @Override
    public void Emerald_Block() {

    }

    @Override
    public void Beacon() {

    }

    @Override
    public void Diamond_Ore() {

    }

    @Override
    public void Gold_Ore() {

    }

    @Override
    public void Iron_Ore() {

    }

    @Override
    public void Emerald_Ore() {

    }

    @Override
    public void Redstone_Block() {

    }

    @Override
    public void Lapis_Block() {

    }

    @Override
    public void Lapis_Ore() {

    }

    @Override
    public void Redstone_Ore() {

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

    public String translator(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }


}