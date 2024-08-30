package com.peeko32213.hole.core.registry;

import com.peeko32213.hole.Hole;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class HoleItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Hole.MODID);

    public static final RegistryObject<ForgeSpawnEggItem> PALE_SPIDER_SPAWN_EGG = registerSpawnEggs("pale_spider_spawn_egg",
            HoleEntities.PALE_SPIDER , 0xc4ac7f, 0xffd731);

    public static final RegistryObject<ForgeSpawnEggItem> UMBER_SPIDER_SPAWN_EGG = registerSpawnEggs("umber_spider_spawn_egg",
            HoleEntities.UMBER_SPIDER , 0x0e0909, 0x44a9f6);

    public static final RegistryObject<ForgeSpawnEggItem> RAMBLE_SPAWN_EGG = registerSpawnEggs("ramble_spawn_egg",
            HoleEntities.RAMBLE , 0x131313, 0xffffff);

    public static final RegistryObject<ForgeSpawnEggItem> DICER_SPAWN_EGG = registerSpawnEggs("dicer_spawn_egg",
            HoleEntities.DICER , 0xbb0000, 0xd354c7);

    public static final RegistryObject<ForgeSpawnEggItem> TREMBLER_SPAWN_EGG = registerSpawnEggs("trembler_spawn_egg",
            HoleEntities.TREMBLER , 0x20281e, 0x86b5b4);

    public static final RegistryObject<Item> DEEP_SILK = ITEMS.register("deep_silk",
            () -> new Item(new Item.Properties()));

    private static RegistryObject<ForgeSpawnEggItem> registerSpawnEggs(String name, Supplier<? extends EntityType<? extends Mob>> type, int backgroundColor, int highlightColor) {
        return ITEMS.register(name, () -> new ForgeSpawnEggItem(type, backgroundColor, highlightColor,new Item.Properties()));
    }

}
