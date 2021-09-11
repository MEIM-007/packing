package com.example.parksystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Forget_Activity extends AppCompatActivity {

    public Button forget_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        forget_back=findViewById(R.id.forget_back);
        setlisten();
    }
    private void setlisten() {
         Onclick onClick = new Onclick();
         forget_back.setOnClickListener(onClick);
    }
    private class Onclick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.forget_back:
                    intent =new Intent(Forget_Activity.this,Sign_in_Activity.class);
            }
            startActivity(intent);
        }
    }
}