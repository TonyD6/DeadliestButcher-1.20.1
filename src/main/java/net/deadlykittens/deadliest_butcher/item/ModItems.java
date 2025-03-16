package net.deadlykittens.deadliest_butcher.item;

import net.deadlykittens.Deadliest_Butcher;
import net.deadlykittens.deadliest_butcher.item.custom.ModFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Deadliest_Butcher.MOD_ID);


    //Generic Raw Meats
    public static final RegistryObject<Item> RAWRIBS = ITEMS.register("rawribs",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.RAWRIBS)));
    public static final RegistryObject<Item> RAWPRIMERIBS = ITEMS.register("rawprimeribs",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.RAWPRIMERIBS)));
    public static final RegistryObject<Item> RAWBRISKET = ITEMS.register("rawbrisket",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.RAWBRISKET)));
    public static final RegistryObject<Item> RAWLOIN = ITEMS.register("rawloin",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.RAWLOIN)));
    //Specific Raw Meats
    public static final RegistryObject<Item> RAWPIGSFEET = ITEMS.register("rawpigsfeet",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.RAWPIGSFEET)));
    public static final RegistryObject<Item> RAWCHICKENLEG = ITEMS.register("rawchickenleg",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.RAWCHICKENLEG)));
    public static final RegistryObject<Item> RAWCHICKENWING = ITEMS.register("rawchickenwing",
            () -> new Item(new Item.Properties().stacksTo(16).food(ModFoods.RAWCHICKENWING)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
