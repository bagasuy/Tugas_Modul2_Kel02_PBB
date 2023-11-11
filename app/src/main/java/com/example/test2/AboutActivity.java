package com.example.test2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AboutActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);
        initView();

    }

    private void initView() {
        listView = findViewById(R.id.listanggota);
        List<String> list = new ArrayList<>();
        list.add("ABIDA AMALIA SYIFA \n(21120121140142)");
        list.add("RAOUL HABONARAN \n(21120121130053)");
        list.add("FARREL BELVA RAFI IRWANSYAH \n(21120121140147)");
        list.add("Bagas Satrio Unggul Yudho \n( 21120120140163)");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

    }

}
