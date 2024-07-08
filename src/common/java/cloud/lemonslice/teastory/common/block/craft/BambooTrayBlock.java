package cloud.lemonslice.teastory.common.block.craft;

import com.google.common.collect.Lists;
import io.github.nitianstudio.reteastory.common.block.DefaultBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BambooTrayBlock extends DefaultBlock implements EntityBlock {

    protected static final VoxelShape SHAPE;

    public BambooTrayBlock(Properties properties) {
        super(properties);
    }

    static
    {
        VoxelShape side_north = box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 2.0D);
        VoxelShape side_south = box(0.0D, 0.0D, 14.0D, 16.0D, 3.0D, 2.0D);
        VoxelShape side_west = box(0.0D, 0.0D, 0.0D, 2.0D, 3.0D, 16.0D);
        VoxelShape side_east = box(14.0D, 0.0D, 0.0D, 2.0D, 3.0D, 16.0D);
        VoxelShape bottom = box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D);
        SHAPE = Shapes.or(side_north, side_south, side_east, side_west, bottom);
    }

    @Override
    protected List<ItemStack> getDrops(BlockState blockState, LootParams.Builder builder) {
        return Lists.newArrayList(new ItemStack(this));
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }
}
