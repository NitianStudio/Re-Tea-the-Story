package cloud.lemonslice.teastory.common.block;

import io.github.nitianstudio.reteastory.common.block.DefaultBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BowlBlock extends DefaultBlock {

    protected static VoxelShape SHAPE = box(4, 0, 4, 8, 7, 8);

    public BowlBlock(Properties properties)
    {
        super(properties);
    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState blockState,
                                           BlockGetter blockGetter,
                                           BlockPos blockPos,
                                           CollisionContext collisionContext) {
        return SHAPE;
    }


}
