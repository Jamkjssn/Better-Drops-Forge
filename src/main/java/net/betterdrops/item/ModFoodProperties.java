package net.betterdrops.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties ARMADILLO_STEW = createStew(4).alwaysEdible().build();
    public static final FoodProperties AXOLOTL_GILL = new FoodProperties.Builder().nutrition(1).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200), 1.0f).build();
    public static final FoodProperties BAT_WINGS = new FoodProperties.Builder().nutrition(1).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 600), 0.7f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 600), 0.7f).build();
    public static final FoodProperties CHEVON = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200), 0.5f).build();
    public static final FoodProperties CHEVON_STEW = createStew(5).build();
    public static final FoodProperties COOKED_CAMEL = new FoodProperties.Builder().nutrition(9).saturationModifier(0.8f).build();
    public static final FoodProperties COOKED_CHEVON = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodProperties COOKED_FELINE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f).build();
    public static final FoodProperties COOKED_JINGLE_MEAT = new FoodProperties.Builder().nutrition(0).saturationModifier(0).build();
    public static final FoodProperties COOKED_PIGLIN = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodProperties COOKED_SNIFFER_LEG = new FoodProperties.Builder().nutrition(5).saturationModifier(0.7f).build();
    public static final FoodProperties COOKED_VILLAGER = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f)
            .effect(new MobEffectInstance(MobEffects.BAD_OMEN, -1), 1.0f).build();
    public static final FoodProperties CUISSES_DE_GRENOUILLES = new FoodProperties.Builder().nutrition(3).saturationModifier(0.5f).build();
    public static final FoodProperties DOLPHIN_FIN = new FoodProperties.Builder().nutrition(2).build();
    public static final FoodProperties DOLPHIN_STEW = createStew(4).build();
    public static final FoodProperties ENDER_CARAPACE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final FoodProperties ENDER_STEW = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodProperties FELINE_STEW = createStew(4).build();
    public static final FoodProperties FOX_TAIL = new FoodProperties.Builder().nutrition(0).saturationModifier(0.6f).build();
    public static final FoodProperties FOX_TAIL_STEW = createStew(3).build();
    public static final FoodProperties FROG_LEGS = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200), 0.8f).build();
    public static final FoodProperties INCORPOREAL_MEAT = new FoodProperties.Builder().nutrition(0).saturationModifier(0).build();
    public static final FoodProperties INCORPOREAL_STEW = new FoodProperties.Builder().nutrition(0).saturationModifier(0).build();
    public static final FoodProperties JINGLE_MEAT = new FoodProperties.Builder().nutrition(0).saturationModifier(0).build();
    public static final FoodProperties POPPED_BEE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.4f).alwaysEdible().build();
    public static final FoodProperties RAW_ARMADILLO = new FoodProperties.Builder().nutrition(0).saturationModifier(0)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200), 0.5f).build();
    public static final FoodProperties RAW_BEE = new FoodProperties.Builder().nutrition(0).saturationModifier(0.2f).alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.POISON, 200), 0.8f).build();
    public static final FoodProperties RAW_CAMEL = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200), 0.6f).build();
    public static final FoodProperties RAW_FELINE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.15f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200), 0.6f).build();
    public static final FoodProperties RAW_PIGLIN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 200), 0.6f).build();
    public static final FoodProperties RAW_VILLAGER = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.BAD_OMEN, -1), 1.0f).build();
    public static final FoodProperties SILENT_STEW = createStew(0).build();
    public static final FoodProperties SNIFFER_LEG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3f).build();
    public static final FoodProperties TADPOLE = new FoodProperties.Builder().nutrition(1)
            .effect(new MobEffectInstance(MobEffects.POISON, 200), 1.0f).build();

    private static FoodProperties.Builder createStew(int pNutrition) {
        return new FoodProperties.Builder().nutrition(pNutrition).saturationModifier(0.6f).usingConvertsTo(Items.BOWL);
    }
}