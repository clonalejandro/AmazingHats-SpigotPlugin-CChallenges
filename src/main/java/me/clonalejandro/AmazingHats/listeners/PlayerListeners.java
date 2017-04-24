package me.clonalejandro.AmazingHats.listeners;

import me.clonalejandro.AmazingHats.Main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

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

public class PlayerListeners implements Listener {


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public PlayerListeners(Main instance){
        plugin = instance;
    }


    /** REST **/

    @EventHandler
    public void preventHat(InventoryClickEvent e){
        List<String> target = e.getWhoClicked().getInventory().getHelmet().getItemMeta().getLore();

        String serial = "&b&lA&d&lm&e&la&f&lz&c&li&a&ln&b&lg&6&lHat>";

        if (target.contains(serial)) e.setCancelled(true);
    }


}
