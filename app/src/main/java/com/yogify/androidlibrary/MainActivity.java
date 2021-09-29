package com.yogify.androidlibrary;

import static com.yogify.showbottomsheet.ShowBottomsheet.ShowBottomSheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowBottomSheet(MainActivity.this, R.layout.bottomsheet, R.id.relativelayout);
    }
}