
package net.fuchsiiis.lolocraftv.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.fuchsiiis.lolocraftv.itemgroup.LoloCraftVItemGroup;
import net.fuchsiiis.lolocraftv.LolocraftvModElements;

@LolocraftvModElements.ModElement.Tag
public class Fox_CoinItem extends LolocraftvModElements.ModElement {
	@ObjectHolder("lolocraftv:fox_coin")
	public static final Item block = null;

	public Fox_CoinItem(LolocraftvModElements instance) {
		super(instance, 127);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(LoloCraftVItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("fox_coin");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
