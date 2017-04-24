package me.clonalejandro.AmazingHats.utils;

import me.clonalejandro.AmazingHats.Main;
import me.clonalejandro.AmazingHats.hats.blocks.BlockHat;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.HashMap;
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

public class HatManager {


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public HatManager(Main instance){
        plugin = instance;
    }

    public static HashMap<Player, Boolean> isHat = new HashMap<>();

    private boolean hHat;


    /** REST **/

    /**
     *
     * @param player
     * @param hat
     */

    public void setBlockHat(Player player, BlockHat hat) {

        ItemStack helmet = player.getInventory().getHelmet();
        ItemStack stack = hat.getHat();

        ItemMeta meta = stack.getItemMeta();
        List<String> lore = new ArrayList<>();

        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&b&l" +  hat.toString()));

        lore.add(ChatColor.translateAlternateColorCodes('&', "&b&lA&d&lm&e&la&f&lz&c&li&a&ln&b&lg&6&lHat>"));

        meta.setLore(lore);

        stack.setItemMeta(meta);

        if (helmet != null) player.getInventory().addItem(helmet);
        player.getInventory().setHelmet(stack);

        isHat.put(player, true);
    }


    /**
     *
     * @param player
     * @return
     */

    public ItemStack getHat(Player player){

        ItemStack helmet = player.getInventory().getHelmet();

        if (helmet != null)
            if (isHat.containsKey(player)) hHat = true;
            else hHat = false;
        else hHat = false;

        if (hHat) return helmet;
        else return null;
    }


    /**
     *
     * @param player
     */

    public void removeHat(Player player){

        ItemStack helmet = getHat(player);

        if (hHat){
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&lAmazingHats> &fYour hat has been removed"));
            player.getInventory().setHelmet(new ItemStack(Material.AIR));
            isHat.remove(player);
        }
        else player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lAmazingHats> &fYou don't have any hat"));
    }


}