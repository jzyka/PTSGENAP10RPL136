package com.example.ptsgenap10rpl136;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);
        addData();
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MenuActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new mahasiswa("Roni", "1298475648757", "081378789063","roni_ro@gmail.com","Manado, 5 Februari 2001"));
        mahasiswaArrayList.add(new mahasiswa("Wiliam", "1298475648758", "085100675891", "wil_iam@gmail.com", "Jambi, 13 Agustus 2000"));
        mahasiswaArrayList.add(new mahasiswa("Marisa", "1298475648759", "082198136785", "marisa@gmail.com", "Tokyo, 3 April 2002"));
        mahasiswaArrayList.add (new mahasiswa("Alina", "1298475648760" , "085287659844", "Alinn@gmail.com", "Palu, 19 September 2000"));
    }
}