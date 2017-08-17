package me.clonalejandro.AmazingHats.listeners;

import me.clonalejandro.AmazingHats.Main;
import me.clonalejandro.AmazingHats.gui.HatGui;
import me.clonalejandro.AmazingHats.hats.All;
import me.clonalejandro.AmazingHats.hats.heads.HeadHat;
import me.clonalejandro.AmazingHats.utils.HatManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created by alejandrorioscalera
 * On 14/8/17
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

public class HatskullListener implements Listener {


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public HatskullListener(Main instance){
        plugin = instance;
    }

    private boolean cancelled = false;


    /** REST **/

    /**
     * @param e
     * @return
     */
    private ItemStack getItem(InventoryClickEvent e){
        return e.getCurrentItem();
    }


    /** OTHERS **/

    @EventHandler
    public void SkullHatInventory(InventoryClickEvent e){

        Player p = (Player) e.getWhoClicked();

        HatGui hatGui = new HatGui(plugin);

        String name = hatGui.serial;

        name = ChatColor.translateAlternateColorCodes('&', name);

        if (e.getClickedInventory().getName().equalsIgnoreCase(name)){
            ItemStack item = getItem(e);

            ifs(item, p);

            if (cancelled) e.setCancelled(true);
            else e.setCancelled(false);
        }
    }


    /**
     * @param item
     * @param p
     */
    private void ifs(ItemStack item, Player p){
        final String str = item.getItemMeta().getDisplayName();
        HatManager hatManager = new HatManager(plugin);

        for (String i : All.SkullsAll) {
            if (str.contains(i))
                manager(hatManager, p, HeadHat.valueOf(i));
        }
    }


    /**
     * @param hatManager
     * @param player
     * @param hat
     */
    private void manager(HatManager hatManager, Player player, HeadHat hat){
        hatManager.setSkullHat(player, hat);
        cancelled = true;
    }


}