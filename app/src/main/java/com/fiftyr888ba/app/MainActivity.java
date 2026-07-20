package com.fiftyr888ba.app;

import com.fiftyr888ba.app.ai.AIChat;

public class MainActivity {

    public static void main(String[] args) {
        AIChat chat = new AIChat();
        System.out.println(chat.reply("Assalomu alaykum"));
    }

}
