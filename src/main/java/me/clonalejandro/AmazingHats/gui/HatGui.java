package me.clonalejandro.AmazingHats.gui;

import me.clonalejandro.AmazingHats.Main;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

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

public class HatGui {


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public HatGui(Main instance){
        plugin = instance;
    }

    public String serial = "&b&lA&d&lm&e&la&9&lz&c&li&a&ln&b&lg &e&lHats";
    private String name = ChatColor.translateAlternateColorCodes('&', serial);


    /** REST **/

    /**
     * @param p
     */
    public void openGUI(Player p){

        Inventory inventory = plugin.getServer().createInventory(null, 45, name);
        GuiBlocks guiBlocks = new GuiBlocks(plugin);

        ItemBs(guiBlocks, inventory);

        p.openInventory(inventory);
    }


    /**
     * @param guiBlocks
     * @param inventory
     */
    private void ItemBs(GuiBlocks guiBlocks, Inventory inventory){
        inventory.setItem(0, guiBlocks.Grass());
        inventory.setItem(1, guiBlocks.Stone());
        inventory.setItem(2, guiBlocks.Diamond_Block());
        inventory.setItem(3, guiBlocks.Gold_Block());
        inventory.setItem(4, guiBlocks.Iron_Block());
        inventory.setItem(5, guiBlocks.Emerald_Block());
        inventory.setItem(6, guiBlocks.Beacon());
        inventory.setItem(7, guiBlocks.Diamond_Ore());
        inventory.setItem(8, guiBlocks.Gold_Ore());
        inventory.setItem(9, guiBlocks.Iron_Ore());
        inventory.setItem(10, guiBlocks.Emerald_Ore());
        inventory.setItem(11, guiBlocks.Redstone_Block());
        inventory.setItem(12, guiBlocks.Redstone_Ore());
        inventory.setItem(13, guiBlocks.Lapis_Block());
        inventory.setItem(14, guiBlocks.Lapis_Ore());
        inventory.setItem(15, guiBlocks.Command_Block());
        inventory.setItem(16, guiBlocks.Glass());
        inventory.setItem(17, guiBlocks.Spawner());
        inventory.setItem(18, guiBlocks.Anvil());
        inventory.setItem(19, guiBlocks.Obsidian());
        inventory.setItem(20, guiBlocks.Piston());
        inventory.setItem(21, guiBlocks.TNT());
        inventory.setItem(22, guiBlocks.Wool());
        inventory.setItem(23, guiBlocks.Red_Wool());
        inventory.setItem(24, guiBlocks.Blue_Wool());
        inventory.setItem(25, guiBlocks.Cyan_Wool());
        inventory.setItem(26, guiBlocks.Purple_Wool());
        inventory.setItem(27, guiBlocks.Green_Wool());
        inventory.setItem(28, guiBlocks.Orange_Wool());
        inventory.setItem(29, guiBlocks.Yellow_Wool());
        inventory.setItem(30, guiBlocks.Gray_Wool());
        inventory.setItem(31, guiBlocks.DarkRed_Wool());
        inventory.setItem(32, guiBlocks.DarkBlue_Wool());
        inventory.setItem(33, guiBlocks.DarkPurple_Wool());
        inventory.setItem(34, guiBlocks.DarkGreen_Wool());
        inventory.setItem(35, guiBlocks.DarkGray_Wool());
        inventory.setItem(36, guiBlocks.Black_Wool());
        inventory.setItem(37, guiBlocks.Cactus());
        inventory.setItem(38, guiBlocks.Sand());
        inventory.setItem(39, guiBlocks.Crafting_Table());
        inventory.setItem(40, guiBlocks.Enchanting_Table());
        inventory.setItem(41, guiBlocks.Chest());
        inventory.setItem(42, guiBlocks.Enderchest());
        inventory.setItem(44, guiBlocks.Arrow());
    }

}
