package com.example.parksystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public Button main_sign_up,main_sign_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_sign_up=findViewById(R.id.main_sign_up);
        main_sign_in=findViewById(R.id.main_sign_in);
        setlisten();
    }
    private void setlisten() {
        Onclick onClick = new Onclick();
        main_sign_up.setOnClickListener(onClick);
        main_sign_in.setOnClickListener(onClick);
    }
    private class Onclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.main_sign_up:
                    intent=new Intent(MainActivity.this,Sign_up_Activity.class);
                    break;
                case R.id.main_sign_in:
                    intent=new Intent(MainActivity.this,Sign_in_Activity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}