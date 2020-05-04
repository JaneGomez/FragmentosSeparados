package com.example.fragmentosseparados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class InfoAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_animal);

        Intent intent = getIntent();
        if (intent != null){
            String animal = getIntent().getStringExtra("animal");
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        InfoAnimalFagment infoAnimalFagment = new InfoAnimalFagment();
        Bundle arga = new Bundle();
        arga.putString("animal",animal);
        infoAnimalFagment.setArguments(arga);

        fragmentTransaction.replace(R.id.fragment_info_animal,infoAnimalFagment);
        fragmentTransaction.commit();
        }
    }
}
