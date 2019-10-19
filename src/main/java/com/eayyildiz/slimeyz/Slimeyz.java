package com.eayyildiz.slimeyz;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("slimeyz")
public class Slimeyz
{

    public Slimeyz() {
        
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
       
    }
}
