package com.peeko32213.hole.core.registry;

import com.peeko32213.hole.common.entity.*;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;

public class HoleEntityPlacement {

    public  static void entityPlacement() {
        //SpawnPlacements.register(UPEntities.STETHACANTHUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityStethacanthus::checkSurfaceWaterDinoSpawnRules);
        //SpawnPlacements.register(UPEntities.BEELZ.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityBaseDinosaurAnimal::checkSurfaceDinoSpawnRules);
        SpawnPlacements.register(HoleEntities.PALE_SPIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityPaleSpider::canFirstTierSpawn);
        SpawnPlacements.register(HoleEntities.UMBER_SPIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityUmberSpider::canSecondTierSpawn);
        SpawnPlacements.register(HoleEntities.TREMBLER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityTrembler::canFirstTierSpawn);
        SpawnPlacements.register(HoleEntities.DICER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityDicer::canSecondTierSpawn);
        SpawnPlacements.register(HoleEntities.RAMBLE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityRamble::canSecondTierSpawn);
        SpawnPlacements.register(HoleEntities.VOLT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityVolt::canSecondTierSpawn);
        SpawnPlacements.register(HoleEntities.HOPPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityHopper::canFirstTierSpawn);
        SpawnPlacements.register(HoleEntities.TERROR.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityTerror::canWaterSpawn);
        SpawnPlacements.register(HoleEntities.WIZZ.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityWizz::canWhizzSpawn);
        SpawnPlacements.register(HoleEntities.FROWZY.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityFrowzy::canFirstTierSpawn);
        SpawnPlacements.register(HoleEntities.GUZZLER.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityGuzzler::canSecondTierSpawn);
        SpawnPlacements.register(HoleEntities.SLUG.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntitySlug::canFirstTierSpawn);

    }

    public static boolean rollSpawn(int rolls, RandomSource random, MobSpawnType reason){
        if(reason == MobSpawnType.SPAWNER){
            return true;
        }else{
            return rolls <= 0 || random.nextInt(rolls) == 0;
        }
    }
}
