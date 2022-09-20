package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button btn_second_restore;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_second_restore=findViewById(R.id.btn_second_restore);

        sp = getSharedPreferences("emails",MODE_PRIVATE);


        btn_second_restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name =sp.getString("name","No Name");
                Toast.makeText(SecondActivity.this,name,Toast.LENGTH_LONG).show();
            }
        });
    }
}