package com.example.a9androidlistviewnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listView1;
    ArrayList<TraiCay> arrayList;
    TraiCayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView1 = findViewById(R.id.listView1);
        arrayList = new ArrayList<TraiCay>();
        arrayList.add(new TraiCay("Đào", "Đào Nha Trang", R.mipmap.dao));
        arrayList.add(new TraiCay("Sầu Riêng", "Sầu Riêng TPHCM", R.mipmap.saurieng));
        arrayList.add(new TraiCay("Dừa", "Dừa Bến Tre", R.mipmap.aaa));
        arrayList.add(new TraiCay("Đào", "Đào Nha Trang", R.mipmap.dao));
        arrayList.add(new TraiCay("Sầu Riêng", "Sầu Riêng TPHCM", R.mipmap.saurieng));
        arrayList.add(new TraiCay("Dừa", "Dừa Bến Tre", R.mipmap.aaa));
        arrayList.add(new TraiCay("Đào", "Đào Nha Trang", R.mipmap.dao));
        arrayList.add(new TraiCay("Sầu Riêng", "Sầu Riêng TPHCM", R.mipmap.saurieng));
        arrayList.add(new TraiCay("Dừa", "Dừa Bến Tre", R.mipmap.aaa));
        arrayList.add(new TraiCay("Đào", "Đào Nha Trang", R.mipmap.dao));
        arrayList.add(new TraiCay("Sầu Riêng", "Sầu Riêng TPHCM", R.mipmap.saurieng));
        arrayList.add(new TraiCay("Dừa", "Dừa Bến Tre", R.mipmap.aaa));
        adapter = new TraiCayAdapter(MainActivity.this, R.layout.dong_trai_cay, arrayList);
        listView1.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
