package com.unusualmodding.opposing_force.registry;

import com.unusualmodding.opposing_force.OpposingForce;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = OpposingForce.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OPSounds {

    public static final DeferredRegister<SoundEvent> DEF_REG = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, OpposingForce.MOD_ID);

    public static final RegistryObject<SoundEvent> DICER_HURT = createSoundEvent("dicer_hurt");
    public static final RegistryObject<SoundEvent> DICER_DEATH = createSoundEvent("dicer_death");
    public static final RegistryObject<SoundEvent> DICER_IDLE = createSoundEvent("dicer_idle");
    public static final RegistryObject<SoundEvent> DICER_ATTACK = createSoundEvent("dicer_attack");

    public static final RegistryObject<SoundEvent> ELECTRIC_CHARGE = createSoundEvent("electrical_charge");
    public static final RegistryObject<SoundEvent> ELECTRIC_CHARGE_DISSIPATE = createSoundEvent("electrical_charge_dissipate");
    public static final RegistryObject<SoundEvent> ELECTRIC_ZAP = createSoundEvent("electric_zap");

    public static final RegistryObject<SoundEvent> RAMBLE_HURT = createSoundEvent("ramble_hurt");
    public static final RegistryObject<SoundEvent> RAMBLE_DEATH = createSoundEvent("ramble_death");
    public static final RegistryObject<SoundEvent> RAMBLE_IDLE = createSoundEvent("ramble_idle");
    public static final RegistryObject<SoundEvent> RAMBLE_ATTACK = createSoundEvent("ramble_attack");

    public static final RegistryObject<SoundEvent> SLUG_HURT = createSoundEvent("slug_hurt");
    public static final RegistryObject<SoundEvent> SLUG_DEATH = createSoundEvent("slug_death");
    public static final RegistryObject<SoundEvent> SLUG_SLIDE = createSoundEvent("slug_slide");

    public static final RegistryObject<SoundEvent> TESLA_BOW_CHARGED = createSoundEvent("tesla_bow_charged");
    public static final RegistryObject<SoundEvent> TESLA_BOW_SHOOT = createSoundEvent("tesla_bow_shoot");

    public static final RegistryObject<SoundEvent> TREMBLER_BLOCK = createSoundEvent("trembler_block");

    public static final RegistryObject<SoundEvent> UMBER_SPIDER_HURT = createSoundEvent("umber_spider_hurt");
    public static final RegistryObject<SoundEvent> UMBER_SPIDER_DEATH = createSoundEvent("umber_spider_death");
    public static final RegistryObject<SoundEvent> UMBER_SPIDER_IDLE = createSoundEvent("umber_spider_idle");

    public static final RegistryObject<SoundEvent> VOLT_DEATH = createSoundEvent("volt_death");
    public static final RegistryObject<SoundEvent> VOLT_HURT = createSoundEvent("volt_hurt");
    public static final RegistryObject<SoundEvent> VOLT_IDLE = createSoundEvent("volt_idle");
    public static final RegistryObject<SoundEvent> VOLT_SHOOT = createSoundEvent("volt_shoot");
    public static final RegistryObject<SoundEvent> VOLT_SQUISH = createSoundEvent("volt_squish");

    public static final RegistryObject<SoundEvent> WHIZZ_DEATH = createSoundEvent("whizz_death");
    public static final RegistryObject<SoundEvent> WHIZZ_HURT = createSoundEvent("whizz_hurt");
    public static final RegistryObject<SoundEvent> WHIZZ_FLY = createSoundEvent("whizz_fly");
    public static final RegistryObject<SoundEvent> WHIZZ_ATTACK = createSoundEvent("whizz_attack");

    private static RegistryObject<SoundEvent> createSoundEvent(final String soundName) {
        return DEF_REG.register(soundName, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(OpposingForce.MOD_ID, soundName)));
    }
}
