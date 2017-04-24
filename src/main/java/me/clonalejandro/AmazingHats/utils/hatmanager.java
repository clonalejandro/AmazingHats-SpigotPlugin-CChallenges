package me.clonalejandro.AmazingHats.utils;

import me.clonalejandro.AmazingHats.hats.blocks.BlockHat;

import org.bukkit.entity.Player;
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

public class hatmanager {


    /** SMALL CONSTRUCTORS **/

    private BlockHat hat;


    /** REST **/

    public void getBlockHat(Player p, BlockHat item) {
        ItemStack stack = item.getHat();
        p.getInventory().setHelmet(stack);
    }


}
