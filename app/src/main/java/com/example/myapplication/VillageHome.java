package com.example.myapplication;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class VillageHome extends AppCompatActivity {

    ViewPager viewPager;
    //LinearLayout linearLayout;
    TextView dotset[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toolbar toolbar = findViewById(R.id.VillageHomeToolbar);
        setSupportActionBar(toolbar);

       // linearLayout = findViewById(R.id.VillageHomeLin);

       /* dotset = new TextView[10];
        for(int i= 0;i<10;i++)
        {
            dotset[i]= new TextView(this);
           dotset[i].setText(".");
            dotset[i].setTextSize(12);
            LinearLayout.LayoutParams params =new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8,0,8,0);
            try{
            linearLayout.addView(dotset[i],params);}
            catch (Exception e)
            {
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
            }
        }
        dotset[0].setTextSize(20);*/

        setContentView(R.layout.activity_village_home);
        viewPager = findViewById(R.id.VillageHomePager);
        PagerAdapt adapt = new PagerAdapt(getSupportFragmentManager());
        viewPager.setAdapter(adapt);


    }




    public void Cicked(View view) {

        switch(view.getId())
        {
            case R.id.StayButton:
startActivity(new Intent(this,StayActivity.class));                break;
            case R.id.ButtonDecr:
                //Toast.makeText(this, "Stay", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,DescriptionActivity.class));
                break;
        }
    }
}
