package com.example.admin.app33_simple_list_view;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener{

    String[] courseNames = {"Android Developer", "ios Developer", "java Developer", "c - Developer", "Web Developer"};

    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

       adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.content_main,courseNames);
       setListAdapter(adapter);

        ListView lstView = getListView();     // this method gets the listView inside the TextView
        lstView.setOnItemClickListener(MainActivity.this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String itemValue = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(MainActivity.this,itemValue,Toast.LENGTH_SHORT).show();
    }
}
