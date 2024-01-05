package com.twoi.twoi_manager.items;

import com.twoi.twoi_manager.TWOIManager;
import com.twoi.twoi_manager.items.artifacts.ArtifactViolet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TWOIManager.MOD_ID);
    public static final RegistryObject<Item> ARTIFACT_VIOLET = ITEMS.register("artifact_violet", () -> new ArtifactViolet(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
