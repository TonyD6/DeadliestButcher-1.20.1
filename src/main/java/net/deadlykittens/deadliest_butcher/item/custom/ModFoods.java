package net.deadlykittens.deadliest_butcher.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    //Generics
    public static final FoodProperties RAWRIBS = new FoodProperties.Builder().meat().nutrition(1).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.HUNGER,600),.8f).build();
    public static final FoodProperties RAWPRIMERIBS = new FoodProperties.Builder().meat().nutrition(1).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.HUNGER,600),.8f).build();
    public static final FoodProperties RAWBRISKET = new FoodProperties.Builder().meat().nutrition(1).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.HUNGER,600),.8f).build();
    public static final FoodProperties RAWLOIN = new FoodProperties.Builder().meat().nutrition(1).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.HUNGER,600),.8f).build();
    //Specifics
    public static final FoodProperties RAWPIGSFEET = new FoodProperties.Builder().meat().nutrition(1).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.HUNGER,600),.8f).build();
    public static final FoodProperties RAWCHICKENLEG = new FoodProperties.Builder().meat().nutrition(1).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.HUNGER,600),.8f).build();
    public static final FoodProperties RAWCHICKENWING = new FoodProperties.Builder().meat().nutrition(1).saturationMod(0).effect(() -> new MobEffectInstance(MobEffects.HUNGER,600),.8f).build();

}

