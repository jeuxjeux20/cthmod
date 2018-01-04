package com.dieutourtechonology.cthmod.items;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	public static MomItem thingyItem;
	
	public static void createItems() {
		GameRegistry.registerItem(thingyItem = new MomItem(), "mom");
	}
}
