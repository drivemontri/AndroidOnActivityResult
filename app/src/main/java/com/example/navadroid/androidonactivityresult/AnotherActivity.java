package com.example.navadroid.androidonactivityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnotherActivity extends AppCompatActivity {

    private static final int RESULT_OK = 0;

    private Button button2;
    private Button button3;

    private boolean key1 = false;
    private boolean key2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key1 = true;
                key2 = false;
                finish();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key1 = false;
                key2 = true;
                finish();
            }
        });
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        if(key1 == true){
            intent.putExtra("returnKey1", "This is an apple.");
        }else if(key2 == true){
            intent.putExtra("returnKey2", "This is a pen.");
        }else{

        }
        setResult(RESULT_OK, intent); //
        super.finish();
    }
}
