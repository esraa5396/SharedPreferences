package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_save,btn_restore;
    SharedPreferences sp;
    SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_save=findViewById(R.id.btn_save);
        btn_restore=findViewById(R.id.btn_restore);

        //لارجاع مؤشر على الملف العام التابع للتطبيق ككل
        //sp = PreferenceManager.getDefaultSharedPreferences(this);

        sp = getSharedPreferences("emails",MODE_PRIVATE);
        edit = sp.edit();

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.putString("name","Esraa Ahmed");
                edit.apply();
            }
        });

        btn_restore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
//                String name =sp.getString("name","No Name");
//                Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();
            }
        });

    }
}