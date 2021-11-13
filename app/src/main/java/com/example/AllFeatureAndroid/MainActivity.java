package com.example.AllFeatureAndroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rvBtn= findViewById(R.id.recycler_view_btn);
        rvBtn.setOnClickListener(v -> startActivity(
                new Intent(MainActivity.this, RecyclerViewActivity.class)
        ));
        Button lvBtn= findViewById(R.id.list_view_btn);
        lvBtn.setOnClickListener(v -> {
            Toast toast= Toast.makeText(getApplicationContext(),"this list view",Toast.LENGTH_SHORT);
            toast.show();
            startActivity(new Intent(MainActivity.this,ListViewActivity.class));
        });
        Button fileBtn= findViewById(R.id.file_btn);
        fileBtn.setOnClickListener(v -> {
            Toast toast= Toast.makeText(getApplicationContext(),"this list view",Toast.LENGTH_SHORT);
            toast.show();
            startActivity(new Intent(MainActivity.this,File.class));
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.option_setting:
                Toast.makeText(MainActivity.this,"Setting Click",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option_fav:
                Toast.makeText(MainActivity.this,"Favorite Click",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}