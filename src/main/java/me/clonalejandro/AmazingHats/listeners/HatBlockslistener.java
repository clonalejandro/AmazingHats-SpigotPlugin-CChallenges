package me.clonalejandro.AmazingHats.listeners;

import me.clonalejandro.AmazingHats.Main;
import me.clonalejandro.AmazingHats.gui.GuiBlocks;
import me.clonalejandro.AmazingHats.gui.HatGui;

import me.clonalejandro.AmazingHats.hats.blocks.BlockHat;
import me.clonalejandro.AmazingHats.utils.HatManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created by alejandrorioscalera
 * On 26/4/17
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

public class HatBlockslistener implements Listener{


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public HatBlockslistener(Main instance){
        plugin = instance;
    }

    private boolean cancelled = false;


    /** REST **/

    private ItemStack getItem(InventoryClickEvent e){
        return e.getCurrentItem();
    }


    /** OTHERS **/

    @EventHandler
    public void BlockHatInventory(InventoryClickEvent e){

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

    private void ifs(ItemStack item, Player p){
        GuiBlocks guiBlocks = new GuiBlocks(plugin);

        if (item.getItemMeta().getDisplayName().contains("Grass")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Grass);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Stone")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Stone);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Diamond Block")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Diamond_Block);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Gold Block")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Gold_Block);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Iron Block")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Iron_Block);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Emerald Block")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Emerald_Block);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Redstone Block")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Redstone_Block);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Diamond Ore")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Diamond_Ore);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Gold Ore")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Gold_Ore);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Iron Ore")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Iron_Ore);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Emerald Ore")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Emerald_Ore);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Redstone Ore")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Redstone_Ore);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Lapis Block")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Lapis_Block);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Lapis Ore")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Lapis_Ore);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Command Block")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Command_Block);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Glass")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Glass);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Spawner")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Spawner);
            cancelled = true;
        }

        if ()
    }


}
