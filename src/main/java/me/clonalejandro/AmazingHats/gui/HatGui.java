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
     * @param player
     */
    public void openGUI(Player player){
        Inventory inventory = plugin.getServer().createInventory(null, 45, name);
        GuiBlocks guiBlocks = new GuiBlocks(plugin);

        ItemBs(guiBlocks, inventory);

        player.openInventory(inventory);
    }


    /**
     * @param player
     */
    public void openArrow(Player player){
        Inventory inventory = plugin.getServer().createInventory(null, 45, name);
        GuiSkulls guiSkulls = new GuiSkulls(plugin);

        ItemSk(guiSkulls, inventory);

        player.openInventory(inventory);
    }


    /**
     * @param guiBlocks
     * @param inventory
     */
    private void ItemBs(GuiBlocks guiBlocks, Inventory inventory){
        int i = 0;

        inventory.setItem(i, guiBlocks.Grass());
        inventory.setItem(++i, guiBlocks.Stone());
        inventory.setItem(++i, guiBlocks.Diamond_Block());
        inventory.setItem(++i, guiBlocks.Gold_Block());
        inventory.setItem(++i, guiBlocks.Iron_Block());
        inventory.setItem(++i, guiBlocks.Emerald_Block());
        inventory.setItem(++i, guiBlocks.Beacon());
        inventory.setItem(++i, guiBlocks.Diamond_Ore());
        inventory.setItem(++i, guiBlocks.Gold_Ore());
        inventory.setItem(++i, guiBlocks.Iron_Ore());
        inventory.setItem(++i, guiBlocks.Emerald_Ore());
        inventory.setItem(++i, guiBlocks.Redstone_Block());
        inventory.setItem(++i, guiBlocks.Redstone_Ore());
        inventory.setItem(++i, guiBlocks.Lapis_Block());
        inventory.setItem(++i, guiBlocks.Lapis_Ore());
        inventory.setItem(++i, guiBlocks.Command_Block());
        inventory.setItem(++i, guiBlocks.Glass());
        inventory.setItem(++i, guiBlocks.Spawner());
        inventory.setItem(++i, guiBlocks.Anvil());
        inventory.setItem(++i, guiBlocks.Obsidian());
        inventory.setItem(++i, guiBlocks.Piston());
        inventory.setItem(++i, guiBlocks.TNT());
        inventory.setItem(++i, guiBlocks.Wool());
        inventory.setItem(++i, guiBlocks.Red_Wool());
        inventory.setItem(++i, guiBlocks.Blue_Wool());
        inventory.setItem(++i, guiBlocks.Cyan_Wool());
        inventory.setItem(++i, guiBlocks.Purple_Wool());
        inventory.setItem(++i, guiBlocks.Green_Wool());
        inventory.setItem(++i, guiBlocks.Orange_Wool());
        inventory.setItem(++i, guiBlocks.Yellow_Wool());
        inventory.setItem(++i, guiBlocks.Gray_Wool());
        inventory.setItem(++i, guiBlocks.DarkRed_Wool());
        inventory.setItem(++i, guiBlocks.DarkBlue_Wool());
        inventory.setItem(++i, guiBlocks.DarkPurple_Wool());
        inventory.setItem(++i, guiBlocks.DarkGreen_Wool());
        inventory.setItem(++i, guiBlocks.DarkGray_Wool());
        inventory.setItem(++i, guiBlocks.Black_Wool());
        inventory.setItem(++i, guiBlocks.Cactus());
        inventory.setItem(++i, guiBlocks.Sand());
        inventory.setItem(++i, guiBlocks.Crafting_Table());
        inventory.setItem(++i, guiBlocks.Enchanting_Table());
        inventory.setItem(++i, guiBlocks.Chest());
        inventory.setItem(++i, guiBlocks.Enderchest());
        inventory.setItem(++i, guiBlocks.Arrow());
    }


    /**
     * @param guiSkulls
     * @param inventory
     */
    private void ItemSk(GuiSkulls guiSkulls, Inventory inventory){
        int i = 0;

        inventory.setItem(i, guiSkulls.Notch());
        inventory.setItem(++i, guiSkulls.Jeff());
        inventory.setItem(++i, guiSkulls.DinnerBone());
        inventory.setItem(++i, guiSkulls.clonalejandro());
        inventory.setItem(++i, guiSkulls.Magical_PvP());
        inventory.setItem(++i, guiSkulls.md_5());
        inventory.setItem(++i, guiSkulls.Pikachu());
        inventory.setItem(++i, guiSkulls.Spider());
        inventory.setItem(++i, guiSkulls.Zombie());
        inventory.setItem(++i, guiSkulls.Chicken());
        inventory.setItem(++i, guiSkulls.Villager());
        inventory.setItem(++i, guiSkulls.Golem());
        inventory.setItem(++i, guiSkulls.Snowman());
        inventory.setItem(++i, guiSkulls.EnderDragon());
        inventory.setItem(++i, guiSkulls.Witch());
        inventory.setItem(++i, guiSkulls.CaveSpider());
        inventory.setItem(++i, guiSkulls.Creeper());
        inventory.setItem(++i, guiSkulls.Skeleton());
        inventory.setItem(++i, guiSkulls.Whiter());
        inventory.setItem(++i, guiSkulls.WhiterSkeleton());
        inventory.setItem(++i, guiSkulls.Pigman());
        inventory.setItem(++i, guiSkulls.Slime());
        inventory.setItem(++i, guiSkulls.Magmacube());
        inventory.setItem(++i, guiSkulls.Blaze());
        inventory.setItem(++i, guiSkulls.Jellyfish());
        inventory.setItem(++i, guiSkulls.Enderman());
        inventory.setItem(++i, guiSkulls.Squid());
        inventory.setItem(++i, guiSkulls.Herobrine());
        inventory.setItem(++i, guiSkulls.Sun());
        inventory.setItem(++i, guiSkulls.Mario());
        inventory.setItem(++i, guiSkulls.Luigi());
        inventory.setItem(++i, guiSkulls.Bowser());
        inventory.setItem(++i, guiSkulls.Browser());
        inventory.setItem(++i, guiSkulls.Toad());
        inventory.setItem(++i, guiSkulls.Duck());
        inventory.setItem(++i, guiSkulls.Globe());
        inventory.setItem(++i, guiSkulls.Shark());
        inventory.setItem(++i, guiSkulls.Dog());
        inventory.setItem(++i, guiSkulls.Cat());
        inventory.setItem(++i, guiSkulls.Ocelot());
        inventory.setItem(++i, guiSkulls.Parrot());
        inventory.setItem(++i, guiSkulls.Slenderman());
        inventory.setItem(++i, guiSkulls.Rabbit());
    }


}
