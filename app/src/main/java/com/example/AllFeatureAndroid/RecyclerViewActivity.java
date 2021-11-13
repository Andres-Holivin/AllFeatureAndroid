package com.example.AllFeatureAndroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.AllFeatureAndroid.Model.DummyDataUser;
import com.example.AllFeatureAndroid.Model.User;
import com.example.AllFeatureAndroid.Model.UserAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Vector;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        DummyDataUser user= DummyDataUser.getInstance();

        recyclerView= findViewById(R.id.recycler_view);
        userAdapter= new UserAdapter(user.getUserVector());
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(userAdapter);
        FloatingActionButton addBtn= findViewById(R.id.add_btn);
        addBtn.setOnClickListener(v -> {
            Toast toast = Toast.makeText(getApplicationContext(),"this add button",Toast.LENGTH_SHORT);
            toast.show();

        });


    }
}