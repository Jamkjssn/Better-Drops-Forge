package net.betterdrops.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public static final FoodComponent ARMADILLO_STEW = createStew(4).build();
    public static final FoodComponent AXOLOTL_GILL = new FoodComponent.Builder().nutrition(1).alwaysEdible().build();
    public static final FoodComponent BAT_WINGS = new FoodComponent.Builder().nutrition(1).alwaysEdible().build();
    public static final FoodComponent CHEVON = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final FoodComponent CHEVON_STEW = createStew(5).build();
    public static final FoodComponent COOKED_CAMEL = new FoodComponent.Builder().nutrition(9).saturationModifier(0.8f).build();
    public static final FoodComponent COOKED_CHEVON = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodComponent COOKED_FELINE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();
    // Cooked jingle meat
    public static final FoodComponent COOKED_PIGLIN = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodComponent COOKED_SNIFFER_LEG = new FoodComponent.Builder().nutrition(5).saturationModifier(0.7f).build();
    public static final FoodComponent COOKED_VILLAGER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();
    public static final FoodComponent CUISSES_DE_GRENOUILLES = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5f).build();
    public static final FoodComponent DOLPHIN_FIN = new FoodComponent.Builder().nutrition(2).build();
    public static final FoodComponent DOLPHIN_STEW = createStew(4).build();
    public static final FoodComponent ENDER_CARAPACE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final FoodComponent ENDER_STEW = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6f).build();
    public static final FoodComponent FELINE_STEW = createStew(4).build();
    public static final FoodComponent FOX_TAIL = new FoodComponent.Builder().nutrition(0).saturationModifier(0.1f).alwaysEdible().build();
    public static final FoodComponent FOX_TAIL_STEW = createStew(3).build();
    public static final FoodComponent FROG_LEGS = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2f).build();
    // Incorporeal Meat
    // Incorporeal Stew
    // Jingle Meat
    public static final FoodComponent POPPED_BEE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.4f).alwaysEdible().build();
    public static final FoodComponent RAW_ARMADILLO = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodComponent RAW_BEE = new FoodComponent.Builder().nutrition(0).saturationModifier(0.2f).alwaysEdible().build();
    public static final FoodComponent RAW_CAMEL = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();
    public static final FoodComponent RAW_FELINE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.15f).build();
    public static final FoodComponent RAW_PIGLIN = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final FoodComponent RAW_VILLAGER = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).alwaysEdible().build();
    // Silent Stew
    public static final FoodComponent SNIFFER_LEG = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3f).build();
    public static final FoodComponent TADPOLE = new FoodComponent.Builder().nutrition(1).saturationModifier(0).alwaysEdible().build();

    public static final ConsumableComponent AXOLOTL_GILL_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0), 1.0f))
            .build();
    public static final ConsumableComponent BAT_WINGS_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.7f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 0.7f))
            .build();
    public static final ConsumableComponent CHEVON_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 0), 0.5f))
            .build();
    public static final ConsumableComponent COOKED_VILLAGER_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, -1, 0), 1f))
            .build();
    public static final ConsumableComponent FROG_LEGS_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 0), 0.8f))
            .build();
    public static final ConsumableComponent RAW_ARMADILLO_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 0), 0.6f))
            .build();
    public static final ConsumableComponent RAW_BEE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 0), 0.8f))
            .build();
    public static final ConsumableComponent RAW_CAMEL_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 0), 0.6f))
            .build();
    public static final ConsumableComponent RAW_FELINE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 0), 0.6f))
            .build();
    public static final ConsumableComponent RAW_PIGLIN_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 0), 0.6f))
            .build();
    public static final ConsumableComponent RAW_VILLAGER_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, -1, 0), 1f))
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f))
            .build();
    public static final ConsumableComponent TADPOLE_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 0), 1f))
            .build();

    private static FoodComponent.Builder createStew(int nutrition) {
        return new FoodComponent.Builder().nutrition(nutrition).saturationModifier(0.6f);
    }
}
