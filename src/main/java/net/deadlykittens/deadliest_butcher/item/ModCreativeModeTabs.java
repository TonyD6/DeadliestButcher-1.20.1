package net.deadlykittens.deadliest_butcher.item;

import net.deadlykittens.Deadliest_Butcher;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Deadliest_Butcher.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RAW_MEATS = CREATIVE_MODE_TABS.register("raw_meats",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAWRIBS.get()))
                    .title(Component.translatable("creativetab.raw_meats"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAWRIBS.get());
                        output.accept(ModItems.RAWPRIMERIBS.get());
                        output.accept(ModItems.RAWBRISKET.get());
                        output.accept(ModItems.RAWLOIN.get());
                        output.accept(ModItems.RAWPIGSFEET.get());
                        output.accept(ModItems.RAWCHICKENLEG.get());
                        output.accept(ModItems.RAWCHICKENWING.get());


                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
