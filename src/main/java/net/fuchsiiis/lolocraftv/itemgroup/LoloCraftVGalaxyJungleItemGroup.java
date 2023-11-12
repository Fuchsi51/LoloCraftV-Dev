
package net.fuchsiiis.lolocraftv.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.fuchsiiis.lolocraftv.block.Galaxy_JungleLogBlock;
import net.fuchsiiis.lolocraftv.LolocraftvModElements;

@LolocraftvModElements.ModElement.Tag
public class LoloCraftVGalaxyJungleItemGroup extends LolocraftvModElements.ModElement {
	public LoloCraftVGalaxyJungleItemGroup(LolocraftvModElements instance) {
		super(instance, 154);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablolo_craft_v_galaxy_jungle") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Galaxy_JungleLogBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
