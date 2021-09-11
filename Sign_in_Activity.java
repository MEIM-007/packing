package com.example.parksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Sign_in_Activity extends AppCompatActivity {

    public Button sign_in_back,summit,here,sign_in_eye;
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        sign_in_back=findViewById(R.id.sign_in_back);
        summit=findViewById(R.id.summit);
        here=findViewById(R.id.here);
        sign_in_eye=findViewById(R.id.sign_in_eye);
        final ImageView sign_in_eye_photo =findViewById(R.id.sign_in_eye_photo);
        final EditText sign_in_passward =findViewById(R.id.sign_in_passward);
        sign_in_eye.setOnClickListener(new View.OnClickListener() {//创建点击事件
            @Override
            public void onClick(View view) {
                i++;
                if (i%2==0){
                    sign_in_eye_photo.setImageResource(R.drawable.close_eye);
                    sign_in_passward.setInputType(0x81);
                }else {
                    sign_in_eye_photo.setImageResource(R.drawable.open_eye);
                    sign_in_passward.setInputType(0x90);
                }
            }
        });
        setlisten();
    }
    private void setlisten() {
        Onclick onClick = new Onclick();
        sign_in_back.setOnClickListener(onClick);
        summit.setOnClickListener(onClick);
        here.setOnClickListener(onClick);
    }
    private class Onclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.sign_in_back:
                    intent=new Intent(Sign_in_Activity.this,MainActivity.class);
                    break;
                case R.id.summit:
                    intent=new Intent(Sign_in_Activity.this,UserActivity.class);
                    break;
                case R.id.here:
                    intent=new Intent(Sign_in_Activity.this,Forget_Activity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}