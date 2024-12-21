package net.betterdrops.item;

import net.betterdrops.BetterDrops;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BetterDrops.MOD_ID);

    public static final RegistryObject<Item> ARMADILLO_STEW = ITEMS.register("armadillo_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ARMADILLO_STEW)));
    public static final RegistryObject<Item> AXOLOTL_GILL = ITEMS.register("axolotl_gill",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AXOLOTL_GILL)));
    public static final RegistryObject<Item> BAT_WINGS = ITEMS.register("bat_wings",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BAT_WINGS)));
    public static final RegistryObject<Item> CHEVON = ITEMS.register("chevon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEVON)));
    public static final RegistryObject<Item> CHEVON_STEW = ITEMS.register("chevon_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEVON_STEW)));
    public static final RegistryObject<Item> COOKED_CAMEL = ITEMS.register("cooked_camel",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CAMEL)));
    public static final RegistryObject<Item> COOKED_CHEVON = ITEMS.register("cooked_chevon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CHEVON)));
    public static final RegistryObject<Item> COOKED_FELINE = ITEMS.register("cooked_feline",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_FELINE)));
    public static final RegistryObject<Item> COOKED_JINGLE_MEAT = ITEMS.register("cooked_jingle_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_JINGLE_MEAT)));
    public static final RegistryObject<Item> COOKED_PIGLIN = ITEMS.register("cooked_piglin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_PIGLIN)));
    public static final RegistryObject<Item> COOKED_SNIFFER_LEG = ITEMS.register("cooked_sniffer_leg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_SNIFFER_LEG)));
    public static final RegistryObject<Item> COOKED_VILLAGER = ITEMS.register("cooked_villager",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_VILLAGER)));
    public static final RegistryObject<Item> CUISSES_DE_GRENOUILLES = ITEMS.register("cuisses_de_grenouilles",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CUISSES_DE_GRENOUILLES)));
    public static final RegistryObject<Item> DOLPHIN_FIN = ITEMS.register("dolphin_fin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DOLPHIN_FIN)));
    public static final RegistryObject<Item> DOLPHIN_STEW = ITEMS.register("dolphin_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DOLPHIN_STEW)));
    public static final RegistryObject<Item> ENDER_CARAPACE = ITEMS.register("ender_carapace",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ENDER_CARAPACE)));
    public static final RegistryObject<Item> ENDER_STEW = ITEMS.register("ender_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ENDER_STEW)));
    public static final RegistryObject<Item> FELINE_STEW = ITEMS.register("feline_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FELINE_STEW)));
    public static final RegistryObject<Item> FOX_TAIL = ITEMS.register("fox_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOX_TAIL)));
    public static final RegistryObject<Item> FOX_TAIL_STEW = ITEMS.register("fox_tail_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOX_TAIL_STEW)));
    public static final RegistryObject<Item> FROG_LEGS = ITEMS.register("frog_legs",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FROG_LEGS)));
    public static final RegistryObject<Item> INCORPOREAL_MEAT = ITEMS.register("incorporeal_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.INCORPOREAL_MEAT)));
    public static final RegistryObject<Item> INCORPOREAL_STEW = ITEMS.register("incorporeal_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.INCORPOREAL_STEW)));
    public static final RegistryObject<Item> JINGLE_MEAT = ITEMS.register("jingle_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JINGLE_MEAT)));
    public static final RegistryObject<Item> POPPED_BEE = ITEMS.register("popped_bee",
            () -> new Item(new Item.Properties().food(ModFoodProperties.POPPED_BEE)));
    public static final RegistryObject<Item> RAW_ARMADILLO = ITEMS.register("raw_armadillo",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_ARMADILLO)));
    public static final RegistryObject<Item> RAW_BEE = ITEMS.register("raw_bee",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BEE)));
    public static final RegistryObject<Item> RAW_CAMEL = ITEMS.register("raw_camel",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_CAMEL)));
    public static final RegistryObject<Item> RAW_FELINE = ITEMS.register("raw_feline",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_FELINE)));
    public static final RegistryObject<Item> RAW_PIGLIN = ITEMS.register("raw_piglin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_PIGLIN)));
    public static final RegistryObject<Item> RAW_VILLAGER = ITEMS.register("raw_villager",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_VILLAGER)));
    public static final RegistryObject<Item> SILENT_STEW = ITEMS.register("silent_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SILENT_STEW)));
    public static final RegistryObject<Item> SILVERFISH_WOOL = ITEMS.register("silverfish_wool",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SNIFFER_LEG = ITEMS.register("sniffer_leg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SNIFFER_LEG)));
    public static final RegistryObject<Item> TADPOLE = ITEMS.register("tadpole",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TADPOLE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
