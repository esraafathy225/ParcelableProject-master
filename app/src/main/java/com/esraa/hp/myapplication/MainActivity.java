package com.esraa.hp.myapplication;

import android.content.Intent;
import android.preference.PreferenceScreen;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      
        listView = findViewById(R.id.list);


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("One Hundred Years of Solitude ", "by Gabriel García Márquez", R.drawable.solitude, 3.5f, "1992"));
        books.add(new Book("Terra Nostra ", "Carlos Fuentes", R.drawable.nostra, 3, "1980"));
        books.add(new Book("Angels & Demons ", "by Dan Brown", R.drawable.angels, 4, "1990"));
        books.add(new Book("The Sword Thief  ", " by Peter Lerangis", R.drawable.sword, 2, "1993"));
        books.add(new Book("Inferno", "by Dan Brown", R.drawable.inferno, 4.5f, "1985"));
        books.add(new Book("Bloodline ", "by James Rollins", R.drawable.blood, 2, "1960"));
        books.add(new Book("The House of the Spirits ", "by Isabel Allende", R.drawable.spirits, 3, "1983"));
        books.add(new Book("The Hummingbird's Daughter ", "by Luis Alberto Urrea ", R.drawable.humming, 3.5f, "1996"));


        final BookAdapter adapter = new BookAdapter(this, books);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("bookobject",adapter.getItem(i));
                startActivity(intent);
            }
        });

    }
}
