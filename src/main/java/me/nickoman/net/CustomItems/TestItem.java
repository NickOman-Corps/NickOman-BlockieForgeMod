package me.nickoman.net.CustomItems;

import com.google.common.base.Supplier;

import me.nickoman.net.BlockieMain;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TestItem {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlockieMain.MOD_ID);

	public static final RegistryObject<Item> TEST_ITEM = register("test_item",
			() -> new Item(new Item.Properties().tab(BlockieMain.BLOCKIE_FORGE_TAB)));

	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
