package me.clonalejandro.AmazingHats;

import me.clonalejandro.AmazingHats.commands.Hatscmd;
import me.clonalejandro.AmazingHats.gui.GuiBlocks;
import me.clonalejandro.AmazingHats.gui.HatGui;
import me.clonalejandro.AmazingHats.hats.All;
import me.clonalejandro.AmazingHats.hats.blocks.BlockHat;
import me.clonalejandro.AmazingHats.listeners.PlayerListeners;
import me.clonalejandro.AmazingHats.utils.HatManager;

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
    private boolean debug = false;

    private HatManager HatManager;
    private BlockHat blockHat;
    private Hatscmd hatscmd;
    private All all;
    private HatGui hatGui;
    private GuiBlocks guiBlocks;

    public String name;
    public String description;

    public boolean Use;


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

        try {

            saveDefaultConfig();



          //  if (debug) fhatName = "Glass";

            String fhatName = getAll().getHatName();

            Use = getConfig().getBoolean(fhatName + "." + "Use");
            name = getConfig().getString(fhatName + "." + "Name");
            description = getConfig().getString(fhatName + "." + "Description");

            Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "AmazingHats> " + ChatColor.DARK_GREEN + "config loaded");
        } catch (Exception ex){

            ex.printStackTrace();
            Bukkit.getConsoleSender().sendMessage(ChatColor.AQUA + "AmazingHats> " + ChatColor.YELLOW + "several error in config");

            instance = null;
        }
    }


    private void Events(){
        PluginManager pm = instance.getServer().getPluginManager();
        pm.registerEvents(new PlayerListeners(instance), instance);
        //TODO: Listeners
    }


    private void Commands(){
        getCommand("hat").setExecutor(new Hatscmd(instance));
        //TODO: more...
    }


    /** OTHERS **/

    public HatManager getHatManager(){
        return HatManager;
    }

    public BlockHat getBlockHat(){
        return blockHat;
    }

    public Hatscmd getHatscmd(){
        return hatscmd;
    }

    public All getAll(){
        return all;
    }

    public HatGui getHatGui(){
        return hatGui;
    }

    public GuiBlocks getGuiBlocks(){
        return guiBlocks;
    }

    //TODO...

}
