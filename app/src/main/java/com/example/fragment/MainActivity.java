package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moti1(View view) {
        moti mt= new moti();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frame,mt);
        ft.addToBackStack(null);
        ft.commit();

    }

    public void hamid1(View view) {
        hamid hd= new hamid();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frame,hd);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void ruhul1(View view) {
        ruhul rh= new ruhul();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frame,rh);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void mohi1(View view) {
        mohi mi= new mohi();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frame,mi);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void nur1(View view) {
        nur nr= new nur();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frame,nr);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void rouf1(View view) {
        rouf rf= new rouf();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frame,rf);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void mostofa1(View view) {
        mostofa mf= new mostofa();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frame,mf);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void mehedi(View view) {
        mehedi md= new mehedi();
        FragmentManager fm= getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.frame,md);
        ft.addToBackStack(null);
        ft.commit();
    }
}