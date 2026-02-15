package com.example.cinematicmod;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyBindings {
    public static KeyBinding openReplayScreen;

    public static void register() {
        // Register a keybinding for opening the replay screen
        openReplayScreen = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.cinematicmod.open_replay", // translation key
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_T,                // default key
                "category.cinematicmod"         // category shown in controls menu
        ));
    }
}
