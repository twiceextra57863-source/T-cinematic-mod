package com.example.cinematicmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;

public class CinematicMod implements ModInitializer {
    public static KeyBinding replayKey;

    @Override
    public void onInitialize() {
        replayKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.cinematicmod.replay",
                GLFW.GLFW_KEY_T,
                "category.cinematicmod"
        ));
        System.out.println("Cinematic Replay Mod initialized!");
    }
}
