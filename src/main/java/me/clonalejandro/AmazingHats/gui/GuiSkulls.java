package me.clonalejandro.AmazingHats.gui;

import me.clonalejandro.AmazingHats.Main;
import me.clonalejandro.AmazingHats.hats.All;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alejandrorioscalera
 * On 14/6/17
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

public class GuiSkulls implements SkullInter {


    /** SMALL CONSTRUCTORS **/

    private final Main plugin;

    public GuiSkulls(Main instance){
        plugin = instance;
    }

    private final String cDescription = ".Description";
    private final String cName = ".Name";


    /** REST **/

    @Override
    public ItemStack Notch() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(0) + cName);
        final String description = plugin.getConfig().getString(getName(0) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(0));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Jeff() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(1) + cName);
        final String description = plugin.getConfig().getString(getName(1) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(1));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack DinnerBone() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(2) + cName);
        final String description = plugin.getConfig().getString(getName(2) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(2));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack clonalejandro() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(3) + cName);
        final String description = plugin.getConfig().getString(getName(3) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(3));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Magical_PvP() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(4) + cName);
        final String description = plugin.getConfig().getString(getName(4) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(4));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack md_5() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(5) + cName);
        final String description = plugin.getConfig().getString(getName(5) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(5));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Pikachu() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(6) + cName);
        final String description = plugin.getConfig().getString(getName(6) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(6));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Spider() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(7) + cName);
        final String description = plugin.getConfig().getString(getName(7) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(7));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Zombie() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(8) + cName);
        final String description = plugin.getConfig().getString(getName(8) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(8));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Chicken() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(9) + cName);
        final String description = plugin.getConfig().getString(getName(9) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(9));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Villager() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(10) + cName);
        final String description = plugin.getConfig().getString(getName(10) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(10));

        skull.setItemMeta(skullMeta);

        return skull;
    }

    @Override
    public ItemStack Golem() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(11) + cName);
        final String description = plugin.getConfig().getString(getName(11) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(11));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Snowman() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(12) + cName);
        final String description = plugin.getConfig().getString(getName(12) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(12));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack EnderDragon() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(13) + cName);
        final String description = plugin.getConfig().getString(getName(13) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(13));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Witch() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(14) + cName);
        final String description = plugin.getConfig().getString(getName(14) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(14));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack CaveSpider() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(15) + cName);
        final String description = plugin.getConfig().getString(getName(15) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(15));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Creeper() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(16) + cName);
        final String description = plugin.getConfig().getString(getName(16) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(16));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Skeleton() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(17) + cName);
        final String description = plugin.getConfig().getString(getName(17) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(17));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Whiter() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(18) + cName);
        final String description = plugin.getConfig().getString(getName(18) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(18));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack WhiterSkeleton() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(19) + cName);
        final String description = plugin.getConfig().getString(getName(19) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(19));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Pigman() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(20) + cName);
        final String description = plugin.getConfig().getString(getName(20) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(20));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Slime() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(21) + cName);
        final String description = plugin.getConfig().getString(getName(21) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(21));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Magmacube() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(22) + cName);
        final String description = plugin.getConfig().getString(getName(22) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(22));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Blaze() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(23) + cName);
        final String description = plugin.getConfig().getString(getName(23) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(23));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Jellyfish() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(24) + cName);
        final String description = plugin.getConfig().getString(getName(24) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(24));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Enderman() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(25) + cName);
        final String description = plugin.getConfig().getString(getName(25) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(25));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Squid() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(26) + cName);
        final String description = plugin.getConfig().getString(getName(26) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(26));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Herobrine() {

        ItemStack skull = new ItemStack(Material.SKULL);

        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();

        final String name = plugin.getConfig().getString(getName(27) + cName);
        final String description = plugin.getConfig().getString(getName(27) + cDescription);

        List<String> lore = new ArrayList<>();

        lore.add(translator(description));

        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(27));

        skull.setItemMeta(skullMeta);

        return skull;
    }


    @Override
    public ItemStack Sun() {

        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(28) + cName);
        final String description = plugin.getConfig().getString(getName(28) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(28));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Mario() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(29) + cName);
        final String description = plugin.getConfig().getString(getName(29) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(29));
        
        return skull;
    }

    
    @Override
    public ItemStack Luigi() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(30) + cName);
        final String description = plugin.getConfig().getString(getName(30) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(30));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Bowser() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(31) + cName);
        final String description = plugin.getConfig().getString(getName(31) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(31));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }
    

    @Override
    public ItemStack Browser() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(32) + cName);
        final String description = plugin.getConfig().getString(getName(32) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(32));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Toad() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(33) + cName);
        final String description = plugin.getConfig().getString(getName(33) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(33));

        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Duck() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(34) + cName);
        final String description = plugin.getConfig().getString(getName(34) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(34));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }
    

    @Override
    public ItemStack Globe() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(35) + cName);
        final String description = plugin.getConfig().getString(getName(35) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(35));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Shark() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(36) + cName);
        final String description = plugin.getConfig().getString(getName(36) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(36));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Dog() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(37) + cName);
        final String description = plugin.getConfig().getString(getName(37) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(37));
  
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Cat() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(38) + cName);
        final String description = plugin.getConfig().getString(getName(38) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(38));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Ocelot() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(39) + cName);
        final String description = plugin.getConfig().getString(getName(39) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(39));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Parrot() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(40) + cName);
        final String description = plugin.getConfig().getString(getName(40) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(40));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Slenderman() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(41) + cName);
        final String description = plugin.getConfig().getString(getName(41) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(41));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }

    
    @Override
    public ItemStack Rabbit() {
        
        ItemStack skull = new ItemStack(Material.SKULL);
        
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        final String name = plugin.getConfig().getString(getName(42) + cName);
        final String description = plugin.getConfig().getString(getName(42) + cDescription);
        
        List<String> lore = new ArrayList<>();
        
        lore.add(translator(description));
        
        skullMeta.setDisplayName(translator(name));
        skullMeta.setLore(lore);
        skullMeta.setOwner(getName(42));
        
        skull.setItemMeta(skullMeta);
        
        return skull;
    }


    /** OTHERS **/

    /**
     * @param text
     * @return
     */
    private String translator(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }

    /**
     * @param n
     * @return
     */
    private String getName(int n){
        return All.SkullsAll[n];
    }


}
