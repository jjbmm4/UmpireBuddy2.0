package com.example.umpirebuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int strikeCount = 0;
    private int ballCount = 0;
    Button StrikeButton, BallButton, ExitButton, ResetButton, AboutButton;
    TextView BallText, StrikeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrikeButton = (Button)findViewById(R.id.StrikeButton);
        StrikeText = (TextView) findViewById(R.id.StrikeText);
        BallButton = (Button)findViewById(R.id.BallButton);
        BallText = (TextView) findViewById(R.id.BallText);
        ExitButton = (Button)findViewById(R.id.ExitButton);
        ResetButton = (Button)findViewById(R.id.ResetButton);
        AboutButton = (Button)findViewById(R.id.aboutButton);


        StrikeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                strikeCount ++;
                StrikeText.setText(Integer.toString(strikeCount));
                if(strikeCount == 3){
                    openStrikePage();
                }
            }
        });
        BallButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ballCount ++;
                BallText.setText(Integer.toString(ballCount));
                if(ballCount == 4){
                    openBallPage();
                }
            }
        });
        ResetButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                strikeCount = 0;
                ballCount = 0;
                StrikeText.setText(Integer.toString(strikeCount));
                BallText.setText(Integer.toString(ballCount));
            }
        });

        ExitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.exit(0);
            }
        });
        AboutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAboutPage();
            }
        });




    }
    public void openStrikePage(){
        Intent intent = new Intent(this, StrikePage.class);
        startActivity(intent);
    }
    public void openBallPage(){
        Intent intent2 = new Intent(this, BallPage.class);
        startActivity(intent2);
    }

    public void openAboutPage(){
        Intent intent3 = new Intent(this, About.class);
        startActivity(intent3);
    }

}

