package com.lgx.day0316;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyInstance.getInstance().setContext(this);
        startActivity(new Intent(this,Main2Activity.class));
        finish();

    }
}
