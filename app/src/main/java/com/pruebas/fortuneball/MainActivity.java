package com.pruebas.fortuneball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String fortuneList[] = {"Don't count on it","Ask againt later","You may rely on it",
            "Without a doubt","Outlook not so good","It0s decididle so","Signs point to yes",
            "Yes definitely","Yes","My sources say NO"};
    TextView mFortuneText;
    Button mGenerateFortuneButton;
    ImageView mFortuneBallImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFortuneText = (TextView) findViewById(R.id.fortuneText);
        mFortuneBallImage = (ImageView) findViewById(R.id.fortunateImage);
        mGenerateFortuneButton = (Button) findViewById(R.id.fortuneButton);

        mGenerateFortuneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int index = new Random().nextInt(fortuneList.length);
                mFortuneText.setText(fortuneList[index]);

                YoYo.with(Techniques.Swing)
                        .duration(500)
                        .playOn(mFortuneBallImage);
            }
        });
    }
}
