package com.example.loopat.mynanodegreeapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_click_popmovie(View v){
        Toast.makeText(this,"Popular movies Here!",Toast.LENGTH_SHORT).show();
    }
    public void btn_click_stock(View v){
        Toast.makeText(this,"Stock Here!",Toast.LENGTH_SHORT).show();
    }
    public void btn_click_reader(View v){
        Toast.makeText(this,"XYZ Reader Here!",Toast.LENGTH_SHORT).show();
    }
    public void btn_click_news(View v){
        Toast.makeText(this,"News Here!",Toast.LENGTH_SHORT).show();
    }

    public void btn_click_graduate(View v){
        Toast.makeText(this,"My great graduate app Here!",Toast.LENGTH_SHORT).show();
    }
}
