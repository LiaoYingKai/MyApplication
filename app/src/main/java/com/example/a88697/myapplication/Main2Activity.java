package com.example.a88697.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText age, height, weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText age = (EditText)findViewById(R.id.age);
        final EditText height = (EditText)findViewById(R.id.Height);
        final EditText weight = (EditText)findViewById(R.id.weight);

        Button confirm = (Button)findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer heighttext = Integer.parseInt(height.getText().toString());
                Integer agetext = Integer.parseInt(age.getText().toString());
                Integer weighttext = Integer.parseInt(weight.getText().toString());
                Bundle bundle = new Bundle();
                bundle.putInt("age",agetext);
                bundle.putInt("height",heighttext);
                bundle.putInt("weight",weighttext);

                Intent intent = new Intent();
                intent.setClass(Main2Activity.this,Main3Activity.class);
                intent.putExtras(bundle);
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
