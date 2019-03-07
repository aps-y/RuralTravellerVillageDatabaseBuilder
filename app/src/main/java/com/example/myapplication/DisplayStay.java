package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DisplayStay extends AppCompatActivity {

    TextView Title,Contact,Address;
    ImageView imageView;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_stay);

        Title= findViewById(R.id.DisplayTitle);
        Contact = findViewById(R.id.DisplayContact);
        Address = findViewById(R.id.DisplayAddress);
        ratingBar = findViewById(R.id.RatingDisplay);

        Intent intent = getIntent();
        Stay stay = (Stay)intent.getSerializableExtra("Obj");

        Title.setText(stay.Name.toUpperCase());
        Contact.setText(String.valueOf(stay.Contact));
        Address.setText(stay.Address);
        ratingBar.setRating(stay.rating);



    }
}
