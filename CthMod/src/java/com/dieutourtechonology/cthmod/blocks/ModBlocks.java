package com.dieutourtechonology.cthmod.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	/**
	 * @author jeuxjeux20 and cth103
	 * @category Blocks
	 * @since 04/01/2018
	 * @see ModBlocks
	 */
	public static CthBlock cth_block;
	
	public static void createBlocks() {
		GameRegistry.registerBlock(cth_block = new CthBlock(), CthBlock.ID);
	}
}
