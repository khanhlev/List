package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvThucAn;
    ArrayList<ThucAn> arrayThucAn;
    ThucAnAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anhxa();
        adapter = new ThucAnAdapter(this, R.layout.dong_thuc_an, arrayThucAn);
        lvThucAn.setAdapter(adapter);


    }

    private void Anhxa() {
        lvThucAn = (ListView) findViewById(R.id.listviewThucAn);
        arrayThucAn = new ArrayList<>();

        arrayThucAn.add(new ThucAn("Bún đậu mắm tôm", "Bún đậu Đà Nẵng", R.drawable.bundaumamtom));
        arrayThucAn.add(new ThucAn("Chân gà sả ớt","Đà Nẵng", R.drawable.changasatac));
        arrayThucAn.add(new ThucAn("Bánh tráng trộn","Đà Nẵng", R.drawable.banhtrangtron));
        arrayThucAn.add(new ThucAn("Mỳ cay", "Đà Nẵng", R.drawable.mycay));
        arrayThucAn.add(new ThucAn("Bánh mỳ nướng muối ớt","Đà Nẵng", R.drawable.banhmynuongmuoiot));
    }
}