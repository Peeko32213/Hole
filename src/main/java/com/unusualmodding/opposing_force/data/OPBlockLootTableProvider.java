package com.unusualmodding.opposing_force.data;

import com.unusualmodding.opposing_force.registry.OPBlocks;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.HashSet;
import java.util.Set;

public class OPBlockLootTableProvider extends BlockLootSubProvider {

    private final Set<Block> knownBlocks = new HashSet<>();
    private static final LootItemCondition.Builder HAS_SILK_TOUCH = MatchTool.toolMatches(ItemPredicate.Builder.item().hasEnchantment(new EnchantmentPredicate(Enchantments.SILK_TOUCH, MinMaxBounds.Ints.atLeast(1))));
    private static final LootItemCondition.Builder HAS_NO_SILK_TOUCH = HAS_SILK_TOUCH.invert();
    public OPBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void add(Block pBlock, LootTable.Builder pBuilder) {
        super.add(pBlock, pBuilder);
        knownBlocks.add(pBlock);
    }

    @Override
    protected void generate() {
        dropSelf(OPBlocks.TREMBLER_SHELL.get());

        dropSelf(OPBlocks.CAVE_PATTY.get());
        dropSelf(OPBlocks.CREAM_CAP.get());
        dropSelf(OPBlocks.CHICKEN_OF_THE_CAVES.get());
        dropSelf(OPBlocks.COPPER_ENOKI.get());
        dropSelf(OPBlocks.RAINCAP.get());
        dropSelf(OPBlocks.POWDER_GNOME.get());
        dropSelf(OPBlocks.CAP_OF_EYE.get());
        dropSelf(OPBlocks.PURPLE_KNOB.get());
        dropSelf(OPBlocks.SLIPPERY_TOP.get());

        createPotFlowerItemTable(OPBlocks.POTTED_CAVE_PATTY.get(), OPBlocks.CAVE_PATTY.get());
        createPotFlowerItemTable(OPBlocks.POTTED_CREAM_CAP.get(), OPBlocks.CREAM_CAP.get());
        createPotFlowerItemTable(OPBlocks.POTTED_CHICKEN_OF_THE_CAVES.get(), OPBlocks.CHICKEN_OF_THE_CAVES.get());
        createPotFlowerItemTable(OPBlocks.POTTED_COPPER_ENOKI.get(), OPBlocks.COPPER_ENOKI.get());
        createPotFlowerItemTable(OPBlocks.POTTED_RAINCAP.get(), OPBlocks.RAINCAP.get());
        createPotFlowerItemTable(OPBlocks.POTTED_POWDER_GNOME.get(), OPBlocks.POWDER_GNOME.get());
        createPotFlowerItemTable(OPBlocks.POTTED_CAP_OF_EYE.get(), OPBlocks.CAP_OF_EYE.get());
        createPotFlowerItemTable(OPBlocks.POTTED_PURPLE_KNOB.get(), OPBlocks.PURPLE_KNOB.get());
        createPotFlowerItemTable(OPBlocks.POTTED_SLIPPERY_TOP.get(), OPBlocks.SLIPPERY_TOP.get());

    }
    protected void createPotFlowerItemTable(Block flowerpotBlock, ItemLike pItem) {
        add(flowerpotBlock ,LootTable.lootTable()
                .withPool(this.applyExplosionCondition(Blocks.FLOWER_POT, LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(Blocks.FLOWER_POT))))
                .withPool(this.applyExplosionCondition(pItem, LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(pItem)))));
    }


    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createMultipleDrops(Block pBlock, Item item1, Item item2) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item1)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))
                        .then(LootItem.lootTableItem(item2)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected LootTable.Builder createMultipleBlockDrops(Block pBlock, Block item1, Block item2) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                                LootItem.lootTableItem(item1)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)))
                        .then(LootItem.lootTableItem(item2)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return knownBlocks;
    }
}
