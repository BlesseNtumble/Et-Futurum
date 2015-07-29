package ganymedes01.etfuturum.items;

import ganymedes01.etfuturum.EtFuturum;
import ganymedes01.etfuturum.IConfigurable;
import ganymedes01.etfuturum.core.utils.Utils;
import net.minecraft.item.ItemFood;

public class PoppedChorusFruit extends ItemFood implements IConfigurable {

	public PoppedChorusFruit() {
		super(1, 0.6F, false);
		setTextureName("chorus_fruit_popped");
		setUnlocalizedName(Utils.getUnlocalisedName("chorus_fruit_popped"));
		setCreativeTab(EtFuturum.enableChorusFruit ? EtFuturum.creativeTab : null);
	}

	@Override
	public boolean isEnabled() {
		return EtFuturum.enableChorusFruit;
	}
}