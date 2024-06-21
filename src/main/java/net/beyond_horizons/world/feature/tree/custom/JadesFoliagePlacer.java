package net.beyond_horizons.world.feature.tree.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.beyond_horizons.world.feature.tree.ModFoliagePlacerTypes;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class JadesFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<JadesFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(chestnutFoliagePlacerInstance ->
            fillFoliagePlacerFields(chestnutFoliagePlacerInstance).and(Codec.intRange(0, 12).fieldOf("height")
                    .forGetter(instance -> instance.height)).apply(chestnutFoliagePlacerInstance, JadesFoliagePlacer::new));
    private final int height;

    public JadesFoliagePlacer(IntProvider radius, IntProvider offset, int height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    protected FoliagePlacerType<?> getType() {
        return ModFoliagePlacerTypes.JADES_FOLIAGE_PLACER;
    }

    @Override
    protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight,
                            TreeNode treeNode, int foliageHeight, int radius, int offset) {

        // generateSquare(world, placer, random, config, treeNode.getCenter());
        // radius on how many blocks it extends into x and z direction
        // y how much offset in the y direction from treeNode.getCenter()
        // y if it is dependent on i, also offsets each new layer in the y direction

        generateSquare(world, placer, random, config, treeNode.getCenter().north(5), 3, 2, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().north(5), 2, 3, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().north(5), 1, 4, treeNode.isGiantTrunk());

        generateSquare(world, placer, random, config, treeNode.getCenter().south(5), 3, 0, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(5), 2, 1, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(5), 1, 2, treeNode.isGiantTrunk());

        generateSquare(world, placer, random, config, treeNode.getCenter().west(6), 3, -8, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().west(6), 2, -7, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().west(6), 1, -6, treeNode.isGiantTrunk());

        generateSquare(world, placer, random, config, treeNode.getCenter().north(4), 3, -5, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().north(4), 2, -4, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().north(4), 1, -3, treeNode.isGiantTrunk());

        generateSquare(world, placer, random, config, treeNode.getCenter().south(4), 3, -11, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(4), 2, -10, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(4), 1, -9, treeNode.isGiantTrunk());

        generateSquare(world, placer, random, config, treeNode.getCenter().south(0), 3, 6, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(0), 2, 7, treeNode.isGiantTrunk());
        generateSquare(world, placer, random, config, treeNode.getCenter().south(0), 1, 8, treeNode.isGiantTrunk());
    }

    @Override
    public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
        return this.height;
    }

    @Override
    protected boolean isInvalidForLeaves(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
        return false;
    }
}
