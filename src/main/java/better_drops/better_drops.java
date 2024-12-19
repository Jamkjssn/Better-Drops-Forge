package better_drops;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(better_drops.MODID)
public class better_drops
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "better_drops";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    // Create a Deferred Register to hold Blocks which will all be registered under the "better_drops" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "better_drops" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "better_drops" namespace
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // My Created new block
    // First the block is registered
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(5.0f, 6.0f)));
    // Then I register the block as an item
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItem(RUBY_BLOCK.get(), new Item.Properties()));


    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));

    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build())));

    // armadillo_stew
    public static final RegistryObject<Item> ARMADILLO_STEW = ITEMS.register("armadillo_stew", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(2f)
            .build())));

    // axolotl_gill
    public static final RegistryObject<Item> AXOLOTL_GILL = ITEMS.register("axolotl_gill", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.1f)
            .alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0), 1.0F)
            .build())));

    // chevon
    public static final RegistryObject<Item> CHEVON = ITEMS.register("chevon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // chevon_stew
    public static final RegistryObject<Item> CHEVON_STEW = ITEMS.register("chevon_stew", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // cooked_chevon
    public static final RegistryObject<Item> COOKED_CHEVON = ITEMS.register("cooked_chevon", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // cooked_camel
    public static final RegistryObject<Item> COOKED_CAMEL = ITEMS.register("cooked_camel", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // cooked_feline
    public static final RegistryObject<Item> COOKED_FELINE = ITEMS.register("cooked_feline", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // cooked_jingle_meat
    public static final RegistryObject<Item> COOKED_JINGLE_MEAT = ITEMS.register("cooked_jingle_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // cooked_piglin
    public static final RegistryObject<Item> COOKED_PIGLIN = ITEMS.register("cooked_piglin", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // cooked_sniffer_leg
    public static final RegistryObject<Item> COOKED_SNIFFER_LEG = ITEMS.register("cooked_sniffer_leg", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // cooked_villager
    public static final RegistryObject<Item> COOKED_VILLAGER = ITEMS.register("cooked_villager", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // cuisses_de_grenouilles
    public static final RegistryObject<Item> CUISSES_DE_GRENOUILLES = ITEMS.register("cuisses_de_grenouilles", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // dolphin_fin
    public static final RegistryObject<Item> DOLPHIN_FIN = ITEMS.register("dolphin_fin", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // ender_carapace
    public static final RegistryObject<Item> ENDER_CARAPACE = ITEMS.register("ender_carapace", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // ender_stew
    public static final RegistryObject<Item> ENDER_STEW = ITEMS.register("ender_stew", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // fox_tail
    public static final RegistryObject<Item> FOX_TAIL = ITEMS.register("fox_tail", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // fox_tail_stew
    public static final RegistryObject<Item> FOX_TAIL_STEW = ITEMS.register("fox_tail_stew", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // frog_legs
    public static final RegistryObject<Item> FROG_LEGS = ITEMS.register("frog_legs", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // incorporeal_meat
    public static final RegistryObject<Item> INCORPOREAL_MEAT = ITEMS.register("incorporeal_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // incorporeal_stew
    public static final RegistryObject<Item> INCORPOREAL_STEW = ITEMS.register("incorporeal_stew", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // jingle_meat
    public static final RegistryObject<Item> JINGLE_MEAT = ITEMS.register("jingle_meat", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // popped_bee
    public static final RegistryObject<Item> POPPED_BEE = ITEMS.register("popped_bee", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // raw_armadillo
    public static final RegistryObject<Item> RAW_ARMADILLO = ITEMS.register("raw_armadillo", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // raw_bee
    public static final RegistryObject<Item> RAW_BEE = ITEMS.register("raw_bee", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // raw_camel
    public static final RegistryObject<Item> RAW_CAMEL = ITEMS.register("raw_camel", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // raw_feline
    public static final RegistryObject<Item> RAW_FELINE = ITEMS.register("raw_feline", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // raw_piglin
    public static final RegistryObject<Item> RAW_PIGLIN = ITEMS.register("raw_piglin", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // raw_villager
    public static final RegistryObject<Item> RAW_VILLAGER = ITEMS.register("raw_villager", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // sniffer_leg
    public static final RegistryObject<Item> SNIFFER_LEG = ITEMS.register("sniffer_leg", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // tadpole
    public static final RegistryObject<Item> TADPOLE = ITEMS.register("tadpole", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.5f)
            .build())));

    // Creates a creative tab with the id "better_drops" for all better_drops items
    public static final RegistryObject<CreativeModeTab> Better_Drops_Tab = CREATIVE_MODE_TABS.register("better_drops", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.FOOD_AND_DRINKS)
            .icon(() -> ARMADILLO_STEW.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ARMADILLO_STEW.get());
                output.accept(AXOLOTL_GILL.get());
                output.accept(CHEVON.get());
                output.accept(CHEVON_STEW.get());
                output.accept(COOKED_CAMEL.get());
                output.accept(COOKED_CHEVON.get());
                output.accept(COOKED_FELINE.get());
                output.accept(COOKED_JINGLE_MEAT.get());
                output.accept(COOKED_PIGLIN.get());
                output.accept(COOKED_SNIFFER_LEG.get());
                output.accept(COOKED_VILLAGER.get());
                output.accept(CUISSES_DE_GRENOUILLES.get());
                output.accept(DOLPHIN_FIN.get());
                output.accept(ENDER_CARAPACE.get());
                output.accept(ENDER_STEW.get());
                output.accept(FOX_TAIL.get());
                output.accept(FOX_TAIL_STEW.get());
                output.accept(FROG_LEGS.get());
                output.accept(INCORPOREAL_MEAT.get());
                output.accept(INCORPOREAL_STEW.get());
                output.accept(JINGLE_MEAT.get());
                output.accept(POPPED_BEE.get());
                output.accept(RAW_ARMADILLO.get());
                output.accept(RAW_BEE.get());
                output.accept(RAW_CAMEL.get());
                output.accept(RAW_FELINE.get());
                output.accept(RAW_PIGLIN.get());
                output.accept(RAW_VILLAGER.get());
                output.accept(SNIFFER_LEG.get());
                output.accept(TADPOLE.get());
            }).build());

    public better_drops(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        CREATIVE_MODE_TABS.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

// Commenting this out for now since the config file is empty and frankly I dont know what this is
//        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
//        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

// Commenting this out for now since the config file is empty and frankly I dont know what this is

//        if (Config.logDirtBlock)
//            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
//
//        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);
//
//        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

// The two functions below are not important right now but are placeholders for possible future needs

//    // You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(ServerStartingEvent event)
//    {
//        // Do something when the server starts
//        LOGGER.info("HELLO from server starting");
//    }

    // This is going to handle entity drops by checking for when things die
    @Mod.EventBusSubscriber(modid = better_drops.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class EventHandlers {
        @SubscribeEvent
        public static void onLivingDrops(LivingDropsEvent event) {
            // Check for instance of mob death
            if (event.getEntity() instanceof Axolotl) {
                ItemEntity drop = new ItemEntity(
                        event.getEntity().level(),
                        event.getEntity().getX(),
                        event.getEntity().getY(),
                        event.getEntity().getZ(),
                        new ItemStack(AXOLOTL_GILL.get())
                );
                event.getDrops().add(drop);
            }

        }

    }
}
