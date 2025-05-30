package com.unusualmodding.opposing_force.data;

import com.unusualmodding.opposing_force.OpposingForce;
import com.unusualmodding.opposing_force.registry.OPSounds;
import net.minecraft.data.PackOutput;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

import java.util.function.Supplier;

@SuppressWarnings("SameParameterValue")
public class OPSoundDefinitionsProvider extends SoundDefinitionsProvider {

    public OPSoundDefinitionsProvider(PackOutput packOutput, ExistingFileHelper helper) {
        super(packOutput, OpposingForce.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {
        this.sound(OPSounds.DICER_HURT,
                sound(OpposingForce.modPrefix("entity/dicer/hurt1")),
                sound(OpposingForce.modPrefix("entity/dicer/hurt2"))
        );
        this.sound(OPSounds.DICER_DEATH,
                sound(OpposingForce.modPrefix("entity/dicer/death1"))
        );
        this.sound(OPSounds.DICER_IDLE,
                sound(OpposingForce.modPrefix("entity/dicer/idle1")),
                sound(OpposingForce.modPrefix("entity/dicer/idle2"))
        );
        this.sound(OPSounds.DICER_ATTACK,
                sound(OpposingForce.modPrefix("entity/dicer/attack1")),
                sound(OpposingForce.modPrefix("entity/dicer/attack2"))
        );

        this.sound(OPSounds.ELECTRIC_CHARGE,
                sound(OpposingForce.modPrefix("entity/electrical_charge/loop1"))
        );
        this.sound(OPSounds.ELECTRIC_CHARGE_DISSIPATE,
                sound(OpposingForce.modPrefix("entity/electrical_charge/dissipate1"))
        );
        this.sound(OPSounds.ELECTRIC_ZAP,
                sound(OpposingForce.modPrefix("misc/electric_zap"))
        );

        this.sound(OPSounds.RAMBLE_HURT,
                sound("mob/skeleton/hurt1").pitch(0.7f),
                sound("mob/skeleton/hurt2").pitch(0.7f),
                sound("mob/skeleton/hurt3").pitch(0.7f),
                sound("mob/skeleton/hurt4").pitch(0.7f)
        );
        this.sound(OPSounds.RAMBLE_DEATH,
                sound(OpposingForce.modPrefix("entity/ramble/death1"))
        );
        this.sound(OPSounds.RAMBLE_IDLE,
                sound(OpposingForce.modPrefix("entity/ramble/idle1"))
        );
        this.sound(OPSounds.RAMBLE_ATTACK,
                sound("mob/skeleton/hurt1").volume(0.8f),
                sound("mob/skeleton/hurt2").volume(0.8f),
                sound("mob/skeleton/hurt3").volume(0.8f),
                sound("mob/skeleton/hurt4").volume(0.8f)
        );

        this.sound(OPSounds.SLUG_HURT,
                sound("mob/slime/big1"),
                sound("mob/slime/big2"),
                sound("mob/slime/big3"),
                sound("mob/slime/big4")
        );
        this.sound(OPSounds.SLUG_DEATH,
                sound("mob/slime/big1").pitch(0.8f),
                sound("mob/slime/big2").pitch(0.8f),
                sound("mob/slime/big3").pitch(0.8f),
                sound("mob/slime/big4").pitch(0.8f)
        );
        this.sound(OPSounds.SLUG_SLIDE,
                sound(OpposingForce.modPrefix("entity/slug/walk1")),
                sound(OpposingForce.modPrefix("entity/slug/walk2")),
                sound(OpposingForce.modPrefix("entity/slug/walk3"))
        );

        this.sound(OPSounds.TESLA_BOW_CHARGED,
                sound(OpposingForce.modPrefix("item/tesla_bow/charged1"))
        );
        this.sound(OPSounds.TESLA_BOW_SHOOT,
                sound(OpposingForce.modPrefix("item/tesla_bow/shoot1"))
        );

        this.sound(OPSounds.TREMBLER_BLOCK,
                sound("item/shield/block1").pitch(1.2f),
                sound("item/shield/block2").pitch(1.2f),
                sound("item/shield/block3").pitch(1.2f),
                sound("item/shield/block4").pitch(1.2f),
                sound("item/shield/block5").pitch(1.2f)
        );

        this.sound(OPSounds.UMBER_SPIDER_HURT,
                sound(OpposingForce.modPrefix("entity/umber_spider/hurt1"))
        );
        this.sound(OPSounds.UMBER_SPIDER_DEATH,
                sound(OpposingForce.modPrefix("entity/umber_spider/death1"))
        );
        this.sound(OPSounds.UMBER_SPIDER_IDLE,
                sound(OpposingForce.modPrefix("entity/umber_spider/idle1"))
        );

        this.sound(OPSounds.VOLT_HURT,
                sound(OpposingForce.modPrefix("entity/volt/hurt1"))
        );
        this.sound(OPSounds.VOLT_DEATH,
                sound(OpposingForce.modPrefix("entity/volt/death1"))
        );
        this.sound(OPSounds.VOLT_IDLE,
                sound(OpposingForce.modPrefix("entity/volt/idle1"))
        );
        this.sound(OPSounds.VOLT_SHOOT,
                sound(OpposingForce.modPrefix("entity/volt/shoot1"))
        );
        this.sound(OPSounds.VOLT_SQUISH,
                sound("mob/slime/small1").pitch(0.8f),
                sound("mob/slime/small2").pitch(0.8f),
                sound("mob/slime/small3").pitch(0.8f),
                sound("mob/slime/small4").pitch(0.8f),
                sound("mob/slime/small5").pitch(0.8f)
        );

        this.sound(OPSounds.WHIZZ_DEATH,
                sound("block/amethyst_cluster/break1").pitch(1.2f),
                sound("block/amethyst_cluster/break2").pitch(1.2f),
                sound("block/amethyst_cluster/break3").pitch(1.2f),
                sound("block/amethyst_cluster/break4").pitch(1.2f)
        );
        this.sound(OPSounds.WHIZZ_HURT,
                sound("block/amethyst/step1").pitch(1.3f),
                sound("block/amethyst/step2").pitch(1.3f),
                sound("block/amethyst/step3").pitch(1.3f),
                sound("block/amethyst/step4").pitch(1.3f),
                sound("block/amethyst/step5").pitch(1.3f),
                sound("block/amethyst/step6").pitch(1.3f),
                sound("block/amethyst/step7").pitch(1.3f),
                sound("block/amethyst/step8").pitch(1.3f),
                sound("block/amethyst/step9").pitch(1.3f),
                sound("block/amethyst/step10").pitch(1.3f),
                sound("block/amethyst/step11").pitch(1.3f),
                sound("block/amethyst/step12").pitch(1.3f)
        );
        this.sound(OPSounds.WHIZZ_FLY,
                sound(OpposingForce.modPrefix("entity/whizz/loop1")).pitch(0.9f)
        );
        this.sound(OPSounds.WHIZZ_ATTACK,
                sound("block/amethyst/resonate1").pitch(1.2f),
                sound("block/amethyst/resonate2").pitch(1.2f),
                sound("block/amethyst/resonate3").pitch(1.2f),
                sound("block/amethyst/resonate4").pitch(1.2f)
        );
    }

    private void soundDefinition(Supplier<SoundEvent> soundEvent, String subtitle, SoundDefinition.Sound... sounds) {
        this.add(soundEvent.get(), SoundDefinition.definition().subtitle("subtitles.opposing_force." + subtitle).with(sounds));
    }

    private void sound(Supplier<SoundEvent> soundEvent, SoundDefinition.Sound... sounds){
        this.soundDefinition(soundEvent, soundEvent.get().getLocation().getPath(), sounds);
    }
}
