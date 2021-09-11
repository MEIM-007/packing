package com.example.parksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Sign_up_Activity extends AppCompatActivity {
    public Button sign_up_back,sign_up_summit,sign_up_eye;
    int i=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        sign_up_back=findViewById(R.id.sign_up_back);
        sign_up_summit=findViewById(R.id.sign_up_summit);
        sign_up_eye=findViewById(R.id.sign_up_eye);
        final ImageView sign_up_eye_photo =findViewById(R.id.sign_up_eye_photo);
        final EditText sign_up_passward =findViewById(R.id.sign_up_password);
        sign_up_eye.setOnClickListener(new View.OnClickListener() {//创建点击事件
            @Override
            public void onClick(View view) {
                i++;
                if (i%2==0){
                    sign_up_eye_photo.setImageResource(R.drawable.close_eye);
                    sign_up_passward.setInputType(0x81);
                }else {
                    sign_up_eye_photo.setImageResource(R.drawable.open_eye);
                    sign_up_passward.setInputType(0x90);
                }
            }
        });
        setlisten();
    }
    private void setlisten() {
        Onclick onClick = new Onclick();
        sign_up_back.setOnClickListener(onClick);
        sign_up_summit.setOnClickListener(onClick);
    }
    private class Onclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.sign_up_back:
                    intent=new Intent(Sign_up_Activity.this,MainActivity.class);
                    break;
                case R.id.sign_up_summit:
                    intent=new Intent(Sign_up_Activity.this,Sign_in_Activity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}