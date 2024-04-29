package com.example.adaptadoresconclicklistener;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayList<String> data = new ArrayList<>();
        data.add("Elemento 1");
        data.add("Elemento 2");
        data.add("Elemento 3");

        MyAdapter adapter = new MyAdapter(this, data);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem = (String) parent.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this, DetalleActivity.class);
                intent.putExtra("item", selectedItem);
                startActivity(intent);
            }
        });
    }
}

