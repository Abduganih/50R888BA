package com.fiftyr888ba.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.fiftyr888ba.app.service.AIService;

public class MainActivity extends AppCompatActivity {

    private AIService aiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aiService = new AIService();

        String javob = aiService.ask("Assalomu alaykum");
        System.out.println(javob);
    }
}
