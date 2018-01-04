package com.dieutourtechonology.cthmod.items.client.render.items;

import com.dieutourtechonology.cthmod.Main;
import com.dieutourtechonology.cthmod.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	private static String id = Main.MODID;
	
	public static void reg(Item item) {
		String name = id +":" + item.getUnlocalizedName().substring(5);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(name,"inventory"));
		System.out.println("Registered name : " + name);
	}
	public static void registerItemRender() {
		reg (ModItems.thingyItem);
	}
}
