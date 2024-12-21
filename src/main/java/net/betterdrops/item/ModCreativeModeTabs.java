package net.betterdrops.item;

import net.betterdrops.BetterDrops;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterDrops.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTERDROPS_TAB = CREATIVE_MODE_TABS.register("betterdrops_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARMADILLO_STEW.get()))
                    .title(Component.translatable("creativetab.betterdrops.betterdrops_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.JINGLE_MEAT.get());
                        output.accept(ModItems.COOKED_JINGLE_MEAT.get());
                        output.accept(ModItems.SILENT_STEW.get());
                        output.accept(ModItems.RAW_ARMADILLO.get());
                        output.accept(ModItems.ARMADILLO_STEW.get());
                        output.accept(ModItems.AXOLOTL_GILL.get());
                        output.accept(ModItems.BAT_WINGS.get());
                        output.accept(ModItems.RAW_BEE.get());
                        output.accept(ModItems.POPPED_BEE.get());
                        output.accept(ModItems.RAW_CAMEL.get());
                        output.accept(ModItems.COOKED_CAMEL.get());
                        output.accept(ModItems.RAW_FELINE.get());
                        output.accept(ModItems.COOKED_FELINE.get());
                        output.accept(ModItems.FELINE_STEW.get());
                        output.accept(ModItems.DOLPHIN_FIN.get());
                        output.accept(ModItems.DOLPHIN_STEW.get());
                        output.accept(ModItems.ENDER_CARAPACE.get());
                        output.accept(ModItems.ENDER_STEW.get());
                        output.accept(ModItems.FOX_TAIL.get());
                        output.accept(ModItems.FOX_TAIL_STEW.get());
                        output.accept(ModItems.FROG_LEGS.get());
                        output.accept(ModItems.CUISSES_DE_GRENOUILLES.get());
                        output.accept(ModItems.CHEVON.get());
                        output.accept(ModItems.COOKED_CHEVON.get());
                        output.accept(ModItems.CHEVON_STEW.get());
                        output.accept(ModItems.RAW_PIGLIN.get());
                        output.accept(ModItems.COOKED_PIGLIN.get());
                        output.accept(ModItems.SILVERFISH_WOOL.get());
                        output.accept(ModItems.SNIFFER_LEG.get());
                        output.accept(ModItems.COOKED_SNIFFER_LEG.get());
                        output.accept(ModItems.TADPOLE.get());
                        output.accept(ModItems.RAW_VILLAGER.get());
                        output.accept(ModItems.COOKED_VILLAGER.get());
                        output.accept(ModItems.INCORPOREAL_MEAT.get());
                        output.accept(ModItems.INCORPOREAL_STEW.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
