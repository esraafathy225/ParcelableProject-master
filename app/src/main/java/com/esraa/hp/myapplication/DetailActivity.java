package com.esraa.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

TextView title,author,date;
RatingBar ratingBar;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        title=findViewById(R.id.title);
        author=findViewById(R.id.author);
        date=findViewById(R.id.date);
        ratingBar=findViewById(R.id.rating);
        img=findViewById(R.id.img);

        Book book=getIntent().getParcelableExtra("bookobject");
        img.setImageResource(book.getImageId());
        title.setText(book.getTitle());
        author.setText(book.getAuthor());
        date.setText(book.getDate());
        ratingBar.setRating(book.getRatingBar());

    }


}
