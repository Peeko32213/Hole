package com.peeko32213.hole.core.datagen;

import com.mojang.logging.LogUtils;
import com.peeko32213.hole.Hole;
import com.peeko32213.hole.core.registry.*;
import net.minecraft.data.PackOutput;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.common.data.LanguageProvider;
import org.slf4j.Logger;

import java.util.function.Supplier;

public class LanguageGenerator extends LanguageProvider {
    public LanguageGenerator(PackOutput output) {
        super(output, Hole.MODID, "en_us");
    }
    private static final Logger LOGGER = LogUtils.getLogger();
    @Override
    protected void addTranslations(){

        addTabName(HoleCreativeTabs.TAB.get(), "Hole");


        addEntityType(HoleEntities.PALE_SPIDER, "Pale Spider");
        addItem(HoleItems.PALE_SPIDER_SPAWN_EGG, "Pale Spider Spawn Egg");

        addEntityType(HoleEntities.UMBER_SPIDER, "Umber Spider");
        addItem(HoleItems.UMBER_SPIDER_SPAWN_EGG, "Umber Spider Spawn Egg");
        addItem(HoleItems.DEEP_SILK, "Deep Silk");

        addSound(HoleSounds.UMBER_SPIDER_DEATH, "Umber Spider Dying");
        addSound(HoleSounds.UMBER_SPIDER_HURT, "Umber Spider Hurt");
        addSound(HoleSounds.UMBER_SPIDER_IDLE, "Umber Spider Idling");

        addEntityType(HoleEntities.RAMBLE, "Ramble");
        addItem(HoleItems.RAMBLE_SPAWN_EGG, "Rambler Spawn Egg");

        addSound(HoleSounds.RAMBLE_DEATH, "Falling Clatters");
        addSound(HoleSounds.RAMBLE_HURT, "Uncomfortable Clattering");
        addSound(HoleSounds.RAMBLE_IDLE, "Rambling Clatters");

        addEntityType(HoleEntities.DICER, "Dicer");
        addItem(HoleItems.DICER_SPAWN_EGG, "Dicer Spawn Egg");

        addEntityType(HoleEntities.TREMBLER, "Trembler");
        addItem(HoleItems.TREMBLER_SPAWN_EGG, "Trembler Spawn Egg");

        addEntityType(HoleEntities.TERROR, "Terror");
        addItem(HoleItems.TERROR_SPAWN_EGG, "Terror Spawn Egg");

        addEntityType(HoleEntities.VOLT, "Volt");
        addItem(HoleItems.VOLT_SPAWN_EGG, "Volt Spawn Egg");
        addEntityType(HoleEntities.SMALL_ELECTRICITY_BALL, "Small Ball of Electricity");
        addItem(HoleItems.ELECTRIC_CHARGE, "Electric Charge");
        addEffect(HoleEffects.ELECTRIFIED, "Electrified");
        add("death.attack.hole.electrified", "%s met a shocking end");
        add("death.attack.hole.electrified.player", "%s met a shocking end by %s");
        addItem(HoleItems.TESLA_BOW, "Tesla Bow");

        addEntityType(HoleEntities.WIZZ, "Whizz");
        addItem(HoleItems.WIZZ_SPAWN_EGG, "Whizz Spawn Egg");

        addEntityType(HoleEntities.HOPPER, "Bouncer");
        addItem(HoleItems.HOPPER_SPAWN_EGG, "Bouncer Spawn Egg");

        addEntityType(HoleEntities.FROWZY, "Frowzy");
        addItem(HoleItems.FROWZY_SPAWN_EGG, "Frowzy Spawn Egg");

        addEntityType(HoleEntities.FIRE_SLIME, "Aflame Slime");
        addItem(HoleItems.FIRESLIME_SPAWN_EGG, "Aflame Slime Spawn Egg");

        addEntityType(HoleEntities.GUZZLER, "Guzzler");
        addItem(HoleItems.GUZZLER_SPAWN_EGG, "Guzzler Spawn Egg");

        addBlock(HoleBlocks.CAVE_PATTY, "Cave Patty");
        addBlock(HoleBlocks.COPPER_ENOKI, "Copper Enoki");
        addBlock(HoleBlocks.RAINCAP, "Rain Cap");
        addBlock(HoleBlocks.CREAM_CAP, "Cream Cap");
        addBlock(HoleBlocks.CHICKEN_OF_THE_CAVES, "Chicken of The Caves");
        addBlock(HoleBlocks.PRINCESS_JELLY, "Princess Jelly");
        addBlock(HoleBlocks.BLUE_TRUMPET, "Blue Trumpet");
        addBlock(HoleBlocks.POWDER_GNOME, "Powder Gnome");
        addBlock(HoleBlocks.BLACKCAP, "Black Cap");
        addBlock(HoleBlocks.CAP_OF_EYE, "Cap of Eye");
        addBlock(HoleBlocks.GREEN_FUNK, "Green Funk");
        addBlock(HoleBlocks.LIME_NUB, "Lime Nub");
        addBlock(HoleBlocks.POP_CAP, "Pop Cap");
        addBlock(HoleBlocks.PURPLE_KNOB, "Purple Knob");
        addBlock(HoleBlocks.QUEEN_IN_PURPLE, "Queen in Magenta");
        addBlock(HoleBlocks.SLATESHROOM, "Slate Shroom");
        addBlock(HoleBlocks.SLIPPERY_TOP, "Slippery Top");
        addBlock(HoleBlocks.WHITECAP, "White Cap");


        addItem(HoleItems.TOMAHAWK, "Tomahawk");
        add("death.attack.hole.tomahawk", "%s was domed by %s");

        addEntityType(HoleEntities.SLUG, "Slug");
        addItem(HoleItems.SLUG_SPAWN_EGG, "Slug Spawn Egg");
        addItem(HoleItems.SLUG_EGG, "Slug Eggs");

        addEntityType(HoleEntities.FETID, "Fetid");
        addItem(HoleItems.FETID_SPAWN_EGG, "Fetid Spawn Egg");

        addEntityType(HoleEntities.SPINDLE, "Spindle");
        addItem(HoleItems.SPINDLE_SPAWN_EGG, "Spindle Spawn Egg");
    }

    @Override
    public String getName() {
        return  Hole.MODID  + " Languages: en_us";
    }

    public void addBETranslatable(String beName,String name){
        add(Hole.MODID + ".blockentity." + beName, name);
    }






    public void addSound(Supplier<? extends SoundEvent> key, String name){
        add(Hole.MODID + ".sound.subtitle." + key.get().getLocation().getPath(), name);
    }


    public void addTabName(CreativeModeTab key, String name){
        add(key.getDisplayName().getString(), name);
    }

    public void add(CreativeModeTab key, String name) {
        add(key.getDisplayName().getString(), name);
    }

    public void addPotion(Supplier<? extends Potion> key, String name, String regName) {
        add(key.get(), name, regName);
    }

    public void addEnchantDescription(String description, Enchantment enchantment){
        add(enchantment.getDescriptionId() + ".desc", description);
    }

    public void add(Potion key, String name, String regName) {
        add("item.minecraft.potion.effect." + regName, name);
        add("item.minecraft.splash_potion.effect." + regName, "Splash " + name);
        add("item.minecraft.lingering_potion.effect." + regName, "Lingering " + name);
    }
}
