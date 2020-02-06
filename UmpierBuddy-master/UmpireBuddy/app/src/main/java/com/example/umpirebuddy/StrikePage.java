package com.example.umpirebuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StrikePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button backButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strike_page);

        backButton = (Button) findViewById(R.id.goback);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
