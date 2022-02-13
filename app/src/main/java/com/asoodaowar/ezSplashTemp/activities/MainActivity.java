package com.asoodaowar.ezSplashTemp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.asoodaowar.ezSplashTemp.R;
import com.asoodaowar.ezSplashTemp.adapters.RecyclerViewAdapter;
import com.asoodaowar.ezSplashTemp.models.Title;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private View parent_view;

    /*Array for Titles*/
    String[] array_title={
            "Style 1",
            "Style 2",
            "Style 3",
            "Style 4",
            "Style 5",
            "Style 6",
            "Style 7",
            "Style 8",
            "Style 9",
            "Style 10",
            "Style 11",
            "Style 12",
            "Style 13",
            "Style 14",
            "Style 15",
            "Style 16",
            "Style 17",
            "Style 18",
            "Style 19",
            "Style 20",

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        parent_view = findViewById(android.R.id.content);

        /*toolbar*/
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getString(R.string.app_name));
        setSupportActionBar(toolbar);

        /*recyclerView*/
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        /*ArrayList of Title*/
        List<Title> titleList = new ArrayList<>();

        for(int i=0;i<array_title.length;i++){

            Title title = new Title();
            title.title = array_title[i];

            titleList.add(title);
        }

        /*LinearLayoutManager*/
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        /*RecyclerViewAdapter*/
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,titleList);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        Intent intent;
        switch (id){

            case R.id.action_about:
                intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
