package com.example.myapplication2;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication2.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Имена членов команды
        String[] teamMembers = {"Emil", "Parviz", "Daniya", "Balzhan", "Arailym","Aisha","Mirlan","Yerkhan","Nurzhan","Meitambek","Alikhan","Ruslan","Daniyar","Kuanysh","Zhanserik","Dastan","Aigerim","Zhadiger","Yerkebulan","Dulat","Adiilmurat"};

        // Отображение имен на экране
        StringBuilder names = new StringBuilder();
        for (String member : teamMembers) {
            names.append(member).append("\n");
        }

        TextView textView = findViewById(R.id.textView);
        textView.setText(names.toString());
    }
}
