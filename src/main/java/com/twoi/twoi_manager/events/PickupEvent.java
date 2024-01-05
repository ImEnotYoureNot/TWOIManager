package com.twoi.twoi_manager.events;

import com.twoi.twoi_manager.TWOIManager;
import com.twoi.twoi_manager.items.ModItems;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
public class PickupEvent {
    @Mod.EventBusSubscriber(modid = TWOIManager.MOD_ID)
    public static class PickupEventHandler {
        @SubscribeEvent
        public static void pickupItem(EntityItemPickupEvent event) {
            String pickedItem = event.getItem().getItem().getItem() + "";

            if(pickedItem.equals(ModItems.ARTIFACT_VIOLET.getId().getPath())){
                System.out.println(event.getEntity());
            }
        }
    }
}
