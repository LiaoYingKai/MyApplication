package com.example.a88697.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button heartratePicture = (Button)findViewById(R.id.HeartRatePicture);
        heartratePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main5Activity.this,Main6Activity.class);
                startActivity(intent);
            }
        });
        Button backtohome = (Button)findViewById(R.id.BacktoHomePage);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main5Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
