package net.beyond_horizons.world.feature.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.beyond_horizons.world.feature.tree.ModTrunkPlacerTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class NightShadesTrunkPlacer extends TrunkPlacer {
    public static final Codec<NightShadesTrunkPlacer> CODEC = RecordCodecBuilder.create(objectInstance ->
            fillTrunkPlacerFields(objectInstance).apply(objectInstance, NightShadesTrunkPlacer::new));

    public NightShadesTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return ModTrunkPlacerTypes.NIGHTSHADES_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer,
                                                 Random random, int height, BlockPos startPos, TreeFeatureConfig config) {

        setToDirt(world, replacer, random, startPos.down(), config);

        for(int i = 0; i < height; i++) {
            getAndSetState(world, replacer, random, startPos.up(i), config);

            for (int x = 1; x <= 2; x++) {
                //horizontal
                replacer.accept(startPos.up(height - 1).offset(Direction.EAST, x), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height - 1).offset(Direction.EAST, x)).with(PillarBlock.AXIS, Direction.Axis.X)));
                replacer.accept(startPos.up(height).offset(Direction.EAST, 3), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height).offset(Direction.EAST, 3)).with(PillarBlock.AXIS, Direction.Axis.X)));
                replacer.accept(startPos.up(height).offset(Direction.WEST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height).offset(Direction.WEST, 1)).with(PillarBlock.AXIS, Direction.Axis.X)));
                replacer.accept(startPos.up(height + 1).offset(Direction.WEST, 2), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height + 1).offset(Direction.WEST, 2)).with(PillarBlock.AXIS, Direction.Axis.X)));

                //up
                replacer.accept(startPos.east(4).offset(Direction.UP, height + 1), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.east(4).offset(Direction.UP, height + 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                replacer.accept(startPos.west(3).offset(Direction.UP, height + 2), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.west(3).offset(Direction.UP, height + 2)).with(PillarBlock.AXIS, Direction.Axis.Y)));

                for (int u = 3; u <= 4; u++) {
                    //horizontal 1
                    replacer.accept(startPos.up(height - 3).offset(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(height - 3).offset(Direction.SOUTH, x)).with(PillarBlock.AXIS, Direction.Axis.Z)));
                    replacer.accept(startPos.up(height - 2).offset(Direction.SOUTH, u), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(height - 2).offset(Direction.SOUTH, u)).with(PillarBlock.AXIS, Direction.Axis.Z)));

                    //up 1
                    replacer.accept(startPos.south(5).offset(Direction.UP, height - 1), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.south(5).offset(Direction.UP, height - 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                }

                //horizontal 2
                replacer.accept(startPos.up(height - 3).offset(Direction.NORTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height - 3).offset(Direction.NORTH, x)).with(PillarBlock.AXIS, Direction.Axis.X)));
                replacer.accept(startPos.up(height - 2).offset(Direction.NORTH, 3), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height - 2).offset(Direction.NORTH, 3)).with(PillarBlock.AXIS, Direction.Axis.X)));

                //up 2
                replacer.accept(startPos.north(4).offset(Direction.UP, height - 1), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.north(4).offset(Direction.UP, height - 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));
            }
        }

        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height), 0, false));
    }
}
