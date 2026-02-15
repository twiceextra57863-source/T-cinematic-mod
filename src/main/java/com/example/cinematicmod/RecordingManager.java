package com.example.cinematicmod;

public class RecordingManager {
    private boolean recording = false;
    private boolean paused = false;

    public void startRecording() {
        recording = true;
        paused = false;
        System.out.println("Recording started!");
    }

    public void pauseRecording() {
        if (recording) {
            paused = !paused;
            System.out.println(paused ? "Recording paused." : "Recording resumed.");
        }
    }

    public void stopRecording() {
        recording = false;
        paused = false;
        System.out.println("Recording stopped!");
    }

    public boolean isRecording() {
        return recording;
    }

    public boolean isPaused() {
        return paused;
    }
}
