package com.example.orderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> modelList;
    RecyclerView recyclerView;
    OrderAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // khởi tạo mảng các items

        modelList = new ArrayList<>();
        modelList.add(new Model("Hu Tieu", getString(R.string.hutieu), R.drawable.hutieu ));
        modelList.add(new Model("Com Tam", getString(R.string.comtam), R.drawable.comtam));
        modelList.add(new Model("Banh Uot", getString(R.string.banhuot), R.drawable.banhuot));
        modelList.add(new Model("Bun Bo Hue", getString(R.string.bunbohue), R.drawable.bunbohue));
        modelList.add(new Model("Bun Cha", getString(R.string.buncha), R.drawable.buncha));
        modelList.add(new Model("Pho", getString(R.string.pho), R.drawable.pho));
        modelList.add(new Model("Che Ba Mau", getString(R.string.chebamau), R.drawable.che3mau));
        modelList.add(new Model("Rau Cau Dua", getString(R.string.raucaudua), R.drawable.raucaudua));
        modelList.add(new Model("Banh Xeo", getString(R.string.banhxeo), R.drawable.banhxeo));

        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);




    }
}