package net.aj.tutorialmod.item;

//The mod-item class is quite important because this will baasically hold all of our items that we are going to register for our mod.
//The way we registered an item is by via a deffered register.

import net.aj.tutorialmod.TutorialMod;

import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class modItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);  //A deferred register is a long list of certain things


    //How to add an item:
    public static final RegistryObject<Item> SAPPHIRE =
            ITEMS.register("sapphire",
                    () -> new Item(new Item.Properties()));          //() -> = supplier

    public static void register(IEventBus eventBus) //To register the deferredRegistered
    {
        ITEMS.register(eventBus);

    }



}
