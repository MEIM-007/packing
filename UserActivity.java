package com.example.parksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserActivity extends AppCompatActivity {

    public Button user_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        user_back=findViewById(R.id.user_back);
        setlisten();
    }
    private void setlisten() {
        Onclick onClick = new Onclick();
        user_back.setOnClickListener(onClick);
    }
    private class Onclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.user_back:
                    intent=new Intent(UserActivity.this,MainActivity.class);
            }
            startActivity(intent);
        }
    }
}