package net.deadlykittens.deadliest_butcher.block;

import net.deadlykittens.Deadliest_Butcher;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Deadliest_Butcher.MOD_ID);
    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }
}
