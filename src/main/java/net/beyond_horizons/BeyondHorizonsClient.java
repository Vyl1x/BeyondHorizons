package net.beyond_horizons;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.utils.ModModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.render.RenderLayer;

public class BeyondHorizonsClient implements ClientModInitializer {

    //public static BeyondHorizonsConfig config = BeyondHorizonsClothConfig.init();

    public void onInitializeClient() {
        Render();

        ModModelPredicateProvider.registerModModels();
    }

    private void Render() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRYSTALASPEN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLEJADE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NIGHTSHADEGROVE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARKFIRE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRYSTALASPEN_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLEJADE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARKFIRE_TRAPDOOR, RenderLayer.getCutout());

        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x4a177a, ModBlocks.NIGHTSHADEGROVE_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x4a177a, ModBlocks.NIGHTSHADEGROVE_LEAVES);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x0f7098, ModBlocks.CRYSTALASPEN_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x0f7098, ModBlocks.CRYSTALASPEN_LEAVES);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x4e9238, ModBlocks.JUNGLEJADE_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x4e9238, ModBlocks.JUNGLEJADE_LEAVES);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0xA41313, ModBlocks.SHADOWONYXBLOODFLAME_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xA41313, ModBlocks.SHADOWONYXBLOODFLAME_LEAVES);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> 0x202030, ModBlocks.DARKFIRE_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x202030, ModBlocks.DARKFIRE_LEAVES);
    }
}
