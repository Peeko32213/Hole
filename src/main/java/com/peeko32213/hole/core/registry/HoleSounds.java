package com.peeko32213.hole.core.registry;

import com.peeko32213.hole.Hole;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Hole.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HoleSounds {

    public static final DeferredRegister<SoundEvent> DEF_REG = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Hole.MODID);
    public static final RegistryObject<SoundEvent> UMBER_SPIDER_DEATH = createSoundEvent("umber_spider_death");
    public static final RegistryObject<SoundEvent> UMBER_SPIDER_HURT = createSoundEvent("umber_spider_hurt");
    public static final RegistryObject<SoundEvent> UMBER_SPIDER_IDLE = createSoundEvent("umber_spider_idle");
    public static final RegistryObject<SoundEvent> RAMBLE_DEATH = createSoundEvent("ramble_death");
    public static final RegistryObject<SoundEvent> RAMBLE_HURT = createSoundEvent("ramble_hurt");
    public static final RegistryObject<SoundEvent> RAMBLE_IDLE = createSoundEvent("ramble_idle");

    private static RegistryObject<SoundEvent> createSoundEvent(final String soundName) {
        return DEF_REG.register(soundName, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Hole.MODID, soundName)));
    }


}
