package net.betterdrops.item;

import net.betterdrops.BetterDrops;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BETTER_DROPS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BetterDrops.MOD_ID, "betterdrops_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ARMADILLO_STEW))
                    .displayName(Text.translatable("itemgroup.betterdrops.betterdrops_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.JINGLE_MEAT);
                        entries.add(ModItems.COOKED_JINGLE_MEAT);
                        entries.add(ModItems.SILENT_STEW);
                        entries.add(ModItems.RAW_ARMADILLO);
                        entries.add(ModItems.ARMADILLO_STEW);
                        entries.add(ModItems.AXOLOTL_GILL);
                        entries.add(ModItems.BAT_WINGS);
                        entries.add(ModItems.RAW_BEE);
                        entries.add(ModItems.POPPED_BEE);
                        entries.add(ModItems.RAW_CAMEL);
                        entries.add(ModItems.COOKED_CAMEL);
                        entries.add(ModItems.RAW_FELINE);
                        entries.add(ModItems.COOKED_FELINE);
                        entries.add(ModItems.FELINE_STEW);
                        entries.add(ModItems.DOLPHIN_FIN);
                        entries.add(ModItems.DOLPHIN_STEW);
                        entries.add(ModItems.ENDER_CARAPACE);
                        entries.add(ModItems.ENDER_STEW);
                        entries.add(ModItems.FOX_TAIL);
                        entries.add(ModItems.FOX_TAIL_STEW);
                        entries.add(ModItems.FROG_LEGS);
                        entries.add(ModItems.CUISSES_DE_GRENOUILLES);
                        entries.add(ModItems.CHEVON);
                        entries.add(ModItems.COOKED_CHEVON);
                        entries.add(ModItems.CHEVON_STEW);
                        entries.add(ModItems.RAW_PIGLIN);
                        entries.add(ModItems.COOKED_PIGLIN);
                        entries.add(ModItems.SILVERFISH_WOOL);
                        entries.add(ModItems.SNIFFER_LEG);
                        entries.add(ModItems.COOKED_SNIFFER_LEG);
                        entries.add(ModItems.TADPOLE);
                        entries.add(ModItems.RAW_VILLAGER);
                        entries.add(ModItems.COOKED_VILLAGER);
                        entries.add(ModItems.INCORPOREAL_MEAT);
                        entries.add(ModItems.INCORPOREAL_STEW);
                    }).build());


    public static void registerItemGroups() {
        BetterDrops.LOGGER.info("Registering Item Groupd for " + BetterDrops.MOD_ID);
    }
}
