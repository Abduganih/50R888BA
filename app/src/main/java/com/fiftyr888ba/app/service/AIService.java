package com.fiftyr888ba.app.service;

public class AIService {

    public String ask(String message) {
        if (message == null || message.trim().isEmpty()) {
            return "Iltimos, savol kiriting.";
        }

        return "🤖 AI javobi: " + message;
    }
}
