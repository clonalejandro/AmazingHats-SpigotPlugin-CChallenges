package me.clonalejandro.AmazingHats.commands;

import me.clonalejandro.AmazingHats.Main;
import me.clonalejandro.AmazingHats.gui.HatGui;
import me.clonalejandro.AmazingHats.utils.HatManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

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

public class Hatscmd implements CommandExecutor{


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public Hatscmd(Main instance){
        plugin = instance;
    }


    /** REST **/

    /**
     * @param sender
     * @param cmd
     * @param arg
     * @param args
     * @return
     */
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args){
        if (cmd.getName().equalsIgnoreCase("hat")){
            if (args.length > 0){

                if (args[0].equalsIgnoreCase("remove")){
                    HatManager hatManager = new HatManager(plugin);
                    hatManager.removeHat(Bukkit.getPlayer(sender.getName()));
                }

                if (args[0].equalsIgnoreCase("menu")){
                    HatGui hatGui = new HatGui(plugin);
                    hatGui.openGUI(Bukkit.getPlayer(sender.getName()));
                }

            }
            if (args.length == 0)
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lAmazingHats> &finvalid format use: &b/hat &e<type>"));
        }
        return true;
    }


}