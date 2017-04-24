package me.clonalejandro.AmazingHats;

import me.clonalejandro.AmazingHats.commands.Hatscmd;
import me.clonalejandro.AmazingHats.listeners.PlayerListeners;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

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

public class Main extends JavaPlugin {


    /** SMALL CONSTRUCTORS **/

    public static Main instance;


    /** REST **/

    @Override
    public void onLoad(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "AmazingHats> " + ChatColor.BLUE + "plugin loaded");
    }


    @Override
    public void onEnable(){

        try {

            instance = this;

            Config();
            Events();
            Commands();

            Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "AmazingHats> " + ChatColor.GREEN + "plugin activated");
        } catch (Exception ex){

            ex.printStackTrace();
            Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "AmazingHats> " + ChatColor.DARK_RED + "several error");

            instance = null;
        }
    }


    @Override
    public void onDisable(){
        Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "AmazingHats> " + ChatColor.RED + "plugin disabled");
        instance = null;
    }


    /** REST **/

    private void Config(){
        saveDefaultConfig();
    }


    private void Events(){
        PluginManager pm = instance.getServer().getPluginManager();
        pm.registerEvents(new PlayerListeners(instance), instance);
        //TODO: Listeners
    }


    private void Commands(){
        getCommand("hat").setExecutor(new Hatscmd());
        //TODO: more...
    }


    /** OTHERS **/


}
