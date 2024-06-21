package net.beyond_horizons.world.feature.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
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

public class JadesTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<JadesTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(objectInstance ->
            fillTrunkPlacerFields(objectInstance).apply(objectInstance, JadesTrunkPlacer::new));

    public JadesTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
    }

    @Override
    protected TrunkPlacerType<?> getType() {
        return ModTrunkPlacerTypes.JADES_TRUNK_PLACER;
    }

    @Override
    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer,
                                                 Random random, int height, BlockPos startPos, TreeFeatureConfig config) {

        setToDirt(world, replacer, random, startPos.down(), config);

        for(int i = 0; i < height; i++) {
            getAndSetState(world, replacer, random, startPos.up(i), config);

            for (int x = 1; x <= 3; x++) {
                //horizontal
                replacer.accept(startPos.up(height).offset(Direction.NORTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height).offset(Direction.NORTH, x)).with(PillarBlock.AXIS, Direction.Axis.Z)));

                //up
                replacer.accept(startPos.north(5).offset(Direction.UP, height + 2), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.north(5).offset(Direction.UP, height + 2)).with(PillarBlock.AXIS, Direction.Axis.Y)));

                replacer.accept(startPos.north(4).offset(Direction.UP, height + 1), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.north(4).offset(Direction.UP, height + 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));

                //horizontal 1
                replacer.accept(startPos.up(height - 2).offset(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height - 2).offset(Direction.SOUTH, x)).with(PillarBlock.AXIS, Direction.Axis.Z)));

                //up 1
                replacer.accept(startPos.south(5).offset(Direction.UP, height), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.south(5).offset(Direction.UP, height)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                replacer.accept(startPos.south(4).offset(Direction.UP, height - 1), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.south(4).offset(Direction.UP, height - 1)).with(PillarBlock.AXIS, Direction.Axis.Y)));

                for (int x1 = 1; x1 <= 2; x1++) {
                    //horizontal 2
                    replacer.accept(startPos.up(height - 5).offset(Direction.WEST, x), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(height - 5).offset(Direction.WEST, x)).with(PillarBlock.AXIS, Direction.Axis.X)));
                    replacer.accept(startPos.up(height - 6).offset(Direction.WEST, 3 + x1), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(height - 6).offset(Direction.WEST, 3 + x1)).with(PillarBlock.AXIS, Direction.Axis.X)));

                    //up 2
                    replacer.accept(startPos.west(6).offset(Direction.UP, height - 7), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.west(6).offset(Direction.UP, height - 7)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                }
                for (int x1 = 1; x1 <= 2; x1++) {
                    //horizontal 3
                    replacer.accept(startPos.up(height - 7).offset(Direction.NORTH, x1), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(height - 7).offset(Direction.NORTH, x1)).with(PillarBlock.AXIS, Direction.Axis.Z)));

                    //up 3
                    replacer.accept(startPos.north(3).offset(Direction.UP, height - 6), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.north(3).offset(Direction.UP, height - 6)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                    replacer.accept(startPos.north(4).offset(Direction.UP, height - 5), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.north(4).offset(Direction.UP, height - 5)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                }
                //horizontal 4
                replacer.accept(startPos.up(height - 9).offset(Direction.SOUTH, x), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.up(height - 9).offset(Direction.SOUTH, x)).with(PillarBlock.AXIS, Direction.Axis.Z)));

                //up 4
                replacer.accept(startPos.south(4).offset(Direction.UP, height - 10), (BlockState) Function.identity().apply(config.trunkProvider
                        .get(random, startPos.south(4).offset(Direction.UP, height - 10)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                for (int y = 0; y <= 7; y++) {
                    //up 5
                    replacer.accept(startPos.up(-1).offset(Direction.UP, height + y), (BlockState) Function.identity().apply(config.trunkProvider
                            .get(random, startPos.up(-1).offset(Direction.UP, height + y)).with(PillarBlock.AXIS, Direction.Axis.Y)));
                }
            }
        }
            /*
            replacer.accept(startPos.up(i).offset(Direction.EAST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                    .get(random, startPos.up(i).offset(Direction.EAST, 1)).with(PillarBlock.AXIS, Direction.Axis.X)));
            replacer.accept(startPos.up(i).offset(Direction.WEST, 1), (BlockState) Function.identity().apply(config.trunkProvider
                    .get(random, startPos.up(i).offset(Direction.WEST, 1)).with(PillarBlock.AXIS, Direction.Axis.X)));

            replacer.accept(startPos.east(1).offset(Direction.UP, i), (BlockState) Function.identity().apply(config.trunkProvider
                    .get(random, startPos.east(1).offset(Direction.UP, i)).with(PillarBlock.AXIS, Direction.Axis.Y)));
            replacer.accept(startPos.west(1).offset(Direction.UP, i), (BlockState) Function.identity().apply(config.trunkProvider
                    .get(random, startPos.west(1).offset(Direction.UP, i)).with(PillarBlock.AXIS, Direction.Axis.Y)));

             */

        return ImmutableList.of(new FoliagePlacer.TreeNode(startPos.up(height), 0, false));
    }
}
