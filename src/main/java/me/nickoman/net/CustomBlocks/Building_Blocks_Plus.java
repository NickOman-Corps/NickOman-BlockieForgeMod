package me.nickoman.net.CustomBlocks;

import com.google.common.base.Supplier;
import me.nickoman.net.BlockieMain;
import me.nickoman.net.CustomItems.TestItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class Building_Blocks_Plus {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockieMain.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = TestItem.ITEMS;

    public static final RegistryObject<Block> POLISHED_GRANITE_BRICKS = register("polished_granite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(3.0f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BlockieMain.BUILDING_BLOCKS_PLUS)));

    public static final RegistryObject<Block> POLISHED_ANDESITE_BRICKS = register("polished_andesite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(3.0f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BlockieMain.BUILDING_BLOCKS_PLUS)));

    public static final RegistryObject<Block> POLISHED_DIORITE_BRICKS = register("polished_diorite_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(3.0f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BlockieMain.BUILDING_BLOCKS_PLUS)));

    public static final RegistryObject<Block> MOSSY_BRICKS = register("mossy_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE).strength(3.0f)
                    .sound(SoundType.METAL).requiresCorrectToolForDrops()),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(BlockieMain.BUILDING_BLOCKS_PLUS)));

    private static <T extends Block> RegistryObject<T> registerBlock(final String name,
                                                                     final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
                                                                Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}
