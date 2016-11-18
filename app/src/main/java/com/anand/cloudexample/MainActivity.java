package com.anand.cloudexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.anand.cloudexample.adapters.MainAdapter;
import com.anand.cloudexample.mobil.Drink;

import java.util.ArrayList;

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
    }
}
