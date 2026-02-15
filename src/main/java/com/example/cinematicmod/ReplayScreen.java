package com.example.cinematicmod;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class ReplayScreen extends Screen {
    private final RecordingManager recordingManager;

    public ReplayScreen(RecordingManager manager) {
        super(Text.literal("Replay Controls"));
        this.recordingManager = manager;
    }

    @Override
    protected void init() {
        int centerX = this.width / 2;
        int centerY = this.height / 2;

        // Start button
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Start"), button -> {
            recordingManager.startRecording();
        }).dimensions(centerX - 50, centerY - 40, 100, 20).build());

        // Pause button
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Pause/Resume"), button -> {
            recordingManager.pauseRecording();
        }).dimensions(centerX - 50, centerY - 10, 100, 20).build());

        // Stop button
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Stop"), button -> {
            recordingManager.stopRecording();
        }).dimensions(centerX - 50, centerY + 20, 100, 20).build());
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);

        // Status text top-left
        String status;
        if (recordingManager.isRecording()) {
            status = recordingManager.isPaused() ? "Recording Paused" : "Recording...";
        } else {
            status = "Not Recording";
        }
        this.textRenderer.draw(matrices, status, 10, 10, 0xFFFFFF);
    }

    @Override
    public boolean shouldPause() {
        return false; // game continues running while screen is open
    }
}
