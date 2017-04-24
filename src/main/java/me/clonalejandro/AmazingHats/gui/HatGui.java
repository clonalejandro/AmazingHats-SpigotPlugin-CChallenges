package me.clonalejandro.AmazingHats.gui;

import me.clonalejandro.AmazingHats.Main;

import org.bukkit.ChatColor;
import org.bukkit.event.inventory.InventoryType;
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

    private String serial = "&b&lA&d&lm&e&la&f&lz&c&li&a&ln&b&lg&6&lHat>";
    private String name = ChatColor.translateAlternateColorCodes('&', serial);


    /** REST **/

    public void openGUI(){

        Inventory inventory = plugin.getServer().createInventory(null, InventoryType.CREATIVE, name);


    }
}
