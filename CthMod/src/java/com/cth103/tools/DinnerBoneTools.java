package com.cth103.tools;

import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import java.util.ArrayList;

/*
 * @author Cth103
 */
public final class DinnerBoneTools {
    @SubscribeEvent
    public void doRender(RenderLivingEvent.Pre event) {
        rotateCorpse(event.entity);
    }
    public ArrayList<Entity> entitiesWaiting = new ArrayList<Entity>(); 
    private void rotateCorpse(Entity bat) {
        for (Entity temp : entitiesWaiting) {
            if (temp == bat) {
               GlStateManager.translate(0.0F, bat.height + 0.1F, 0.0F);
               GlStateManager.rotate(180.0F, 0.0F, 0.0F, 0.0F);
               GlStateManager.rotate(180.0F, 0.0F, 180.0F, 0.0F);
            }
        }
        
    }
    public void registerEntityToRotate(Entity e) {
    entitiesWaiting.add(e);
    } 
}