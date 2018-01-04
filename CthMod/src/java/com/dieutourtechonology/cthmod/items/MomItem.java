package com.dieutourtechonology.cthmod.items;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class MomItem extends BasicItem {
	
	public MomItem() {
		super("mom");
		this.setMaxDamage(10);
		this.maxStackSize = 1;		
	}
	
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		playerIn.addPotionEffect(new PotionEffect(2, 500, 3)); // Add slowness 3
		ItemStack stack = super.onItemRightClick(itemStackIn, worldIn, playerIn); // Get the item stack
		if (!stack.isItemEnchanted()) { // If it isn't yet enchanted
			stack.addEnchantment(Enchantment.knockback, 3); // Add knockback level 3
			if (!worldIn.isRemote)
				playerIn.addChatMessage(new ChatComponentText("Behold, the mighty power of Internet Explorer !"));
		}		
		stack.damageItem(5, playerIn); // Damage the current stack
		return stack; // Return the new processed stack		
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if (stack.isItemEnchanted()) {
			player.addPotionEffect(new PotionEffect(2, 100, 8));
			entity.setPosition(entity.posX, entity.posY - 0.25, entity.posZ);
		}
		return true;
	}
}
