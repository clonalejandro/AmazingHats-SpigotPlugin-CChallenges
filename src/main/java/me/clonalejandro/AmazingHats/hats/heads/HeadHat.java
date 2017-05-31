package me.clonalejandro.AmazingHats.hats.heads;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * Created by alejandrorioscalera
 * On 31/5/17
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

public enum  HeadHat {

    /** ENUM **/

    Notch(skull("Notch", 1)),
    Jeff(skull("Jeff", 1)),
    DinnerBone(skull("DinnerBone", 1)),
    clonalejandro(skull("clonalejandro", 1)),
    Magical_PvP(skull("Magical_PvP", 1)),
    md_5(skull("md_5", 1)),
    Pikachu(skull("Pikachu", 1)),
    Spider(skull("Spider", 1)),
    Zombie(skull("Zombie", 1)),
    Chicken(skull("Chicken", 1)),
    Villager(skull("Villager", 1)),
    Golem(skull("Golem", 1)),
    Snowman(skull("Snowman", 1)),
    EnderDragon(skull("EnderDragon", 1)),
    Witch(skull("Witch", 1)),
    CaveSpider(skull("CaveSpider", 1)),
    Creeper(skull("Creeper", 1)),
    Skeleton(skull("Skeleton", 1)),
    Whiter(skull("Whiter", 1)),
    WhiterSkeleton(skull("WhiterSkeleton", 1)),
    Pigman(skull("Pigman", 1)),
    Slime(skull("Slime", 1)),
    Magmacube(skull("Magmacube", 1)),
    Blaze(skull("Blaze", 1)),
    JellyFish(skull("JellyFish", 1)),
    Enderman(skull("Enderman", 1)),
    Squid(skull("Squid", 1)),
    Herobrine(skull("Herobrine", 1)),
    Sun(skull("Sun", 1)),
    Mario(skull("Mario", 1)),
    Luigi(skull("Luigi", 1)),
    Bowser(skull("Bowser", 1)),
    Browser(skull("Browser", 1)),
    Toad(skull("Toad", 1)),
    Duck(skull("Duck", 1)),
    Globe(skull("Globe", 1)),
    Shark(skull("Shark", 1)),
    Dog(skull("Dog", 1)),
    Cat(skull("Cat", 1)),
    Ocelot(skull("Ocelot", 1)),
    Parrot(skull("Parrot", 1)),
    Slenderman(skull("Slenderman", 1)),
    Rabbit(skull("Rabbit", 1));


    /** SMALL CONSTRUCTORS **/

    private ItemStack item;

    HeadHat(ItemStack stack){
        this.item = stack;
    }

    public ItemStack getHat(){
        return this.item;
    }


    /** REST **/

    /**
     * @param owner
     * @param amount
     * @return
     */
    public static ItemStack skull(String owner, int amount){

        ItemStack item = new ItemStack(Material.SKULL, amount);

        SkullMeta meta = (SkullMeta) item.getItemMeta();

        meta.setOwner(owner);
        item.setItemMeta(meta);

        return item;
    }


}