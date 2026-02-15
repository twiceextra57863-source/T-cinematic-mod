package com.yourname.cinematicmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CinematicMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("cinematicmod");
    public static Recorder recorder = new Recorder();

    @Override
    public void onInitialize() {
        LOGGER.info("Cinematic Mod initialized!");
    }
}
