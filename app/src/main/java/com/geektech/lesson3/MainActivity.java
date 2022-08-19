

package com.geektech.lesson3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        loadData();
        recyclerView.setAdapter(new FoodsAdapter(foods));
    }
    private void loadData(){
        foods=new ArrayList<>();
        foods.add("Vegetable");
        foods.add("Meat");
        foods.add("Bread");
        foods.add("Juice");
        foods.add("Ice cream");
        foods.add("Tea");
        foods.add("Coffee");
        foods.add("Water");
        foods.add("Fruit");
        foods.add("Cola");
        foods.add("Pepsi");

    }
}