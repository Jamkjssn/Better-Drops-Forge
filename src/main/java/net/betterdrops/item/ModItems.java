package net.betterdrops.item;

import net.betterdrops.BetterDrops;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ARMADILLO_STEW = registerItem("armadillo_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "armadillo_stew")))
            .food(ModFoodComponents.ARMADILLO_STEW)
            .useRemainder(Items.BOWL)));
    public static final Item AXOLOTL_GILL = registerItem("axolotl_gill", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "axolotl_gill")))
            .food(ModFoodComponents.AXOLOTL_GILL, ModFoodComponents.AXOLOTL_GILL_EFFECT)));
    public static final Item BAT_WINGS = registerItem("bat_wings", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "bat_wings")))
            .food(ModFoodComponents.BAT_WINGS, ModFoodComponents.BAT_WINGS_EFFECT)));
    public static final Item CHEVON = registerItem("chevon", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "chevon")))
            .food(ModFoodComponents.CHEVON, ModFoodComponents.CHEVON_EFFECT)));
    public static final Item CHEVON_STEW = registerItem("chevon_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "chevon_stew")))
            .food(ModFoodComponents.CHEVON_STEW)));
    public static final Item COOKED_CAMEL = registerItem("cooked_camel", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "cooked_camel")))
            .food(ModFoodComponents.COOKED_CAMEL)));
    public static final Item COOKED_CHEVON = registerItem("cooked_chevon", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "cooked_chevon")))
            .food(ModFoodComponents.COOKED_CHEVON)));
    public static final Item COOKED_FELINE = registerItem("cooked_feline", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "cooked_feline")))
            .food(ModFoodComponents.COOKED_FELINE)));
    public static final Item COOKED_JINGLE_MEAT = registerItem("cooked_jingle_meat", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "cooked_jingle_meat")))));
    public static final Item COOKED_PIGLIN = registerItem("cooked_piglin", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "cooked_piglin")))
            .food(ModFoodComponents.COOKED_PIGLIN)));
    public static final Item COOKED_SNIFFER_LEG = registerItem("cooked_sniffer_leg", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "cooked_sniffer_leg")))
            .food(ModFoodComponents.COOKED_SNIFFER_LEG)));
    public static final Item COOKED_VILLAGER = registerItem("cooked_villager", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "cooked_villager")))
            .food(ModFoodComponents.COOKED_VILLAGER, ModFoodComponents.COOKED_VILLAGER_EFFECT)));
    public static final Item CUISSES_DE_GRENOUILLES = registerItem("cuisses_de_grenouilles", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "cuisses_de_grenouilles")))
            .food(ModFoodComponents.CUISSES_DE_GRENOUILLES)));
    public static final Item DOLPHIN_FIN = registerItem("dolphin_fin", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "dolphin_fin")))
            .food(ModFoodComponents.DOLPHIN_FIN)));
    public static final Item DOLPHIN_STEW = registerItem("dolphin_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "dolphin_stew")))
            .food(ModFoodComponents.DOLPHIN_STEW)));
    public static final Item ENDER_CARAPACE = registerItem("ender_carapace", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "ender_carapace")))
            .food(ModFoodComponents.ENDER_CARAPACE)));
    public static final Item ENDER_STEW = registerItem("ender_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "ender_stew")))
            .food(ModFoodComponents.ENDER_STEW)));
    public static final Item FELINE_STEW = registerItem("feline_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "feline_stew")))
            .food(ModFoodComponents.FELINE_STEW)));
    public static final Item FOX_TAIL = registerItem("fox_tail", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "fox_tail")))
            .food(ModFoodComponents.FOX_TAIL)));
    public static final Item FOX_TAIL_STEW = registerItem("fox_tail_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "fox_tail_stew")))
            .food(ModFoodComponents.FOX_TAIL_STEW)));
    public static final Item FROG_LEGS = registerItem("frog_legs", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "frog_legs")))
            .food(ModFoodComponents.FROG_LEGS, ModFoodComponents.FROG_LEGS_EFFECT)));
    public static final Item INCORPOREAL_MEAT = registerItem("incorporeal_meat", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "incorporeal_meat")))));
    public static final Item INCORPOREAL_STEW = registerItem("incorporeal_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "incorporeal_stew")))));
    public static final Item JINGLE_MEAT = registerItem("jingle_meat", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "jingle_meat")))));
    public static final Item POPPED_BEE = registerItem("popped_bee", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "popped_bee")))
            .food(ModFoodComponents.POPPED_BEE)));
    public static final Item RAW_ARMADILLO = registerItem("raw_armadillo", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "raw_armadillo")))
            .food(ModFoodComponents.RAW_ARMADILLO, ModFoodComponents.RAW_ARMADILLO_EFFECT)));
    public static final Item RAW_BEE = registerItem("raw_bee", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "raw_bee")))
            .food(ModFoodComponents.RAW_BEE, ModFoodComponents.RAW_BEE_EFFECT)));
    public static final Item RAW_CAMEL = registerItem("raw_camel", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "raw_camel")))
            .food(ModFoodComponents.RAW_CAMEL, ModFoodComponents.RAW_CAMEL_EFFECT)));
    public static final Item RAW_FELINE = registerItem("raw_feline", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "raw_feline")))
            .food(ModFoodComponents.RAW_FELINE, ModFoodComponents.RAW_FELINE_EFFECT)));
    public static final Item RAW_PIGLIN = registerItem("raw_piglin", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "raw_piglin")))
            .food(ModFoodComponents.RAW_PIGLIN, ModFoodComponents.RAW_PIGLIN_EFFECT)));
    public static final Item RAW_VILLAGER = registerItem("raw_villager", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "raw_villager")))
            .food(ModFoodComponents.RAW_VILLAGER, ModFoodComponents.RAW_VILLAGER_EFFECT)));
    public static final Item SILENT_STEW = registerItem("silent_stew", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "silent_stew")))));
    public static final Item SILVERFISH_WOOL = registerItem("silverfish_wool", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "silverfish_wool")))));
    public static final Item SNIFFER_LEG = registerItem("sniffer_leg", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "sniffer_leg")))
            .food(ModFoodComponents.SNIFFER_LEG)));
    public static final Item TADPOLE = registerItem("tadpole", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterDrops.MOD_ID, "tadpole")))
            .food(ModFoodComponents.TADPOLE, ModFoodComponents.TADPOLE_EFFECT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterDrops.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // BetterDrops.LOGGER.info("Registering Mod Items for " + BetterDrops.MOD_ID);
    }
}