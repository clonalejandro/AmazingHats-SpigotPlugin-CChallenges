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

    /**
     *
     * @param e
     * @return
     */

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
            ifs(item, p);//E is required for instance the void "ifs"

            if (cancelled) e.setCancelled(true);
            else e.setCancelled(false);
        }
    }


    /**
     *
     * @param item
     * @param p
     */

    private void ifs(ItemStack item, Player p){

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

        if (item.getItemMeta().getDisplayName().contains("Beacon")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Beacon);
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


        if (item.getItemMeta().getDisplayName().contains("Redstone Block")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Redstone_Block);
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

        if (item.getItemMeta().getDisplayName().contains("Anvil")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Anvil);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Obsidian")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Obsidian);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Piston")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Piston);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("TNT")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.TNT);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Red Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Red_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Blue Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Blue_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Cyan Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Cyan_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Purple Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Purple_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Green Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Green_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Orange Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Orange_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Yellow Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Yellow_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Gray Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Gray_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("DarkRed Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.DarkRed_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("DarkBlue Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.DarkBlue_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("DarkPurple Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.DarkPurple_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("DarkGreen Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.DarkGreen_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("DarkGray_Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.DarkGray_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Black Wool")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Black_Wool);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Cactus")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Cactus);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Sand")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Sand);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Crafting Table")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Crafting_Table);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Enchanting Table")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Enchanting_Table);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Chest")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Chest);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Enderchest")){
            HatManager hatManager = new HatManager(plugin);
            hatManager.setBlockHat(p, BlockHat.Enderchest);
            cancelled = true;
        }

        if (item.getItemMeta().getDisplayName().contains("Next page")){
            //p.openInventory();
            cancelled = true;
        }
    }


}
