package com.example.a88697.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button confirm = (Button)findViewById(R.id.confirm);
        Bundle bundle = this.getIntent().getExtras();
        Integer age = bundle.getInt("age");
        Integer height = bundle.getInt("height");
        Integer weight = bundle.getInt("weight");
        TextView tv1 = (TextView) findViewById(R.id.highest_heart_text);
        tv1.setText(String.valueOf(220-age));
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });



        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}
