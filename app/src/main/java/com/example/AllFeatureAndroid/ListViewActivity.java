package com.example.AllFeatureAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.AllFeatureAndroid.Model.DummyDataUser;
import com.example.AllFeatureAndroid.Model.User;
import com.example.AllFeatureAndroid.Model.UserAdapter;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        DummyDataUser user= DummyDataUser.getInstance();
        ListView view= findViewById(R.id.list_view);
        UserAdapter userArrayAdapter= new UserAdapter(user.getUserVector());
        view.setAdapter((ListAdapter) userArrayAdapter);
    }
}