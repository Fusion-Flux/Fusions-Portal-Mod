package com.fusionflux.portalcubed.blocks.blockentities;

import com.fusionflux.portalcubed.blocks.PortalCubedBlocks;
import com.fusionflux.portalcubed.optionslist.OptionsListBlockEntity;
import com.fusionflux.portalcubed.optionslist.OptionsListData;
import com.fusionflux.portalcubed.optionslist.OptionsListScreenHandler;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;

public class CatapultBlockEntity extends OptionsListBlockEntity implements ExtendedScreenHandlerFactory {
    @MidnightConfig.Entry
    private double destX;

    @MidnightConfig.Entry
    private double destY;

    @MidnightConfig.Entry
    private double destZ;

    @MidnightConfig.Entry
    private double angle = 45;

    public CatapultBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
        destX = pos.getX() + 0.5;
        destY = pos.getY();
        destZ = pos.getZ() + 0.5;
    }

    public CatapultBlockEntity(BlockPos pos, BlockState state) {
        this(PortalCubedBlocks.CATAPULT_BLOCK_ENTITY, pos, state);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        OptionsListData.read(nbt, this);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        OptionsListData.write(nbt, this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return toNbt();
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.of(this);
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable(getCachedState().getBlock().getTranslationKey());
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new OptionsListScreenHandler(i, pos);
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(pos);
    }

    private double getRelX() {
        return destX - pos.getX() - 0.5;
    }

    private double getRelZ() {
        return destZ - pos.getZ() - 0.5;
    }

    public double getRelH() {
        return Math.sqrt(MathHelper.square(getRelX()) + MathHelper.square(getRelZ()));
    }

    public double getRelY() {
        return destY - pos.getY();
    }

    public double getAngle() {
        return angle;
    }

    public Vec3d getLaunchDir() {
        final double a = Math.toRadians(angle);
        return new Vec3d(getRelX(), 0, getRelZ())
            .normalize()
            .multiply(Math.cos(a))
            .add(0, Math.sin(a), 0);
    }
}
