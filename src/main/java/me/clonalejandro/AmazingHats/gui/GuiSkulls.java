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

        String name = plugin.getConfig().getString(getName(0) + cName);
        String description = plugin.getConfig().getString(getName(0) + cDescription);

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

        String name = plugin.getConfig().getString(getName(1) + cName);
        String description = plugin.getConfig().getString(getName(1) + cDescription);

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

        String name = plugin.getConfig().getString(getName(2) + cName);
        String description = plugin.getConfig().getString(getName(2) + cDescription);

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

        String name = plugin.getConfig().getString(getName(3) + cName);
        String description = plugin.getConfig().getString(getName(3) + cDescription);

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

        String name = plugin.getConfig().getString(getName(4) + cName);
        String description = plugin.getConfig().getString(getName(4) + cDescription);

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

        String name = plugin.getConfig().getString(getName(5) + cName);
        String description = plugin.getConfig().getString(getName(5) + cDescription);

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

        String name = plugin.getConfig().getString(getName(6) + cName);
        String description = plugin.getConfig().getString(getName(6) + cDescription);

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

        String name = plugin.getConfig().getString(getName(7) + cName);
        String description = plugin.getConfig().getString(getName(7) + cDescription);

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

        String name = plugin.getConfig().getString(getName(8) + cName);
        String description = plugin.getConfig().getString(getName(8) + cDescription);

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

        String name = plugin.getConfig().getString(getName(9) + cName);
        String description = plugin.getConfig().getString(getName(9) + cDescription);

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

        String name = plugin.getConfig().getString(getName(10) + cName);
        String description = plugin.getConfig().getString(getName(10) + cDescription);

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

        String name = plugin.getConfig().getString(getName(11) + cName);
        String description = plugin.getConfig().getString(getName(11) + cDescription);

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


        return null;
    }

    @Override
    public ItemStack EnderDragon() {
        return null;
    }

    @Override
    public ItemStack Witch() {
        return null;
    }

    @Override
    public ItemStack CaveSpider() {
        return null;
    }

    @Override
    public ItemStack Creeper() {
        return null;
    }

    @Override
    public ItemStack Skeleton() {
        return null;
    }

    @Override
    public ItemStack Whiter() {
        return null;
    }

    @Override
    public ItemStack WhiterSkeleton() {
        return null;
    }

    @Override
    public ItemStack Pigman() {
        return null;
    }

    @Override
    public ItemStack Slime() {
        return null;
    }

    @Override
    public ItemStack Magmacube() {
        return null;
    }

    @Override
    public ItemStack Blaze() {
        return null;
    }

    @Override
    public ItemStack Jellyfish() {
        return null;
    }

    @Override
    public ItemStack Enderman() {
        return null;
    }

    @Override
    public ItemStack Squid() {
        return null;
    }

    @Override
    public ItemStack Herobrine() {
        return null;
    }

    @Override
    public ItemStack Sun() {
        return null;
    }

    @Override
    public ItemStack Mario() {
        return null;
    }

    @Override
    public ItemStack Luigi() {
        return null;
    }

    @Override
    public ItemStack Bowser() {
        return null;
    }

    @Override
    public ItemStack Browser() {
        return null;
    }

    @Override
    public ItemStack Toad() {
        return null;
    }

    @Override
    public ItemStack Duck() {
        return null;
    }

    @Override
    public ItemStack Globe() {
        return null;
    }

    @Override
    public ItemStack Shark() {
        return null;
    }

    @Override
    public ItemStack Dog() {
        return null;
    }

    @Override
    public ItemStack Cat() {
        return null;
    }

    @Override
    public ItemStack Ocelot() {
        return null;
    }

    @Override
    public ItemStack Parrot() {
        return null;
    }

    @Override
    public ItemStack Slenderman() {
        return null;
    }

    @Override
    public ItemStack Rabbit() {
        return null;
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
