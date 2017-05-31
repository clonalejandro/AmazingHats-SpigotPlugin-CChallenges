package me.clonalejandro.AmazingHats.listeners;

import me.clonalejandro.AmazingHats.Main;
import me.clonalejandro.AmazingHats.utils.HatManager;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
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

public class PlayerListeners implements Listener {


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public PlayerListeners(Main instance){
        plugin = instance;
    }


    /** REST **/

    /**
     * @param e
     */

    @EventHandler
    public void preventHat(InventoryClickEvent e){

        Player p = (Player) e.getWhoClicked();

        if (p.getInventory().getHelmet() != new ItemStack(Material.AIR) || p.getInventory().getHelmet() != null || e.getInventory().getItem(39) != new ItemStack(Material.AIR) || e.getInventory().getItem(39) != null) {
            if (HatManager.isHat.containsKey(p)) {
                if (HatManager.isHat.get(p.getPlayer())) {
                    if (e.getSlot() == 39) {
                        if (e.getClick().isShiftClick() || e.getClick().isLeftClick() || e.getClick().isRightClick() || e.getClick().isKeyboardClick()) {
                            e.setCancelled(true);
                            p.closeInventory();
                        }//Click types
                    }//Slot
                }//Ishat?
            }//PreventCrash
        }
    }//Method


}
