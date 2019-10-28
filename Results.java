package com.example.firstapp;

import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.appcompat.app.AppCompatActivity;

public class Results extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    myRef.addValueEventListener(new ValueEventListener(){

        public void onDataChange(DataSnapshot dataSnapshot){
            String value = dataSnapshot.getValue(String.class);
            Log.d( "Value is: " , value);
        }
        public void onCancelled(DatabaseError error){
            Log.w("Failed to read value.", error.toException());
        }
    });
}}
