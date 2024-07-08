package io.github.nitianstudio.reteastory.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class DefaultBlock extends Block {
    public DefaultBlock(Properties properties) {
        super(properties);
    }

    public static @NotNull VoxelShape box(double beginX,
                                          double beginY,
                                          double beginZ,
                                          double length,
                                          double height,
                                          double width) {
        return Block.box(beginX, beginY, beginZ, beginX + length, beginY + height, beginZ + width);
    }
}
