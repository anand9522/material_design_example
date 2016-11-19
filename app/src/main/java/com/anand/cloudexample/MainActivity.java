package com.anand.cloudexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.anand.cloudexample.adapters.MainAdapter;
import com.anand.cloudexample.mobil.Drink;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private MainAdapter mAdapter;
    private ArrayList<Drink> mDrinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rs=(RecyclerView) findViewById(R.id.mainrecyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        rs.setLayoutManager(layoutManager);
        mDrinks = new ArrayList<Drink>();
        Drink firstDrink = new Drink();
        firstDrink.comments = "I like water with bubbles most of the time...";
        firstDrink.dateAndTime = new Date();
        mDrinks.add(firstDrink);
        Drink secondDrink = new Drink();
        secondDrink.comments = "I also like water without bubbles. It depends on my mood I guess ;-)";
        secondDrink.dateAndTime = new Date();
        mDrinks.add(secondDrink);

        mAdapter = new MainAdapter(this, mDrinks);
        rs.setAdapter(mAdapter);
    }
}
