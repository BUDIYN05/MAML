package com.example.maml;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);

        TextView tv1 = findViewById(R.id.textView);
        Button bt4 = findViewById(R.id.button4);
        Button bt5 = findViewById(R.id.button5);
        Button bt6 = findViewById(R.id.button6);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(iPindah1);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iPindah1 = new Intent(MainActivity1.this, MainActivity3.class);
                startActivity(iPindah1);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });
    }
}
