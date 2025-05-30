package com.unusualmodding.opposing_force.registry.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class TagUtilities {

    public static TagKey<Biome> specialBiomeTag(String modid, String name) {
        return TagKey.create(Registries.BIOME, new ResourceLocation(modid, name));
    }

}
