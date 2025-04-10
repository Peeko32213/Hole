package com.peeko32213.hole.client.event;

import com.peeko32213.hole.Hole;
import com.peeko32213.hole.client.model.DefaultModel;
import com.peeko32213.hole.client.model.TerrorDefaultModel;
import com.peeko32213.hole.client.render.PlainGeoRenderer;
import com.peeko32213.hole.client.render.SmallElectricBallRenderer;
import com.peeko32213.hole.client.render.SpinningVerticalThrownItemRenderer;
import com.peeko32213.hole.client.render.layer.HoleGlowingEyeLayer;
import com.peeko32213.hole.common.entity.*;
import com.peeko32213.hole.common.item.HoleItemProperties;
import com.peeko32213.hole.core.registry.HoleBlocks;
import com.peeko32213.hole.core.registry.HoleEntities;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Hole.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientEvents {

    public static void init(FMLClientSetupEvent event) {
    }
    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {

        EntityRenderers.register(HoleEntities.PALE_SPIDER.get(), (ctx) -> {
            PlainGeoRenderer<EntityPaleSpider> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("pale_spider"));
            render.addRenderLayer(new HoleGlowingEyeLayer<>("pale_spider", render));
            return render;
        });

        EntityRenderers.register(HoleEntities.UMBER_SPIDER.get(), (ctx) -> {
            PlainGeoRenderer<EntityUmberSpider> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("umber_spider"));
            render.addRenderLayer(new HoleGlowingEyeLayer<>("umber_spider", render));
            return render;
        });

        EntityRenderers.register(HoleEntities.RAMBLE.get(), (ctx) -> {
            PlainGeoRenderer<EntityRamble> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("ramble"));
            return render;
        });

        EntityRenderers.register(HoleEntities.DICER.get(), (ctx) -> {
            PlainGeoRenderer<EntityDicer> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("dicer"));
            render.addRenderLayer(new HoleGlowingEyeLayer<>("dicer", render));
            return render;
        });

        EntityRenderers.register(HoleEntities.TREMBLER.get(), (ctx) -> {
            PlainGeoRenderer<EntityTrembler> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("trembler"));
            return render;
        });

        EntityRenderers.register(HoleEntities.VOLT.get(), (ctx) -> {
            PlainGeoRenderer<EntityVolt> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("volt"));
            return render;
        });

        EntityRenderers.register(HoleEntities.TERROR.get(), (ctx) -> {
            PlainGeoRenderer<EntityTerror> render = new PlainGeoRenderer<>(ctx, () -> new TerrorDefaultModel<>("terror"));
            render.addRenderLayer(new HoleGlowingEyeLayer<>("terror", render));
            return render;
        });

        EntityRenderers.register(HoleEntities.WIZZ.get(), (ctx) -> {
            PlainGeoRenderer<EntityWizz> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("wizz"));
            return render;
        });

        EntityRenderers.register(HoleEntities.HOPPER.get(), (ctx) -> {
            PlainGeoRenderer<EntityHopper> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("hopper"));
            return render;
        });

        EntityRenderers.register(HoleEntities.FROWZY.get(), (ctx) -> {
            PlainGeoRenderer<EntityFrowzy> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("frowzy"));
            return render;
        });

        EntityRenderers.register(HoleEntities.FIRE_SLIME.get(), (ctx) -> {
            PlainGeoRenderer<EntityFireSlime> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("fireslime"));
            return render;
        });

        EntityRenderers.register(HoleEntities.GUZZLER.get(), (ctx) -> {
            PlainGeoRenderer<EntityGuzzler> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("guzzler"));
            return render;
        });

        EntityRenderers.register(HoleEntities.SLUG_EGG.get(), (render) -> {
            return new ThrownItemRenderer<>(render, 0.75F, true);
        });

        EntityRenderers.register(HoleEntities.SLUG.get(), (ctx) -> {
            PlainGeoRenderer<EntitySlug> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("slug"));
            return render;
        });

        EntityRenderers.register(HoleEntities.FETID.get(), (ctx) -> {
            PlainGeoRenderer<EntityFetid> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("fetid"));
            return render;
        });

        EntityRenderers.register(HoleEntities.SPINDLE.get(), (ctx) -> {
            PlainGeoRenderer<EntitySpindle> render = new PlainGeoRenderer<>(ctx, () -> new DefaultModel<>("spindle"));
            return render;
        });

        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.BLUE_TRUMPET.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.CAVE_PATTY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.CHICKEN_OF_THE_CAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.POWDER_GNOME.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.PRINCESS_JELLY.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.CREAM_CAP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.COPPER_ENOKI.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.RAINCAP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.BLACKCAP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.CAP_OF_EYE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.GREEN_FUNK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.LIME_NUB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.POP_CAP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.PURPLE_KNOB.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.QUEEN_IN_PURPLE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.SLATESHROOM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.SLIPPERY_TOP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(HoleBlocks.WHITECAP.get(), RenderType.cutout());
        event.enqueueWork(HoleItemProperties::addItemProperties);

    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(HoleEntities.SMALL_ELECTRICITY_BALL.get(), SmallElectricBallRenderer::new);
        event.registerEntityRenderer(HoleEntities.TOMAHAWK.get(), SpinningVerticalThrownItemRenderer::new);

    }

}