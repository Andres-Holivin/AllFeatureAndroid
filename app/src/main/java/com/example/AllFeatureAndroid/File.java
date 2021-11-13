package com.example.AllFeatureAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class File extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
        editText= findViewById(R.id.editButton);
    }

    public void onClickSave(View view) {
        String text= editText.getText().toString();
        try {
            java.io.File sdCard= Environment.getExternalStorageDirectory();
            java.io.File directory = new java.io.File(sdCard.getAbsolutePath()+"/testAndroid");
            directory.mkdir();
            java.io.File file= new java.io.File(directory,"text.txt");
//            FileOutputStream fileOutputStream =  openFileOutput("text.txt",MODE_PRIVATE);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write(text);
            outputStreamWriter.close();
            Toast.makeText(File.this, "Save Success", Toast.LENGTH_SHORT).show();
            editText.setText("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onClickLoad(View view) {
        try {
            FileInputStream fileInputStream= openFileInput("text.txt");
            Scanner scan= new Scanner(fileInputStream);
            String displayText= scan.nextLine();
//            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//            char[] dataBuffer= new char[100];
//            String displayText="";
//            int readResult;
//
//            while((readResult= inputStreamReader.read(dataBuffer))>0){
//                String temp= String.copyValueOf(dataBuffer,0,readResult);
//                displayText+=temp;
//                dataBuffer=new char[100];
//            }
            Toast.makeText(File.this, "Load Success", Toast.LENGTH_SHORT).show();
            editText.setText(displayText);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}