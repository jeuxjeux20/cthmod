package com.dieutourtechonology.cthmod.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CthBlock extends BasicBlock {
	
	public static final String ID = "cth_block";
	
	public CthBlock() {
		super("cth_block",Material.rock,7.2F,75F);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(3F);
	}
	private Random rand = new Random();
	
	public static final String[] nopeMessages = new String[] {
			"no",
			"stop breaking me and go on epicub",
			"u waste ur time",
			"can u just go outside and plai ?",
			"me is pro haxor, u is bad haxor, so gtfo"
	};
	
	@Override
	public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
		if (rand.nextInt(101) < 10) {
			if (!world.isRemote) {
				player.addChatMessage(new ChatComponentText("ok ok u got me now :'( !"));
			}
			player.setHealth(player.getHealth() - 1);
			return world.setBlockToAir(pos);
		}
		else {
			if (!world.isRemote) {
				player.addChatMessage(new ChatComponentText(nopeMessages[rand.nextInt(5)]));
			}
			return false;
		}
	}
	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		ArrayList<ItemStack> list = new ArrayList<ItemStack>();
		list.add(new ItemStack(Items.redstone,rand.nextInt(15) + 1));
		if (rand.nextInt(101) < 5) {
			list.add(new ItemStack(Item.getItemFromBlock(this)));
		}
		return list;
	}
}
