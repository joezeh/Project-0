package com.example.joe.project0;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();
    }

    public void initButtons(){
        Button movieBtn = (Button) findViewById(R.id.button_movie);
        Button stockBtn = (Button) findViewById(R.id.button_stock);
        Button buildBtn = (Button) findViewById(R.id.button_build);
        Button materialBtn = (Button) findViewById(R.id.button_material);
        Button ubiquitousBtn = (Button) findViewById(R.id.button_ubiquitous);
        Button capstoneBtn = (Button) findViewById(R.id.button_capstone);

       movieBtn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v) {
               Context context = getApplicationContext();
               CharSequence text = "This button will launch my Popular Movies app!";
               int dur = Toast.LENGTH_SHORT;

               Toast toast = Toast.makeText(context, text, dur);
               toast.show();
           }
       });

        stockBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Stock Hawk app!";
                int dur = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, dur);
                toast.show();
            }
        });

        buildBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Build it Bigger app!";
                int dur = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, dur);
                toast.show();
            }
        });

        materialBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Make Your App Material app!";
                int dur = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, dur);
                toast.show();
            }
        });

        ubiquitousBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Go Ubiquitous app!";
                int dur = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, dur);
                toast.show();
            }
        });

        capstoneBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my Capstone app!";
                int dur = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, dur);
                toast.show();
            }
        });
    }

}
